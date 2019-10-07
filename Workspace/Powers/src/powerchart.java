
public class powerchart {
	public static void main (String[] args) {
		int B = 0;
		System.out.printf("%-10s%-10s%-10s%n", "Base", "Square", "Cube");
		
		while (B < 11)
		{
			int S = B*B;
			int C = S*B;
			System.out.printf("%-10d%-10d%-10d%n", B, S, C);
			B=B+1;
			
		}
	}
}
