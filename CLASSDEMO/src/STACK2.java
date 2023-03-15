class stackdemo2
{
  private int stck[];
  private int top;
  stackdemo2(int size)
  {
    stck=new int[size];
    top=-1;
  }
  void push(int x)
  {
      if(top==stck.length-1)
      {
          System.out.println("Stack is overflow");
      }
      else
      {
          stck[++top]=x;
      }
  }
  int pop()
  {
      if(top<0)
      {
          System.out.println("Stack is underflow");
          return 0;
      }
      else
      {
          return stck[top--];
      }
  }
};
class STACK2
{
    public static void main(String args[])
    {
        stackdemo2 mystack1=new stackdemo2(4);
        stackdemo2 mystack2=new stackdemo2(6);
        for(int i=0;i<4;i++)
        {
            mystack1.push(i);
        }
        for(int i=0;i<6;i++)
        {
            mystack2.push(i);
        }
        System.out.println("Mystack1 is :");
        for(int i=0;i<4;i++)
        {
            System.out.println(mystack1.pop());
        }
        System.out.println("Mystak2 is");
        for(int i=0;i<6;i++)
        {
            System.out.println(mystack2.pop());
        }
    }
}
