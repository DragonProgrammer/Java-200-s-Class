import java.util.Random;
public class DiceTest {

	public static void main(String[] args) {
		System.out.println("start");
		Random D6 = new Random();
		int result[] = new int[13];
		for (int i = 0; i<36000000; i++) {
			//System.out.println("Here");
			int DF = D6.nextInt(6)+1;
			int DS = D6.nextInt(6)+1;
			int total = DF+DS;
			result[total]+=1;
			}
		for(int i = 0; i<13; i++) {
			//System.out.println("Here2");
			System.out.printf("%s%d%s%d%s%n", "The total ", i, "came up ", result[i], "times." );
		}
System.out.print("end");
	}

}
