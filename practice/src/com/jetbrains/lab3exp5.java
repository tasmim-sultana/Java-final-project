package com.jetbrains;
import java.util.Scanner;

public class lab3exp5 {
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        String str=sn.nextLine();
        String[] s=str.split(" ");
        String shortest =s[0];
        String longest="";
        for(String s1:s)
        {
            if(s1.length()<shortest.length())
            {
                shortest=s1;
            }
            else if(s1.length()>longest.length())
            {
                longest=s1;
            }
        }
       System.out.println(shortest);
        System.out.println(longest);

    }
}
