
public class Diamond {
public static void main(String[] arg) {
	for (int line = 1; line <= 9; line++) {
		if (line == 1 || line == 9) {
			for (int num=1; num <=4; num++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
		if (line ==2 || line ==8) {
			for (int num=1; num <=3; num++) {
				System.out.print(" ");
			}
			for (int num =1; num <= 3; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		if (line == 3 || line == 7) {
			for (int num=1; num <=2; num++) {
				System.out.print(" ");
			}
			for (int num =1; num <= 5; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		if (line == 4 || line == 6) {
			System.out.print(" ");
			for (int num =1; num <= 7; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
		if (line == 5)  {
			for (int num =1; num <= 9; num++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
}
