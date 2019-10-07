import java.util.Scanner;
public class Stringstest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of characters:");
		String One = input.nextLine();
		System.out.println("Enter a new line of characters:");
		String two = input.nextLine();
		int S = One.compareTo(two);
		if (S > 0) {System.out.println("The first string is greater than the second lexographicaly");}
		if (S == 0) {System.out.println("The first string is equal to the second lexographicaly");}
		if (S < 0) {System.out.println("The first string is less than the second lexographicaly");}
	}

}
