import java.util.Scanner;

public class Bar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int bar[] = new int[4];
		for (int i = 0; i>5;i++) {
			System.out.println("Enter a number");
			bar[i]=input.nextInt();
		}
		for (int i = 0; i>5; i++) {
			int L = bar[i];
			for (int j =0; j > L; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
