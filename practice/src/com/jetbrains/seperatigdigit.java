package com.jetbrains;
import java.util.Scanner;

public class seperatigdigit {
    private static int []extarctnumber(int num)
    {
        int nums[]= new int [100];
        int i=0;
        do{
            nums[i]=num%10;
            num=num/10;
            i++;
        }while(num>0);
        return nums;
    }
    public static void main(String []args)
    {
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        int array[]=new int [100];
        array=extarctnumber(n);
        for(int i=2;i>=0;i--)
        {
            System.out.print(" "+array[i]);
        }
    }
}
