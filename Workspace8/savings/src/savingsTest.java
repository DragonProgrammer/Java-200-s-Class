
public class savingsTest {
public static void main(String [] args){
	savingsacount saver1 = new savingsacount(2000.00, 0.4);
	savingsacount saver2 = new savingsacount(3000.00, 0.4);
	System.out.printf("%s%.2f%n%s%.2f%n", "After 12 months with an interest rate of .4% the balance of saver1 is: $",
			saver1.newBalance(), "After 12 months with an interest rate of .4% the balance of saver2 is: $",
			saver2.newBalance());
	saver1.modifyInterestRate(.5);
	saver2.modifyInterestRate(.5);
	System.out.printf("%s%.2f%n%s%.2f%n", "After 12 months with an interest rate of .5% the balance of saver1 is: $",
			saver1.newBalance(), "After 12 months with an interest rate of .5% the balance of saver2 is: $",
			saver2.newBalance());}
}
