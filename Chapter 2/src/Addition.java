import java.util.Scanner;

public class Addition {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Enter the first int:");
		
		int number1 = input.nextInt();
		
		System.out.println("Enter the second int:");
		
		int number2 = input.nextInt();

		int sum = number1 + number2;
		
		System.out.printf("%d + %d = %d", number1, number2, sum);
	}

}