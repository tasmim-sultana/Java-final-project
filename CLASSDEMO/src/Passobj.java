class test
{
    int a,b;
    test(int i,int j)
    {
        a=i;
        b=j;
    }
   boolean equals(test o)
   {
       if(o.a==a && o.b==b)
           return true;
       else
           return false;
   }
};
class Passobj
{
    public static void main(String args[])
    {
        test ob1=new test(100,33);
        test ob2=new test(100,33);
        test ob3=new test(33,-1);
        System.out.println("ob1==ob2 :: "+ob1.equals(ob2));
        System.out.println("ob2==ob3 :: "+ob2.equals(ob3));
    }
}