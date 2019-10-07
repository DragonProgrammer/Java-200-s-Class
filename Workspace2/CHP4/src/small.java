import java.util.Scanner;
public class small {
	public static void main(String[] arg) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the number of integers you want to process");
int list = input.nextInt();
int smallest = 0;
System.out.print("Enter the integers you want proccessed");
for (int count = 1; count <= list; count++) {
int next = input.nextInt();
	if (count == 1) {
		smallest = next;
	}
	if (next < smallest) {
		smallest= next;
	}
}
System.out.printf("%s%d", "The smallest number is ", smallest);
}
}

