/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package problem_58;

/**
 *
 * @author michael 
 */
public class commandline
{
    public static void main(String[] args)
    {
        run jim = new run();
	//System.out.println(jim.setnumlayersTHENrun(4));
        int i =168;
        double test = 50;
        while (test>10.0)
        {
            test = jim.setnumlayersTHENrun(i);
            i++;
            System.out.println(i);
            //System.out.println(test);
        }
      //
    }
}
class run
{
    static int numlayers;
    
    static int arraysize;
    static int targetnumber;
    static int begiing;
    static int rows;
    static int cols;
    static int currentCol;
    static int currentRow;
    static int[][] array;
    static int direction;
    static int isblank;
    //static int count = 1; ///this was left over from when we just wanted to sum the corners
    static int primes;
    static int totalexamined; //// the algorithm never examines 1
    static int num;
    
    public static double setnumlayersTHENrun(int n)
    {
        numlayers = n;
        
        arraysize = numlayers*2+1;
        targetnumber =  ((numlayers*2)-1)*((numlayers*2)-1);
        begiing = (int) Math.floor(arraysize/2);
        rows = arraysize;
        cols = arraysize;
        currentRow = begiing;
        currentCol = begiing;
        array = new int[rows][cols];
        direction = 0;
        isblank = 0;
        //static int count = 1; ///this was left over from when we just wanted to sum the corners
        primes = 0;
        totalexamined = 1;
        return mainly();
    }
    public static double mainly() 
    {
        num = 1;

        array[currentRow][currentCol] = num;
        currentCol++;
        num++;
        array[currentRow][currentCol] = num;
        //fillarray();
        for (int i =0; i<=targetnumber-3;i++) /////1002001;i++)
        {
            //printarray();
            isblank=0;
            if(isrightzero(currentRow,currentCol)){isblank++;}
            if(islefttzero(currentRow,currentCol)){isblank++;}
            if(isupzero(currentRow,currentCol)){isblank++;}
            if(isdownzero(currentRow,currentCol)){isblank++;}
            if(isblank>2){changedirection();}
            move();
            num++;
            array[currentRow][currentCol] = num;
            //printarray();
            //System.out.println();
        }
        currentRow = begiing;
        currentCol = begiing;
        downleftadd(currentRow,currentCol); // down and left
        currentRow = begiing;
        currentCol = begiing;
        upleftadd(currentRow,currentCol); // up and left
        currentRow = begiing;
        currentCol = begiing;
        downrightadd(currentRow,currentCol); //down right
        currentRow = begiing;
        currentCol = begiing;
        toprightadd(currentRow,currentCol);
        //System.out.println(count);
        //System.out.println(primes);
        System.out.println(primes+"/"+totalexamined+" "+((double)primes/totalexamined)*100);
        //System.out.println(((double)primes/totalexamined)*100);
        return ((double)primes/totalexamined)*100;
    }
    public static boolean isPrime(int n) 
    {
    return !new String(new char[n]).matches(".?|(..+?)\\1+");
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
        else {direction++;}
    }
    static void move()
    {
        if (direction == 1){currentRow--;}
        if (direction == 2){currentCol--;}
        if (direction == 3){currentRow++;}
        if (direction == 4){currentCol++;}
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
    static void downleftadd(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow++;
        currentCol--;
        if (array[currentRow][currentCol]==0){return;}
        totalexamined++;
        if (isPrime(array[currentRow][currentCol])){primes++;}
        downleftadd(currentRow, currentCol);
    }
        static void upleftadd(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow--;
        currentCol++;
        if (array[currentRow][currentCol]==0){return;}
        totalexamined++;
        if (isPrime(array[currentRow][currentCol])){primes++;}
        //count = count + array[currentRow][currentCol];
        upleftadd(currentRow, currentCol);
    }
    static void downrightadd(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow--;
        currentCol--;
        if (array[currentRow][currentCol]==0){return;}
        totalexamined++;
        if (isPrime(array[currentRow][currentCol])){primes++;}
        //count = count + array[currentRow][currentCol];
        downrightadd(currentRow, currentCol);
    }
    static void toprightadd(int currentRow, int currentCol)
    {
        //System.out.println(count);
        currentRow++;
        currentCol++;
        if (array[currentRow][currentCol]==0){return;}
        totalexamined++;
        if (isPrime(array[currentRow][currentCol])){primes++;}
        //count = count + array[currentRow][currentCol];
        toprightadd(currentRow, currentCol);
    }
}
