
public class Test {
public static void main(String[] args) {
	Commision Sue = new Commision("Sue", "Jones", "222-22-222", 10000, .06);
System.out.printf("%S%n%s%n%s%s%n%s%s%n%s%s%n%s%.2f%n%s%.2f","Commision Rate", "Employee data from get methods", "The first name is ", Sue.getFirst(), "THe last name is ", Sue.getLast(), "The SSI is ", Sue.getSSI(),
		"Gross sales is $", Sue.getGross(), "The Commsion rate is ", Sue.getRate());
Sue.setGross(5000); Sue.setRate(.1);
System.out.printf("%n%n%s%n%s%n%n", "THe data from toString", Sue.toString());
BasePlus Bob = new BasePlus("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
System.out.printf("%S%n%s%n%s%s%n%s%s%n%s%s%n%s%.2f%n%s%.2f%n%s%.2f", "Base Plus Commision", "Employee data from get methods", "The first name is ", Bob.getFirst(), "THe last name is ", Bob.getLast(), "The SSI is ", Bob.getSSI(),
		"Gross sales is $", Bob.getGross(), "The Commsion rate is ", Bob.getRate(), "Base salery is $", Bob.getBase());
Bob.setBase(1000);
System.out.printf("%n%n%s%n%s%n%n", "THe data from toString", Bob.toString());
Hourly Tom = new Hourly("Tom", "Swift", "777-77-777", 40, 9.50);
System.out.printf("%S%n%s%n%s%s%n%s%s%n%s%s%n%s%.2f%n%s%.2f","Hourly", "Employee data from get methods", "The first name is ", Tom.getFirst(), "THe last name is ", Tom.getLast(), "The SSI is ", Tom.getSSI(),
		"The hours are", Tom.getH(), "The Wage is ", Tom.getW());
Tom.setHours(45); Tom.setWage(9.00);
System.out.printf("%n%n%s%n%s%n%n", "THe data from toString", Tom.toString());

}
}