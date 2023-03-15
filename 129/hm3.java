public class hm3
{
public static void main(String args[])
{
int per=90;
System.out.println("Average mark is: "+per);
System.out.println("Grade is: ");
if(per>=85)
System.out.println("A");
else if(per<85 && per>=75)
System.out.println("B");
else if(per<75 && per>=65)
System.out.println("C");
else if(per<65 && per>=30)
System.out.println("D");
else
System.out.println("Fail");
}
}