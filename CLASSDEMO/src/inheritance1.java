class A
{
    int i,j;
    void showij()
    {
        System.out.println(" i and j:: "+i+" "+j);
    }
};
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("K:: "+k);
    }
    void sum()
    {
        System.out.println("i+j+k:: "+(i+j+k));
    }
};
class inheritance1
{
    public static void main(String args[])
    {
        A sup=new A();
        B sub=new B();
        sup.i=12;
        sup.j=34;
        sup.showij();
        sub.i=2;
        sub.j=90;
        sub.k=23;
        sub.showij();
        System.out.println();
        sub.showk();
        sub.sum();
    }
}
