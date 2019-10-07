import java.util.Scanner;
public class Project3 {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter a whole number ");
int A = input.nextInt();
System.out.print("Enter a second number ");
int B = input.nextInt();
int R = A%B;
if (R > 0)
{
	System.out.printf("%d%s%d", A, " is not a multiple of ", B);
}
else
{
	System.out.printf("%d%s%d", A, " is a multiple of ", B);
}
}
}
