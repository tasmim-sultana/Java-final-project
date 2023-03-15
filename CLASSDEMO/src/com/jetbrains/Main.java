package com.jetbrains;
class box
{
    double weidth ;
    double height;
    double length;
    box(double w, double h, double l)
    {
        this.weidth=w;
        this.height=h;
        this.length=l;
    }
    double volume()
    {
      return weidth*height*length;
    }
}

public class Main {

    public static void main(String[] args) {
	box mybox1=new box(12.3,33.4,11.3);
	box mybox2=new box(22.3,22.3,90.3);
	double vol;
	vol=mybox1.volume();
	System.out.println("Volume is "+vol);
	vol=mybox2.volume();
	System.out.println("Volume is : "+vol);
    }
}
