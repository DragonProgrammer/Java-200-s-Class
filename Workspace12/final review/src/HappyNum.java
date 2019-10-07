
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class HappyNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number greater then 10");
		int F= input.nextInt();
		int Happy=0;
		//int Sad[] = new int[10000];
		int pointH =0;
		double Sad = 0.0;
		while (Happy<8)
		{//System.out.println("here");
		int Num = getSquares(F);
		//System.out.println(Num);
		String N = Integer.toString(Num);
		if (N.endsWith("1")) {
			System.out.println(F); Happy++;}
		else {Sad++;}
	F++;
		}
		double p = Sad/F;
		System.out.printf("%s%d%s%.2f%s", "Out of ", F-10, " numbers, ",p*100, "% were sad");}
		
	
	
	//List<Integer> digits(int i) {
	public static int getSquares (int i)  {
	List<Integer> digits = new ArrayList<Integer>();
	    while(i > 0) {
	        digits.add(i % 10);
	        i /= 10;
	    }
	    int Squares = 0;
	    for (int f =0; f<digits.size(); f++)
	    	{int s = digits.get(f);
	    	Squares += (s*s);}
	    return Squares;
	}
}