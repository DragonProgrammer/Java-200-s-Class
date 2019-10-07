import java.util.Scanner;
public class Sales {
public static void main(String[] arg) {
	Scanner input = new Scanner(System.in);
	double sales[][] = new double[5][6];
	for (int i=0; i<4; i++)
	{
		System.out.printf("%s%d%s","Enter the sales of employee ", i+1, ". Press enter between each item.:");
		for (int j =0; j<5; j++) {
			sales[i][j] = input.nextDouble();
			sales[i][5]+=sales[i][j];
			sales[4][j]+=sales[i][j];
		}
	}
	for (int i = 0; i<=4; i++)
	{for (int j = 0; j<=5; j++)
	{System.out.printf("%7.2f",sales[i][j]);
	}
	System.out.println();
	}
}}
