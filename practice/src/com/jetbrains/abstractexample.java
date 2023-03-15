package com.jetbrains;
abstract class Animal
{
    public abstract void sound();
}
class Dog extends Animal
{
    public void sound()
    {
        System.out.println("ghew");
    }
}

public class abstractexample {
    public static void main(String []args)
    {
        Animal a=new Dog();
        a.sound();
    }
}
