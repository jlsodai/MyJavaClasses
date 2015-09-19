import java.util.Scanner;

public class Calculator{

	static double result, num1, num2;
	static int num3;

	public static double add(double a, double b){
		result = a + b;
		return result;
	}
	public static double subtract(double a, double b){
		result = a - b;
		return result;
	}
	public static double multiply(double a, double b){
		result = a * b;
		return result;
	}
	public static double divide(double a, double b){
		result = a / b;
		return result;
	}
	public static void squareRoot(int a){
		double check;
		double result = a / 2;
		do {
			check = result;
			result = (check + (a / check)) / 2;
		} while ((check - result) != 0);
		System.out.println("Your solution is: " +result);
	}
	// public static double sqrt(double a){
	// 	result = Math.sqrt(a);
	// 	return result;
	// }
	public static double power(double a, double b){
		int y = (int)a;
		int x = (int)b;
		result= 1;
		
		for(int i=1; i<=x; i++ )
		{
			
			result *= y;
			
		}
		return result;
	}
	public static double mod(double a, double b){
		result = a % b;
		return result;
	}
	public static double average(double a, double b){
		result = (a + b) / 2;
		return result;
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("What would you like to do? \n 1. Add \n 2. Subtract \n 3. Multiply \n 4. Divide \n 5. Square Root \n 6. Power \n 7. Modulus \n 8. Average");

		int operation = input.nextInt();

		while (operation < 1 || operation > 8) {
			System.out.println("Please try again:");
			operation = input.nextInt();
		}

		// If correct operation is entered
		if (operation >=1 && operation <= 8) {
			if (operation == 5) {
				System.out.println("Enter Value");
				num3 = input.nextInt();
			} else {
				System.out.println("Enter Value 1:");
				num1 = input.nextDouble();
				System.out.println("Enter Value 2:");
				num2 = input.nextDouble();
			}
		
			switch (operation){
				case 1:
					add(num1, num2);
				break;
				case 2:
					subtract(num1, num2);
				break;
				case 3:
					multiply(num1, num2);
				break;
				case 4:
					divide(num1, num2);
				break;
				case 5:
					squareRoot(num3);
				break;
				case 6:
					power(num1, num2);
				break;
				case 7:
					mod(num1, num2);
				break;
				case 8:
					average(num1, num2);
				break;
				default :
	            System.out.println("Wrong Operation!");
			}
			if (operation != 5) {
				System.out.println("Your solution is: " + result);
			}
		}
		// If wrong operation is entered
		else {
			System.out.println("Wrong Operation!!!");
		}

	}
}