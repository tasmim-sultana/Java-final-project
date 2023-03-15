class A1
{
    A1()
    {
        System.out.println("Class A constructor");
    }
};
class B1 extends A1
{
    B1()
    {
        System.out.println("Class B constructor");
    }
};
class C extends  B1
{
    C()
    {
        System.out.println("Class C constructor");
    }
};
class extendclass {
    public static void main(String args[]) {
        {
            C c = new C();
        }
    }
}