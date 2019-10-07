import java.util.Scanner;
public class smallvalue {
int num=0, small = 0;
Scanner input = new Scanner(System.in);
system.out.print("Enter how many values you want to process");
num = input.nextInt();
for (int count = 1; count <= num; count++)
{
	System.out.print("Enter a number");
	int next = input.nextInt();
	if (count == 1) {
		small = next;
	}
	if (small > next)
	{small = next;
	}
	System.out.println();
}
system.out.printf("%s%d", "THe smallest number is ", small);
}
}
