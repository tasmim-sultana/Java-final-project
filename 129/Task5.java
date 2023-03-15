import java.util.Scanner;
class Task5
{
public static void main(String args[])
{
 Scanner sn=new Scanner(System.in);
 System.out.println("Enter a string: ");
 String st=sn.nextLine();
 String[] s=st.split(" ");
 String smallest=s[0];
 String largest="";
 for(String s1:s)
   {
    if(s1.length()<smallest.length())
   {
       smallest=s1;
   }
   else if(s1.length()>largest.length())
   { 
      largest=s1;
   }
  }
System.out.println("Smallest word: "+smallest);
System.out.println("Largest word: "+largest);
}
}