package com.jetbrains;
interface  drawable{
    void draw();
}
class Rectangle implements drawable
{
    public void draw()
    {
        System.out.println("Drawing a rectangle");
    }
}
class circle implements drawable
{
   public void draw()
   {
       System.out.println("Drawing a circle");
   }
}

public class testinterface1 {
    public static void main(String []args) {
        drawable d = new Rectangle();
        d.draw();
    }
}
