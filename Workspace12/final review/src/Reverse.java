import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of Characters:");
		String For = input.nextLine();
		For.reverse();
		System.out.println(For.toString());
		

	}

}
