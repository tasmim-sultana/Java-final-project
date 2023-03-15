package com.jetbrains;

public class webclass {
    int webage;
    String webname;
    webclass()
    {
        this.webname="Abdul karim";
        this.webage=22;
    }
    webclass(String name, int age)
    {
        this.webname=name;
        this.webage=age;
    }

    public static void main(String []args)
    {
        webclass w1=new webclass();
        webclass w= new webclass("Tasmim Sultana",21);
        System.out.println(w.webname+"  "+w.webage);
        System.out.println(w1.webname+"  "+w1.webage);
    }
}
