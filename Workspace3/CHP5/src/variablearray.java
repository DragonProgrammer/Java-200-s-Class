
public class variablearray {
public static int product(int... multi)
{
	int prod = 1;
	for (int m: multi)
	{prod *=m;}
	return prod;
}
public static void main(String[] arg)
{
	int m1=5, m2=6, m3=2, m4=8;
	System.out.printf("%s %d, %d, %d, %d%n", "The multipliers 1 thru 4 are: ",
			m1, m2, m3, m4);
	System.out.printf("%d X %d = %d%n", m1, m3, product(m1, m3));
	System.out.printf("%d X %d X %d = %d%n", m1, m2, m4, product(m1, m4, m2));
	System.out.printf("%d X %d X %d X %d = %d", m1, m2, m3, m4, product(m1, m2, m3, m4));
}
}
