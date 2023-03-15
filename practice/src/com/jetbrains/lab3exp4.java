package com.jetbrains;
import java.util.Scanner;

public class lab3exp4 {
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        char cs,ch;
        System.out.print("Enter the string: ");
        String y=sn.nextLine();
        String s=y.toUpperCase();
        for( cs='A';cs<='Z';cs++)
        {
            int f=0;
            for(int i=0;i<s.length();i++)
            {
                ch=s.charAt(i);
                if(ch==cs)
                {
                    f++;
                }
            }
            if(f!=0)
            {
                System.out.println(cs+":"+f);
            }
        }
    }
}
