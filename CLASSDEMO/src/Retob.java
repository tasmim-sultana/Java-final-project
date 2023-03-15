class test1
{
    int a;
    test1(int i)
    {
        a=i;
    }
    test1 incrby()
    {
        test1 temp=new test1(a+10);
        return temp;
    }
};
class Retob
{
    public static void main(String args[])
    {
        test1 ob1=new test1(2);
        test1 ob2;
        ob2=ob1.incrby();
        System.out.println("ob1.a:: "+ob1.a);
        System.out.println("obj2.a:: "+ob2.a);
        System.out.println("After second increasement of ob2: ");
        ob2=ob2.incrby();
        System.out.println("ob2:: "+ob2.a);
    }
}
