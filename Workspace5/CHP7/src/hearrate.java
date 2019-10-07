public class hearrate {//1
	//2	
	public String firstN, lastN;
	public int mm, dd, yyyy;
	

	public hearrate(String first, String last, int month, int day, int year) {//2
		firstN= first;
		lastN= last;
		mm=month;
		dd=day;
		yyyy=year;
	}
	
	public String getF()
	{return firstN;}
	public String getL()
	{return lastN;}
	public int getM()
	{return mm;}
	public int getD()
	{return dd;}
	public int getY()
	{return yyyy;}
	
	public int age()
{	//System.out.print(mm + " " + dd+ " " + yyyy); debuging check, problem found in method call in ratedriver.
		//Calling printA with other ints being done outside method did not establish those ints. moved them into method
	int Cmon=10, Cday=16, Cyear=2017;
	if (Cmon == mm) 
	{
		if (Cday<=dd) 
	{
			return Cyear-yyyy;}
	
		else {return Cyear-yyyy-1;}
		}
	else if(Cmon<mm)
	{ return Cyear-yyyy-1;}
	else {return Cyear-yyyy;}
	//return Age;
}
int aa = age(); // getting age
public int maxR(int age)
{return 220-age;}
//int MR = maxR(age()); // geting max rate
public String tarR(int max)
{int l = (max/2);
int h = (max*=.85);
return "Target heart rate is between " +l+ " and " +h+ " beats per minute";
}
//String TR = tarR(MR);

public String printA()
{
	int MR = maxR(age()); // geting max rate
	String TR = tarR(MR);

String A = firstN+ " " +lastN+ String.format("%n");
String B = "Born:" +mm+ "/"+dd+"/"+yyyy+ String.format("%n");
String C = "Age: " +age()+ String.format("%n");
String D = "Max Heart Rate:" +MR+ String.format("%n");
return A + B + C + D +TR;
}
}
