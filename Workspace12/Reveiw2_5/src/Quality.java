import java.util.Scanner;
public class Quality {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a grade:");
		int Grade = input.nextInt();
		System.out.printf("%s%d", "The point value is ", qualityPoint(Grade));

	}
public static int qualityPoint(int G)
{
	if (G > 89) {return 4;}
	else if (G > 79) {return 3;}
	else if (G > 69) {return 2;}
	else if (G > 59) {return 1;}
	else {return 0;}
	
}
}
