package com.jetbrains;
import java.util.ArrayList;
import java.util.Iterator;

class student
{
    public String name;
    public int  roll;

    public student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class collection1 {
    public static void main(String []args)
    {
        student s1=new student("Tasmim",129);
        ArrayList <String> list1=new ArrayList<>();
        ArrayList list2=new ArrayList();
        list1.add("Adda");
        list1.add("LAvlas");
        list1.add("Java");
        list1.add("Platform");
        list2.add("tasmim");
        list2.add("Sultana");
        list2.add(s1);
        System.out.println("Liast1 is : "+list1);
        System.out.println("List2 is :"+list2);
        String n=list1.get(2);
        System.out.println(n);
        Object o=list2.get(1);
        System.out.println(o);
        if(list1.contains("Adda"))
        {
            System.out.println("Adda is in the list");
        }
        Iterator<String> itr= list1.iterator();
        while ((itr.hasNext()))
        {
            String str= itr.next();
            System.out.println(str);
            if(str.equals("Adda")) {
                itr.remove();
            }
        }
        System.out.println("list1 after remove :"+list1);

    }
}
