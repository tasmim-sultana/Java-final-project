class overloadingdemo
{
        void test()
        {
            System.out.println("No parameter");
        }
        void test(int a)
        {
            System.out.println("A :"+a);
        }
        void test(int a,int b)
        {
            System.out.println("A : "+a+" B : "+b);
        }
        double test(double x,double y)
        {
            System.out.println("X :"+x+" Y : "+y);
            return x*y;
        }
}
class Overloading{
    public static void main(String args[])
    {
        overloadingdemo od=new overloadingdemo();
        double db;
        od.test();
        od.test(4);
        od.test(23,45);
        db=od.test(23.33,45.23);
        System.out.println(db);

    }
}
