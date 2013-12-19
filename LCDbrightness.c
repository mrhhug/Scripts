/* Written by Michael : mrhhug 
 * tested on : 
 *	Manufacturer: ASUSTeK Computer Inc.        
 *	Product Name: K60IJ  */
 
/* when compiling link curses, something like 'gcc -Wall ./LCDbrightness.c -lncurses -o LCDbrightness.out' */
 
#include <stdio.h>
#include <curses.h>
#include <stdlib.h>
#include <unistd.h>
int maxbright; //this gets used over and over and does not change, set in main

int read_max_bright()
{
	//adjust this to your actual file
	char filename[] = "/sys/devices/pci0000:00/0000:00:02.0/drm/card0/card0-LVDS-1/intel_backlight/max_brightness";
	FILE* maxBright = fopen (filename, "r"); //fopen filename
	if (maxBright == NULL) // check for weird errors
	{
		endwin(); // end cureses mode, return the terminal to regular
		printf("Error opening %s\n",filename);
		exit(1);
	}
	int max_bright; //not sure if c will let you return inline
	fscanf (maxBright, "%d", &max_bright); //doing the actual scan
	fclose(maxBright); // close the file
	return max_bright;
}

int read_cur_bright()
{
	//adjust this to your actual file
	char filename[] = "/sys/devices/pci0000:00/0000:00:02.0/drm/card0/card0-LVDS-1/intel_backlight/brightness";
	FILE* curBright = fopen (filename, "r"); //fopen filename
	if (curBright == NULL) // check for weird errors
	{
		endwin(); // end cureses mode, return the terminal to regular
		printf("Error opening %s\n",filename);
		exit(1);
	}
	int cur_bright; //not sure if c will let you return inline
	fscanf (curBright, "%d", &cur_bright); //doing the actual scan
	fclose(curBright); // close the file
	//printw("%d ",cur_bright); //print for testing.
	return cur_bright;
}

void write_brightness(int brightness)
{
	//adjust this to your actual file
	char filename[] = "/sys/devices/pci0000:00/0000:00:02.0/drm/card0/card0-LVDS-1/intel_backlight/brightness";
	FILE *f = fopen(filename, "w");
	if (f == NULL) // check for weird errors
	{
		endwin(); // end cureses mode, return the terminal to regular
		printf("Error opening %s\n",filename);
		exit(1);
	}
	fprintf(f, "%d", brightness); // the actual write
	fclose(f); // close the file
}

void draw()
{
	double curbright = read_cur_bright(); //cast to double for division
	double mbright = maxbright; //cast to double for divivsion
	erase(); // clear window, needed to remove
	move(0,0); // instructions
	printw("Use [up arrow,A] or [down arrow,B] to adjust brightness, q to quit\n");
	move(1,0); // top of bar
	int i; // gcc....
	for(i=0;i<102;i++)
	{
		printw("-");
	}
	move(3,0); // bottome of bar
	for(i=0;i<102;i++)
	{
		printw("-");
	}
	move(2,0); // left edge
	printw("|");
	move(2,101); // right edge
	printw("|");
	
	move(2,1);
	for(i=0;i<curbright/mbright*100;i++) // loop to write progress style #s
	{
		printw("#");
	}
	
	move(4,0); // actual numbers, for general reference
	printw("%.0f of %d : %f %%",curbright,maxbright,curbright/mbright*100);
	refresh();
}

int main(void)
{
	maxbright = read_max_bright();
	if(geteuid() == 0) // only root can change backlight
	{
		initscr(); // Start curses mode
		noecho(); // do not print input to screen
		int cha; // what we will use to catch input	
		int newbrightness; // what we will use to set brightness
		
		while (cha != 'q') //exit on q
		{
			draw();
			cha = getch(); //waits for keyboard input
			if (cha == 65) // up arrow actually sends a set of 3, only looking for last
			{
				newbrightness = read_cur_bright()*1.01; // integer multiplication of 1.01%
				if(newbrightness>maxbright) // do no go above max
				{
					newbrightness=maxbright; // had the multiplacation gone above max, set new brightness to max
				}
				write_brightness(newbrightness); // write to file
			}
			if (cha == 66) // down arrow actually sends a set of 3, only looking for last
			{
				newbrightness = read_cur_bright()*0.99; // integer multiplication of 0.99%
				if(newbrightness>1) // do not go below 1
				{
					write_brightness(newbrightness); // write to file
				}
			}
		}
		endwin(); // end cureses mode, return the terminal to regular
	}
	else
	{
	       	printf("run me as root\n"); // sudo !!
	}
	return 0;
}
