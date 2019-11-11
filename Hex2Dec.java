import java.util.Scanner;

public class Hex2Dec {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		convertSingleChar2();
	}

private static void convertSingleChar2(){
	System.out.print("Please enter a hex digit: ");
	char c = input.nextLine().toUpperCase().charAt(0);
	int result = c < 'A' ? c % 16 : c % 16 + 9;
	System.out.println("The decimal value of " + c + " is " + result + ".");
	}

private static void convertSingleChar(){
	System.out.print("Please enter a hex digit: ");
	String s = input.nextLine().toUpperCase();
	char c = s.charAt(0); 
	String result = "" + c;
	if (c >= 'A'){
		int value = 10 + c - 'A';
		result = "" + value;
	}
	System.out.println("The decimal value of " + c + " is " + result + ".");

private static void convertNumber(){
	System.out.print("Please enter a hex number: ");
	String s = input.nextLine();
	int value = Integer.parseInt(s, 16);
	System.out.println("The decimal value of " + s + " is " )
}
}