package com.jetbrains;

import java.util.LinkedList;
import java.util.ListIterator;

public class list {
    public static void main(String []args)
    {
        LinkedList<String> list =new LinkedList<>();
        list.add("tasmim");
        list.add("Sultana");
        list.add("Sinthia");
        ListIterator<String> iter= list.listIterator();
        while(iter.hasNext())
        {
            String str=iter.next();
            System.out.println(str);

        }

    }
}
