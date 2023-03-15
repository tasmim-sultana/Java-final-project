import java.util.Scanner;
class exe
{
public static void main(String args[])
{
String st="Hello/this is java class/ for cse 27";
Scanner scanner=new Scanner(st);
System.out.println("Boolean result: "+scanner.hasNextBoolean());
scanner.useDelimiter("/");
System.out.println("---Tokenizes Strings---");
while(scanner.hasNext())
{
System.out.println(scanner.next());
}
System.out.println("Delimiter Used: "+scanner.delimiter());
scanner.close();
}
}