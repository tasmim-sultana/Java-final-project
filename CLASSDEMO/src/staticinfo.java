class staticinfo
{
    static int a=34;
    static int b;
    static void math(int x)
    {
        System.out.println("A: "+a);
        System.out.println("B ::"+x);
        System.out.println("B :: "+b);
    }
    static
    {
        System.out.println("Static block initialization");
        b=a+45;
    }

    public static void  main(String args[])
    {
        math(23);
    }
}

