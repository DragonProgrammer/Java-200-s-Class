
public class DateTest {
public static void main(String[] args) {
	date Now = new date(3, 12, 2017);
	System.out.print("Today is");
	Now.displaydate();
	System.out.println();
	Now.setD(4);
	System.out.print("Tomorrow is");
	Now.displaydate();
}
}
