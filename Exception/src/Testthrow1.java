public class Testthrow1 {
    static void validity(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not valid");
        }
        else
        {
            System.out.println("Valid for vote");
        }
    }
    public static void main(String args[])
    {
        validity(16);
        System.out.println("Rest of the code");
    }
}
