import java.util.Scanner;
public class Charge {//1
public static void main(String[] args) {//2
	Scanner input = new Scanner(System.in);
	int Ycars =0;
	double Time=0;
	System.out.print("How many cars were there yesterday?");
	Ycars = input.nextInt();
	double total=0;
	for (int count = 1; count<= Ycars; count++) {//3
		System.out.printf("%s%d%s", "How long has car ", count, " been parked?");
		Time = input.nextDouble();
		total+=calculateCharge(Time);
		}//3
	System.out.printf("%n%s%.2f.", "Yesterday's total charges are $", total);
	System.out.printf("%n%n%s","How long has the current driver been parked?");
	Time = input.nextDouble();
	System.out.printf("%n%s%.2f.", "The current custumer has a charge of $", calculateCharge(Time));
}//2
public static double calculateCharge(double Time) {//4
	double charge =0;
		charge+=2.0;
		Time-=3.0;
		if (Time > 0) {//5
			while (Time > 0) {//6
				charge+=0.5;
				Time--;
			}//6
			}//5
		if (charge > 10.0) {//7
			charge = 10.0;}//7
		return charge;
		}//4
	
}//1

