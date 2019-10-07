import java.util.Scanner;
public class employee {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Employees myEmployee = new Employees();
	
	
}

public class Employees {
	private double MonthlySallery;
	private String First;
	private String Last;
	public void setFirst(String First){
		this.First = First;
	}
	public void setLast(String Last){
		this.Last = Last;
	}
	public void setSalery(double MonthlySallery){
		if (MonthlySallery>=0.0) {
		this.MonthlySallery = MonthlySallery;}
	}
	public String getFirst() {
		return First;
	}
	public String getLast() {
		return Last;
	}
	public double getSalery() {
		if (MonthlySallery >= 0.0) {
		return MonthlySallery;}
		else 
			{return 0.0;}
	}
}

public class EmplyeeTest{
	Employees test= new Employees();
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the employee's first name, last name and monthly salary. After entering each, hit enter.");
	String First = input.nextLine();
	test.setFirst(First);
	String Last = input.nextLine();
	test.setLast(Last);
	double MonthlySallery = input.nextDouble();
	test.setSalery(MonthlySallery);
	System.out.printf("%s%s%n%s%s%n%s%.2f", "The first name is ", test.getFirst(), "the Last name is ", test.getLast(),
			"the monthly salery is $", test.getSalery());
}
}
