
public class Time2 {
public int hour;
public int minute;
public int second;
public int day;
public int month;
public int year;
private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31};
public Time2(int M, int d, int y, int H, int m, int s)
{
day = d;
month= M;
year = y;
hour = H;
minute=m;
second=s;
if (hour < 0||hour >=24) {
	throw new IllegalArgumentException("hour must be 0-23");}
if (hour < 0||hour >=60) {
		throw new IllegalArgumentException("minute must be 0-59");}
if (second < 0||second >=60) {
	throw new IllegalArgumentException("second must be 0-59");
}
if (month <= 0||month >=13) {
	throw new IllegalArgumentException("second must be 1-12");
}
if (day <=0||(day>daysPerMonth[month] && !(month == 2 && day == 29))) {
	throw new IllegalArgumentException("day out of range for the specified month and year");
}
if (month ==2 &&day ==29 && !(year % 400 ==0 || (year % 4 == 0 && year % 100 !=0))) {
	throw new IllegalArgumentException("day out of range for the specified month and year");
}
if (year <=0)
{
	throw new IllegalArgumentException("year must be greater then 0");
}
}
public void tick()
{
	try { 
	Thread.sleep(1000); 
	nextSec(); 
	} catch (InterruptedException e) { 
	e.printStackTrace(); 
	} 
}
public void nextSec() {
	//System.out.println(second);
	second+=1; if (second >60) {second=0; nextMin();}
//System.out.println(second);
}
public void nextMin() { minute+=1; if (minute>60) {minute=0; nextHour();}}
public void nextHour()
{hour+=1; if (hour >23) {hour = 0; nextDay();}}
public void nextDay()
{day+=1;
if (day > daysPerMonth[month]) {day=1; nextMonth();}
}
public void nextMonth() {month+=1; if (month>12) {month=1; nextYear();}

}
public void nextYear() {year+=1;}

public int getH()
{	return hour;}
public int getM()
{return minute;}
public int getS()
{return second;}
public int getMon() {return month;}
public int getY() {return year;}
public int getD() {return day;}
public String TimetoUniversal() {
	return String.format("%02d:%02d:%02d", getH(),getM(),getS());
}
public String TimetoString()
{return String.format("%02d:%02d:%02d %s",((getH() == 0 || getH()==12) ? 12 : getH() % 12), getM(), getS(), (getH() < 12 ? "AM" : "PM"));
}
public String DatetoString()
{return String.format("%d/%d/%d",getMon(), getD(), getY());}
}