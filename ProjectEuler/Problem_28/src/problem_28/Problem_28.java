/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_28;

/**
 *
 * @author michael
 */
public class Problem_28 
{
    static int arraysize = 1007;
    static int begiing = (int) Math.floor(arraysize/2);
    static int rows = arraysize, cols = arraysize;
    static int currentRow = begiing, currentCol = begiing;
    static int[][] array = new int[rows][cols];
    static int direction = 1;
    static int isblank = 0;
    static int count = 1;
    
    public static void main(String[] args) 
    {
        int num = 1;
        
        array[currentRow][currentCol] = num;
        currentCol++;
        num++;
        array[currentRow][currentCol] = num;
        //fillarray();
        for (int i =0; i<1002001;i++) /////1002001;i++)
        {
            isblank=0;
            if(isrightzero(currentRow,currentCol))isblank++;
            if(islefttzero(currentRow,currentCol))isblank++;
            if(isupzero(currentRow,currentCol))isblank++;
            if(isdownzero(currentRow,currentCol))isblank++;
            if(isblank>2)changedirection();
            move();
            num++;
            array[currentRow][currentCol] = num;
            //printarray();
            //System.out.println();
        }
        currentRow = begiing;
        currentCol = begiing;
        downleft(currentRow,currentCol); // down and left
        currentRow = begiing;
        currentCol = begiing;
        upleft(currentRow,currentCol); // up and left
        currentRow = begiing;
        currentCol = begiing;
        downright(currentRow,currentCol); //down right
        currentRow = begiing;
        currentCol = begiing;
        toprightadd(currentRow,currentCol);
        System.out.println(count);
    }
    static boolean isrightzero(int currentRow, int currentCol)
    {
        if (array[currentRow][currentCol+1]==0)
        {
            return true;
        }
        return false;
    }
    static boolean islefttzero(int currentRow, int currentCol)
    {
        if (array[currentRow][currentCol-1]==0)
        {
            return true;
        }
        return false;
    }
    static boolean isupzero(int currentRow, int currentCol)
    {
        if (array[currentRow+1][currentCol]==0)
        {
            return true;
        }
        return false;
    }
    static boolean isdownzero(int currentRow, int currentCol)
    {
        if (array[currentRow-1][currentCol]==0)
        {
            return true;
        }
        return false;
    }
    static void changedirection()
    {
        if (direction==4)
        {
            direction=1;
        }
        else direction++;
    }
    static void move()
    {
        if (direction == 1)currentCol++;
        if (direction == 2)currentRow++;
        if (direction == 3)currentCol--;
        if (direction == 4)currentRow--;
    }
    static void printarray()
    {
        for (int i =0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(" " + array[i][j]);
            }
        System.out.println("");
        }
    }
    /*static void fillarray()
    {
        for (int i =0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                array[i][j]=00;
            }
        }
    }*/
    static void downleft(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow++;
        currentCol--;
        if (array[currentRow][currentCol]==0)return;
        count = count + array[currentRow][currentCol];
        downleft(currentRow, currentCol);
    }
        static void upleft(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow--;
        currentCol++;
        if (array[currentRow][currentCol]==0)return;
        count = count + array[currentRow][currentCol];
        upleft(currentRow, currentCol);
    }
    static void downright(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow--;
        currentCol--;
        if (array[currentRow][currentCol]==0)return;
        count = count + array[currentRow][currentCol];
        downright(currentRow, currentCol);
    }
    static void toprightadd(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow++;
        currentCol++;
        if (array[currentRow][currentCol]==0)return;
        count = count + array[currentRow][currentCol];
        toprightadd(currentRow, currentCol);
    }
}
