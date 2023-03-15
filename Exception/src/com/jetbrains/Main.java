package com.jetbrains;

import java.util.Stack;

public class Main{
    public static void main(String []args)
    {
        Stack<String>  s =new Stack<>();
        s.push("Tasmim");
        s.push("Sultana");
        s.push("Sinthia");
        while(s.size()>0)
        {
            System.out.println(s.pop());
        }
    }
}

