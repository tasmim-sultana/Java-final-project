class A2
{
    int i,j;
    A2(int a,int b)
    {
        i=a;
        j=b;
    }
    void show()
    {
        System.out.println("i and j :: "+i+" "+j);
    }
};
class B2 extends A2{
    int k;
    B2(int m,int n,int c)
    {
        super(m,n);
        k=c;
    }
    void show()
    {
        System.out.println("i and j and K ::"+i+" "+j+" "+k);
    }
};
class Override
{
    public static void main (String args[])
    {
        B2 b=new B2(12,34,56);
        b.show();
    }
}

