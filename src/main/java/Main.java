import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Calculator myCalculator = new Calculator();

		System.out.print("welcome to the calculator \n");
		System.out.print("Enter a command: \n");
		while(true) {
			String command=in.next();

			if (command.equals("add")) {
				int num1=in.nextInt();
				int num2=in.nextInt();
				int result=myCalculator.add(num1, num2);
				System.out.print(result + "\n");
			} else if (command.equals("subtract")) {
				int num1=in.nextInt();
				int num2=in.nextInt();
				int result=myCalculator.subtract(num1, num2);
				System.out.print(result + "\n");
			} else if (command.equals("multiply")) {
				int num1=in.nextInt();
				int num2=in.nextInt();
				int result=myCalculator.multiply(num1, num2);
				System.out.print(result + "\n");
			} else if (command.equals("divide")) {
				int num1=in.nextInt();
				int num2=in.nextInt();
				int result=myCalculator.divide(num1, num2);
				System.out.print(result + "\n");
			} else if (command.equals("fibonacci")) {
				int num1=in.nextInt();
				int result = myCalculator.fibonacciNumberFinder(num1);
				System.out.print(result + "\n");
			} else if (command.equals("binary")) {
				int num1=in.nextInt();
				String result=myCalculator.intToBinaryNumber(num1);
				System.out.print(result + "\n");
			}
		}
	}
}
