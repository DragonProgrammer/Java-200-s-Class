import java.util.Scanner;
public class odds { //1
public static void main (String[] Arg) {//2
	Scanner input = new Scanner(System.in);
	System.out.print("eneter a number");
	int side = input.nextInt();
	for (int count =1; count <=side; count++)
	{ //3
		System.out.print("*");
	} //3
	System.out.println();
	if (side-2>0) { //4
		for (int wall = 1; wall <= side-2; wall++) {//5
		System.out.print("*");
		for (int count = 1; count <= side-2; count++) {//6
			System.out.print(" ");
		}//6
		System.out.println("*");
		}//5
	}//4
	for (int count =1; count <=side; count++)
	{
		System.out.print("*");
	}
	}  //2
}//1

