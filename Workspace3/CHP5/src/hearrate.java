import java.util.Scanner;
public class hearrate {//1
	public static void main(String[] arg) {
Scanner input = new Scanner(System.in);
	String firstN, lastN;
	int mm = 0, dd=0, yyyy=0;
	System.out.print("Enter the person's first, enter, then last name, as well as month day and year of birth.");

	public hearrate(String first, String last, int month, int day, int year) {//2
		firstN= first;
		lastN= last;
		mm=month;
		dd=day;
		yyyy=year;
	}//2	
	hearrate myRate = new hearrate(input.nextLine(),input.nextLine(), input.nextInt(), input.nextInt(), input.nextInt());// setting up object

public int age(int mon, int day, int year)
{
	int age=0;
	int Cmon=10, Cday=15, Cyear=2017;
	if (Cmon == mon) 
	{
		if (Cday<=day) 
	{
			age = Cyear-year;}
	
		else {age=Cyear-year-1;}
		}
	else if(Cmon<mon)
	{age = Cyear-year-1;}
	else {age=Cyear-year;}
	return age;
}
int aa = age(mm, dd, yyyy); // getting age
public int maxR(int age)
{return 220-age;}
int MR = maxR(aa); // geting max rate
public String tarR(int max)
{int l = (max*=.5);
int h = (max*=.85);
//String tar = ""
return "Target hart rate is between " +l+ " and " +h+ " beats per minute";
}
String TR = tarR(MR);
}
