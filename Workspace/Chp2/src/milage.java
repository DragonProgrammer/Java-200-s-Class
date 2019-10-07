import java.util.Scanner;
public class milage {
public static void main (String[] Arg)
{
	Scanner input = new Scanner(System.in);
	int G = 0, M = 0, TG =0, TM = 0;
	float TPG=0, PG = 0;
	char term = 'Y';
	while (term == 'Y')
	{
		System.out.print("Enter miles traveled ");
		M = input.nextInt();
		TM +=M;
		System.out.print("Enter gallons used ");
		G = input.nextInt();
		TG+=G;
		PG = M/G;
		TPG = TM/TG;
		System.out.print ("The MpG of this trip is ");
		System.out.println (PG);
		System.out.print ("The total MpG of this trip is ");
		System.out.println (TPG);
		System.out.print ("Add another trip? ");
	
		//("%s%d.%n%s%d.%n%n%s", "The MpG of this trip is ", //PG, 
				//"The total MpG of all trips is ", TPG, "Add another trip?");
		term = input.next().charAt(0);
		
	}
}
}