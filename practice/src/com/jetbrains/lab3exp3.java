package com.jetbrains;
import java.util.Scanner;

public class lab3exp3 {
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        System.out.print("Eneter the String: ");
        String s=sn.nextLine();
        System.out.print("Enter the old String to replace: ");
        String old=sn.nextLine();
        System.out.print("Enter the new string: ");
        String n=sn.nextLine();
         String w=s.replace(old,n);
            System.out.print(w);

    }
}
