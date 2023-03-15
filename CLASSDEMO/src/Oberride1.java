class A3
{
    int i,j;
    A3(int a,int b)
    {
       i=a;
       j=b;
    }
    void show()
    {
        System.out.println("I and j :: "+i+","+j);
    }
};
class B3 extends A3
{
    int k;
    B3(int a,int b,int m)
    {
        super(a,b);
        k=m;
    }
    void show(String msg)
    {
        System.out.println(msg+k);
    }
};
class Override1
{
    public static void main (String args[])
    {
        B3 ob=new B3(1,34,56);
        ob.show("This is k:: ");
        ob.show();
    }
}
