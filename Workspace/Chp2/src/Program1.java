import java.util.Scanner;
public class Program1 {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter a whole number ");
int A = input.nextInt();
System.out.print("Enter a second number ");
int B = input.nextInt();
int S = A+B;
int D = A-B;
int M = A*B;
int Q = A/B;
int R = A%B;
System.out.printf("%s%d.%n%s%d.%n%s%d.%n%s%d%s%d.","The sum of the two numbers is ", S,
		"THe differance of the two numbers is ", D, "The product of the two numbers is ", M,
		"The quotient of the two numbers is ", Q," with a remander of ", R);
}
}
