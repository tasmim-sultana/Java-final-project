package com.jetbrains;

public class TestReturnArray {
    static int[]get()
    {
        return new int[]{12,23,45,67,89};
    }
    public static void main(String args[])
    {
        int arr[]=get();
        for(int i:arr)
        {
            System.out.print(i);
            System.out.print("  ");
        }
    }
}
