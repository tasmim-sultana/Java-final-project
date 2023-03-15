import java.util.Scanner;

 class Task3
        {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Source Term:");
		String source = sc.nextLine();

		System.out.println("Enter Search Term:");
		String search = sc.nextLine();
		
		System.out.println("Enter Replace Term:");
		String replace = sc.nextLine();
		
		
		String result = source.replaceAll(search, replace);
		
		System.out.println("Result = "+result);
		
		sc.close();
	}

}