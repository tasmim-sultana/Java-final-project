package com.jetbrains;

public class javaexception {
    public static void main(String []args)
    {
        try
        {
            int a[]=new int[7];
            a[4]=100/0;
            System.out.println("First print statement in try block");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Warning: Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println("Another exception");
        }
        System.out.println("Rest of the code...");

    }
}
