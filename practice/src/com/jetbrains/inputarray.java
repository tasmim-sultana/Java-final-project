package com.jetbrains;
import java.util.Scanner;

public class inputarray {
    public static void main(String []args)
    {
        int s,sum=0;
        Scanner sn= new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=sn.nextInt();
        System.out.println("Enter the array element: ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sn.nextInt();
            sum=sum+a[i];
        }
        int carr[]=a.clone();
        for(int i: carr)
        {
            System.out.println(i);
        }
        System.out.println("Are both equal: ");
        System.out.println(a==carr);
        System.out.println(sum);
    }
}
