package com.jetbrains;

public class breakstatement {
    static void min(int a[])
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
    }
    public static void main(String []args)
    {
        int a[]={13,23,1,23,44};
        min(a);
    }
}
