import java.util.Scanner;

public class Comparison {
	
	private static final Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int number1, number2;

		System.out.println("Enter the first int:");
		
		number1 = input.nextInt();
		
		System.out.println("Enter the second int:");
		
		number2 = input.nextInt();
		
		if(number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);

		
		if(number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);

		
		if(number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);

		
		if(number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
		
		if(number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);

		
		if(number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
	
	}

}
