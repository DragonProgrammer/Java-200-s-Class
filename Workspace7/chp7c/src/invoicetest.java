import java.util.Scanner;
public class invoicetest {
	public static void main (String[] arg)
	{
		Scanner imp = new Scanner(System.in);
	System.out.println("Enter the products number, discription, quantity, and price; hitting enter after each.");
	invoice This = new invoice(imp.nextLine(), imp.nextLine(), imp.nextInt(), imp.nextDouble());
	System.out.printf("%s%n%n%s%n%6s%20s%7s%7s%n", "We have recieved your order of the following:", "Product info:",
			"Number", "Description", "Amount", "Price");
	System.out.printf("%6s%20s%7d $%5.2f%n%n%s%.2f.", This.getN(), This.getD(), This.getQ(), This.getP(), 
			"You are required to pay the following amount before we ship: $", This.getinvouceAmount());
	}

}
