import java.util.Scanner;
public class ratedriver {//1
	public static void main(String[] arg) 
	{
		
Scanner input = new Scanner(System.in);
System.out.print("Enter the person's first, enter, then last name, as well as month day and year of birth.");
hearrate myRate = new hearrate(input.nextLine(),input.nextLine(), input.nextInt(), 
		input.nextInt(), input.nextInt());
//hearrate myRate= new hearrate("Dan", "Smith", 10, 15, 2000);
System.out.print(myRate.printA());	
}// setting up object
}
