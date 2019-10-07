import java.util.Scanner;
public class recTest {
public static void main(String[] args)
{
	Scanner imp = new Scanner(System.in);
	rectangle One= new rectangle();
	System.out.println("Enter a legnth and width between 0.0 and 20.0:");
	One.setL(imp.nextFloat());
	One.setW(imp.nextFloat());
	System.out.printf("%s%.3f.%n%s%.3f.", "The perimiter of this rectange is: ", One.calcperim(),
			"The area of this rectangle is: ", One.calcArea());
	
}
}
