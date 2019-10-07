import java.util.Scanner;
public class Program2 {
public static void main (String[] args) {
	Scanner input = new Scanner(System.in);
System.out.print("Enter a whole number ");
int A = input.nextInt();
System.out.print("Enter a second number ");
int B = input.nextInt();
if (A > B)
{
	System.out.printf("%d%s", A, " is larger");
}
else if (B > A) 
{
	System.out.printf("%d%s", B, " is larger");
}
else
{
	System.out.print("These numbers are equal");
	}
}
}
