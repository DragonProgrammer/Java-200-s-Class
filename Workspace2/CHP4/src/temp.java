import java.util.Scanner;
public class temp {
	Scanner input = new Scanner(System.in);
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Temperature");
		double temp = input.nextDouble();
		System.out.print("Is this temp in Celsius (1) or Fahrenhieht (2)");
		int type = input.nextInt();
		convert (temp, type);
	}//ends main
private static void convert (double temp, int type) {
	double cel =0, far=0;
	
	if (type == 1) {
		cel= temp;
		System.out.printf("%.2f%s%.2f%s", temp, " degrees Celsius is ", Far(cel), " degrees Fahrenhieht");
	}// ends iff
	if (type == 2) {
		far= temp;
		System.out.printf("%.2f%s%.2f%s", temp, " degrees Fahrenhieht is ", Cel(far), " degrees Celsius");
}//end if
}//end convert
private static double Far(double cel) {
	return 9.0/5.0*cel+32;}// End Far
private static double Cel(double far) {
	return 5.0/9.0*(far-32);
}// end Cel
}// End Temp
