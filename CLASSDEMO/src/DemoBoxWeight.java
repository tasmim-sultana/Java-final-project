class box
{
    double width;
    double height;
    double depth;
    box(box bo)
    {
        width=bo.width;
        height=bo.height;
        depth=bo.depth;
    }
    box(double w,double h,double d)
    {
       width=w;
       height=h;
       depth=d;
    }
    box(double len)
    {
        width=height=depth=len;
    }
    box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    double volume()
    {
        return width*height*depth;
    }
};
class BoxWeight extends box
{
    double mass;
    BoxWeight(BoxWeight ob)
    {
        super(ob);
        mass=ob.mass;
    }
    BoxWeight(double w,double h,double d,double m)
    {
        super(w,h,d);
        mass=m;
    }
    BoxWeight(double len,double m)
    {
        super(len);
        mass=m;
    }
    BoxWeight()
    {
        super();
        mass=-1;
    }
};
class DemoBoxWeight
{
    public static void main(String args[])
    {
        BoxWeight mybox1=new BoxWeight(10,20,15,34.5);
        BoxWeight mybox2=new BoxWeight(23,44.5,33.4,55);
        BoxWeight mybox3 =new BoxWeight(33.3,12);
        BoxWeight mybox4=new BoxWeight(mybox1);
        double vol;
        vol=mybox1.volume();
        System.out.println("Volume of first box is:"+vol);
        System.out.println("Weight of first box is: "+mybox1.mass);
        vol=mybox2.volume();
        System.out.println("Volume of second box is: "+vol);
        System.out.println("Weight of second is: "+mybox2.mass);
        vol=mybox3.volume();
        System.out.println("Volume of third box is :: "+vol);
        System.out.println("Weight of third box:: "+mybox3.mass);
        vol=mybox4.volume();
        System.out.println("Volume of fourth box is: : "+vol);
        System.out.println("Weight of fourth box is:: "+mybox4.mass);
    }
}
