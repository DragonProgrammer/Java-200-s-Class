import java.util.Scanner;

public class EmployeesTest{
	public static void main(String[] args) {
	Employees test= new Employees();
	Employees test2 = new Employees();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first employee's first name, last name and monthly salary. After entering each, hit enter.");
	String First = input.nextLine();
	test.setF(First);
	String Last = input.nextLine();
	test.setL(Last);
	double MonthlySallery = input.nextDouble();
	test.setS(MonthlySallery);
	System.out.print("Enter the second employee's first name, last name and monthly salary. After entering each, hit enter.");
	String First2 = input.nextLine();
	test2.setF(First2);
	String Last2 = input.nextLine();
	test2.setL(Last2);
	input.nextLine(); // somehow input is reading something after I put in the name and before i can enter salary
	// enter another line clears this pro.
	double MonthlySallery2 = input.nextDouble();
	test2.setS(MonthlySallery2);
	System.out.printf("%s%s%n%s%s%n%s%.2f", "The first employess's first name is ", test.getF(), "the Last name is ", test.getL(),
			"the monthly salery is $", test.getS());
	System.out.printf("%s%s%n%s%s%n%s%.2f", "The second employee's first name is ", test2.getF(), "the Last name is ", test2.getL(),
			"the monthly salery is $", test2.getS());
	System.out.println("Each employee gets a %10 raise.");
	System.out.printf("%s%.2f%n%s%.2f%n", "The first employees new salary is: $", test.raise(), "The second employees new salary is: $", test2.raise());
	
}}
