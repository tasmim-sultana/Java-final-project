package com.jetbrains;
import java.util.Scanner;

public class lab1exp2 {
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sn.nextInt();
        int b=n;
        for(int i=1;i<=n/2;i++)
        {
            System.out.print(i+"  "+b+"  ");
            b--;
        }

    }
}
