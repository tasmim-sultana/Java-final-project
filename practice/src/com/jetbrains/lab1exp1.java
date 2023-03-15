package com.jetbrains;
import java.util.Scanner;

public class lab1exp1 {
    public static void main(String []args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int x,y;
        x=sn.nextInt();
        y=sn.nextInt();
        for(int i=x;i<=y;i++)
        {
            if((i%3)==0 && (i%5)!=0)
            {
                System.out.print("  "+i);
            }
            if((i%3)!=0 && (i%5)==0)
            {
                System.out.print("  "+i);
            }
        }
    }
}
