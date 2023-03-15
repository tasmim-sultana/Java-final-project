package com.jetbrains;
class Point2D
{
    private float x;
    private float y;
    public Point2D()
    {

    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
   public void setxy (float x,float y)
   {
       this.x=x;
       this.y=y;
   }
   public float [] getxy()
   {
       float a[] =new float[2];
       a[0]=x;
       a[1]=y;
       return a;
   }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
class Point3D extends Point2D
{
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setxyz(float x,float y,float z)
    {
        setxy(x,y);
        this.z=z;
    }
    public float [] getxyz()
    {
        float a[]=new float[3];
        a=getxy();
        a[2]=z;
        return a;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                "} " + super.toString();
    }
}

public class lab5exp1 {
    public static void main(String args[])
    {
        Point3D p=new Point3D(1,2,3);
        System.out.println(p.toString());

    }
}
