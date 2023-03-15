class stack
{
    int stck[]=new int[10];
    int top;
    stack()
    {
        top=-1;
    }
    void push(int value)
    {
        if(top>=10)
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            stck[++top]=value;
        }
    }
    int pop()
    {
        if(top<0)
        {
            System.out.println("Stack is overflow");
            return 0;
        }
        else
        {
            return stck[top--];
        }
    }
};
class MYSTACK {


    public static void main(String args[]) {
        stack mystack1 = new stack();
        stack mystack2 = new stack();
        for (int i = 0; i < 10; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
        System.out.println("Mystack1 is : ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Mystack2 is : ");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}
