import java.util.Scanner;
public class StringComp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line of characters:");
		String One = input.nextLine();
		System.out.println("Enter a new line of characters:");
		String two = input.nextLine();
		System.out.println("Enter how many characters to compare:");
		int num = input.nextInt();
		System.out.println("Enter where to start:");
		int S = input.nextInt();
		if(One.regionMatches(true, S, two, S, num)) {System.out.printf("%s%d%s%d%s", "The ", num, " characters after character ", S-1, " match.");}
		else {System.out.printf("%s%d%s%d%s", "The ", num, " characters after character ", S-1, " do not match.");}
		

}}
