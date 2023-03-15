public class Stringdemo {
    public static void main(String args[])
    {
        String str1="First string";
        String str2="Second String";
        String str3=str1;
        System.out.println("Length of Str1 is:: "+str1.length());
        System.out.println("Character at index 3 is :: "+str1.charAt(3));
        if(str1.equals(str2))
        {
            System.out.println("Str1==str2");
        }
        else
        {
            System.out.println("str1!=str2");
        }
        if(str1.equals(str3))
        {
            System.out.println("str1==str3");
        }
        else
        {
            System.out.println("Str1!=str2");
        }
    }
}
