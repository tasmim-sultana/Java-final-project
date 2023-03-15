package com.jetbrains;
import java.util.Scanner;

public class lab3exp2 {
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=sn.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                char c=s.charAt(j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
