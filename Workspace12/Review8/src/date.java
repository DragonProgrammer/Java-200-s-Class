
public class date {
public int day, month, year;
	public date(int d, int m, int y) {
		day = d;
		month=m;
		year = y;}
	public void setD(int d) { day =d;}
	public void setM(int m) {month=m;;}
	public void setY(int y) { year = y;}
	public int getD() {return day;}
	public int getM() {return month;}
	public int getY() {return year;}
	public void displaydate() {
		System.out.printf("%d/%d/%d", getM(), getD(), getY());}
	
}

