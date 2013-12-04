package derivative;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Stack;

public class Derivative
{
    public static int precedence(char a)
    {
        if (a=='+')
            return 2;
	if (a=='-')
            return 2;
	if (a=='*')
            return 3;
        if (a=='/')
            return 3;
        if (a=='%')
            return 3;
	if (a=='(')
            return 1;
	if (a=='^')
            return 4;
        return 0;
	}
    public static Stack tostack(Queue queue)
    {
        Stack stack1=new Stack<String>();
        while(queue.peek()!=null)
        {
            stack1.push(queue.remove());
        }
        Stack stack2=new Stack();
        int ss = (stack1.size());
        for (int i = 0; i < ss; i++)
        {
            String e = (String) stack1.pop();
            stack2.push(stack1.pop());
        }
            System.out.println();
            System.out.println("tostack");
            System.out.println();
            System.out.println(stack2);
            return stack2;
    }
    public static String replaceCharAt(String s, int pos, char c)
    {
        return s.substring(0,pos) + c + s.substring(pos+1);
    }
    public static double calc(Queue<String> queue)
    {

        Stack<Double> stack=new Stack();
        int ss =queue.size();
        double result = 0;
        double current;
        double temp;
        String next = queue.remove();
        for (int i = 0; i <= ss; i++)
        {
            while (next.contains("0")||next.contains("1")||next.contains("2")||next.contains("3")||next.contains("4")||next.contains("5")||next.contains("6")||next.contains("7")||next.contains("8")||next.contains("9"))
            {
                if (next.contains("_"))
                {
                    if ('_'==next.charAt(0)){next=replaceCharAt(next,0,'-');}
                    if ('_'==next.charAt(1)){next=replaceCharAt(next,1,'-');}
                }
                current = Double.parseDouble(next);
                stack.push(current);
                next = queue.remove();
                if (next == null){return result;}
            }
            if (next.contains("+"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = temp+current;
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
            if (next.contains("-"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = temp-current;
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
            if (next.contains("*"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = temp*current;
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
            if (next.contains("/"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = temp/current;
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
            if (next.contains("%"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = temp%current;
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
            if (next.contains("^"))
            {
                current = stack.pop();
                temp = stack.pop();
                result = Math.pow(temp,current);
                stack.push(result);
                try{next = queue.remove();} catch(NoSuchElementException zz){return result;}
                if (next == null){return result;}
            }
       }
       return result;
    }
    public static Queue<String> combinenumbers(Queue<String> queue)
    {
        Queue queue2=new LinkedList<>();
        @SuppressWarnings("UnusedAssignment")
        String temp = queue.peek();
        @SuppressWarnings("UnusedAssignment")
        String next = queue.peek();
        int ss = (queue.size());
        for (int i = 0; i < ss; i++)
        {
            if (i==ss-1)
            {
                queue.add(" ");
            }
            queue.add(queue.remove());
        }

        for (int i = 0; i <= ss; i++)
	{
            try{temp = queue.remove();} catch(NoSuchElementException zz){return queue2;}
            try{next = queue.peek();} catch(NoSuchElementException zz){return queue2;}
            if (temp.equals(".")||temp.equals("_")||temp.equals("0")||temp.equals("1")||temp.equals("2")||temp.equals("3")||temp.equals("4")||temp.equals("5")||temp.equals("6")||temp.equals("7")||temp.equals("8")||temp.equals("9"))
            {
                while (!next.equals(" ")&&!next.equals("+")&&!next.equals("*")&&!next.equals("-")&&!next.equals("/")&&!next.equals("%")&&!next.equals("^"))
                {
                    temp = temp+queue.remove();
                    next = queue.peek();
                    i++;
                }

            }
        queue2.add(temp);
        }
	//System.out.println(queue2);
        return removespaces(queue2);
    }
    public static Queue<String> removespaces(Queue<String> queue)
    {
        Queue queue2=new LinkedList<>();
        @SuppressWarnings("UnusedAssignment")
        String temp = queue.peek();
        String next = queue.peek();
        int ss = (queue.size());
	for (int i = 0; i < ss; i++)
	{
            try{temp = queue.remove();} catch(NoSuchElementException zz){return queue2;}
            if (temp.equals(" "))
            {
                try{temp = queue.remove();} catch(NoSuchElementException zz){return queue2;}

            }
            queue2.add(temp);
	}
        return queue2;
    }
    public static double evaluate(String UserInput)
    {
        //Scanner scan=new Scanner (System.in);
	Queue queue=new LinkedList<>();
	Stack stack=new Stack<>();

	//System.out.println("Please type in something to calculate(order of operations respected)");
	//System.out.println("Please use underscore(_) to denote negative numbers");
	UserInput = UserInput.replaceAll(" ", "");

	for (int i = 0; i < UserInput.length(); i++)
	{
            char c = UserInput.charAt(i);
            @SuppressWarnings("UnusedAssignment")
            char e = ' ';
            if (i<UserInput.length()-1)
            {
                e = UserInput.charAt(i+1);
            }
		else e =' ';
		switch (c)
		{
                    case '0': c='0';break;
                    case '9': c='9';break;
                    case '8': c='8';break;
                    case '7': c='7';break;
                    case '6': c='6';break;
                    case '5': c='5';break;
                    case '4': c='4';break;
                    case '3': c='3';break;
                    case '2': c='2';break;
                    case '1': c='1';break;
                    case '(': c='(';break;
                    case ')': c=')';break;
                    case '/': c='/';break;
                    case '*': c='*';break;
                    case '%': c='%';break;
                    case '-': c='-';break;
                    case '+': c='+';break;
                    case '_': c='_';break;
                    case '^': c='^';break;
                    case '.': c='.';break;
                    default : c='c';break;
                }
                if (c=='c'){System.out.println("This is a single variable function evaluater");System.exit(1);}

                String cc = Character.toString(c);
                String ee = Character.toString(e);
                if (c=='_'){queue.add(cc);}
                if (c=='('){stack.push(c);}

                if (c=='.'||c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9')
                {
                    queue.add(cc);
                    if (e=='-'||e=='+'||e=='*'||e=='/'||e=='%'||e=='('||e=='('||e=='^')
                    {
                        queue.add(" ");
                    }
                }
                if (c=='-'||c=='+'||c=='*'||c=='/'||c=='%'||c=='^')
                {
                    if (e=='-'||e=='+'||e=='*'||e=='/'||e=='%'||e=='^')
                    {
                        System.out.println("You put 2 operators together....fail");
                        System.exit(1);
                    }
                    if (stack.isEmpty())
                    {
                        stack.push(c);
                    }
                    else
                    {
                        int p = precedence((Character) stack.peek());
                        while (precedence(c)<=p)
                        {
                            queue.add(stack.pop()+"");
                            try
                            {
                                p = precedence((Character) stack.peek());
                            }
                            catch (RuntimeException f)
                            {
                                p = 0;
                            }
                        }
                        stack.push(c);
                    }
                }

                if (c==')')
                {
                    //if (c!=')'){queue.add(c);}
                    while (c!='(')
                    {

                        c=(Character)stack.pop();
                        queue.add(Character.toString(c));
                        c=(Character)stack.peek();
                    }
                    stack.pop();
                }
     	}
        int ss = (stack.size());
	for (int i = 0; i < ss; i++)
	{
            char c = (Character)stack.pop();
            String cc = Character.toString(c);
            if (c!='('){queue.add(cc);}
	}
       	//queue.add(' ');

        /*
	System.out.println();
	System.out.println("now your correctly queued postfix expresion");
	//System.out.println(queue);
                */
        queue = (combinenumbers(queue));
        /*
	System.out.println(queue);
        System.out.println();
        System.out.println("and your result...");
        System.out.println(calc(queue));
                */
        return calc(queue);
    }
    public static String suboutX(String str,String num)
    {
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)=='x' || str.charAt(i)=='X')
            {
                if(i==0)
                {
                    str=num+str.substring(1, str.length());
                    i+=num.length();
                }
                else
                {
                    if(precedence(str.charAt(i-1))!=4)
                    {
                        String newstring="";
                        newstring=str.substring(0, i);
                        newstring+="*";
                        newstring+=num;
                        newstring+=str.substring(i+1,str.length());
                        str=newstring;
                        i+=3;
                    }
                    else
                    {
                        str=str.substring(0, i)+"*"+num+str.substring(i+1,str.length()-1);
                    }
                }
            }
        }
        return str;
    }
    
    public static void print2dArray(double[][] array)
    {
        for (int i =0 ; i<array.length;i++)
        {
            System.out.println(array[i][0]+" "+array[i][1]);
        }
    }
    public static void doit()
    {
        String function = "5x^3+6x^2";
        int bounds =1;
        int deltaX = 100; ///must be at least 1
        int deltacount =0;
        double[][] derivative = new double[deltaX*2+1][2];
        //System.out.println("erererer");
        //System.out.println(suboutX("4x+5","2"));
        //System.out.println(evaluate("4+5"));
        for(int i=bounds*deltaX;i>0;i--)
        {
            //System.out.print("-"+(double)i/deltaX+" ");
            derivative[deltacount][0]=(double)i/deltaX*-1;
            //System.out.println(evaluate(suboutX(function,"_"+(double)i/deltaX)));
            derivative[deltacount][1]=evaluate(suboutX(function,"_"+(double)i/deltaX));
            deltacount++;
        }
        for(int i=0;i<=bounds*deltaX;i++)
        {
            //System.out.print((double)i/deltaX+" ");
            derivative[deltacount][0]=(double)i/deltaX;
            //System.out.println(evaluate(suboutX(function,Double.toString((double)i/deltaX))));
            derivative[deltacount][1]=evaluate(suboutX(function,Double.toString((double)i/deltaX)));
            deltacount++;
        }
        print2dArray(derivative);
        
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream out = new PrintStream(new FileOutputStream("data.dat"));
        System.setOut(out);
        doit();
    }

}