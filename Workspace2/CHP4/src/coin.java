import java.util.Scanner;
import java.security.SecureRandom;
public class coin {//1
	public static void main(String[] args) {//2
	Scanner input = new Scanner(System.in);
	int choice = 0;
	System.out.printf("%s%n%s%n%s", "What dou you want to do:", "1) Toss Coin", "2) End Program");
	choice = input.nextInt();
	while (choice ==1) {//3
		Coins C = Coins.flip();
		System.out.println(C);
		System.out.print("Now what do you want to do?");
		choice = input.nextInt();
	}
}
enum Coins 
{Head, Tail; 
		static SecureRandom Rand = new SecureRandom();
		static Coins flip() { 
		return Rand.nextBoolean() ? Head : Tail;
		}
}
}
