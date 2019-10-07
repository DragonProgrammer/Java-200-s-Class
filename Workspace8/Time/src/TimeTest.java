
public class TimeTest {
public static void main(String[] args) {
	Time2 now= new Time2(10, 5, 1995, 23, 40, 45);
	String U = now.DatetoString() + " " + now.TimetoUniversal();
	String N = now.DatetoString() + " " + now.TimetoString();
	System.out.println(U);
	System.out.println(N);
	now.tick();
	now.nextMin();
	now.nextHour();
	now.nextDay();
	now.nextMonth();
	now.nextYear();
	U = now.DatetoString() + " " + now.TimetoUniversal();
	N = now.DatetoString() + " " + now.TimetoString();
	System.out.println("After incrementing each portion by 1 the new time is:");	
	System.out.println(U);
	System.out.println(N);
}
}
