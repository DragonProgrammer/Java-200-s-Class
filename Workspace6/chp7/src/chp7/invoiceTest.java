import java.util.Scanner;
public class invoiceTest {
	public static void main (String[] arg)
	{Scanner imp = new Scanner(System.in);
	System.out.println("Enter the products number, discription, quantity, and price; hitting enter after each.");
	invoice this = new invoice(imp.nextLine(), imp.nextLine(), imp.nextInt(), imp.nextDouble);
	System.out.printf("%s%n%n%s%n%6s%20s%6s%6s%n", "We have recieved your order of the following:", "Product info:",
			"Number", "Description", "Price", "Amount");
	System.out.printf("%6s%20s%6d$%6.2f%n%n%s%.2f.", this.getN(args), this.getD(), this.getQ(), this.getP(), 
			"You are required to pay the following amount before we ship: $", this.getinvouceAmount());
	}

}
