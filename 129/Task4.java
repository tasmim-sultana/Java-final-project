import java.util.Scanner;
class Task4
{
public static void main(String args[])
{
  Scanner sn=new Scanner(System.in);
 int a[]=new int [26];
  System.out.println("Enter the string : ");
  String st=sn.nextLine();
for( int i=0;i<st.length();i++)
{
  if(st.charAt(i)>=65 && st.charAt(i)<=90)
   {
      a[st.charAt(i)-65]++;
   }
  if(st.charAt(i)>=97 && st.charAt(i)<=122)
  {
    a[st.charAt(i)-97]++;
  }
}
for(int i=0;i<26;i++)
{
  if (a[i]>0)
   {  
     System.out.println((char)(i+65)+":  "+a[i]);
    }
}
}
}