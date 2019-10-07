import java.util.Scanner;
public class smallest {
public static void main (String[] arg) {
	Scanner input = new Scanner(System.in);
	double prod1 = 2.98, prod2 = 4.5, prod3 = 9.98, prod4 = 4.49, prod5 = 6.87,
			end1=0, end2=0,end3=0, end4=0, end5=0;
	int quan1 = 0, quan2 =0, quan3=0, quan4 =0, quan5=0, sale =0, end = 1, vol=0;
	while (end == 1)
	{
	System.out.print("Enter a product number and number sold, seperate with a space1");
	sale = input.nextInt();
	vol = input.nextInt();
	//System.out.println(vol); test if it got each int
	switch (sale){
	case 1:
		quan1+=vol;
		break;
	case 2:
		quan2+=vol;
		break;
	case 3:
		quan3+=vol;
		break;
	case 4:
		quan4+=vol;
		break;
	case 5:
		quan5+=vol;
		break;
	default:
	System.out.println("We do not sell that item please try again.");
	break;
}
	vol = 0;
	sale=0;
	System.out.print("Do you want to go again (1 for yes, 2 for no)?");
	end = input.nextInt(); // why is nextChar() not working?
	}

	end1 = quan1*prod1;
	end2 = quan2*prod2;
	end3 = quan3*prod3;
	end4 = quan4*prod4;
	end5 = quan5*prod5;
System.out.printf("%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n", "Finale sales for item 1 is ", end1, "Finale sales for item 2 is ", end2,
		"Finale sales for item 3 is ", end3,"Finale sales for item 4 is ", end4, "Finale sales for item 5 is ", end5);		
	}
}

