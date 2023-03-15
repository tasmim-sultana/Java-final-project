package com.jetbrains;
import java.util.Scanner;

public class inputcharacterarray {
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("First enter some character: ");
        char a[]=sn.next().toCharArray();
        System.out.println("Elements: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }
}
