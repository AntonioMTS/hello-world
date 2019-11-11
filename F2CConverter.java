import java.util.Scanner;

public class F2CConverter {
	public static void main(String[] args) {
		System.out.print("Enter the temperature in Fahrenheit: ");
		Scanner input = new Scanner(System.in);
		double degreesFahrenheit = input.nextDouble();
		double celsius = (5.0 / 9.0) * (degreesFahrenheit - 32); // if you do 5/9 it will = 0 so need to make it a double 
		System.out.printf("That is %.2f degrees celsius.", celsius);
	}
}