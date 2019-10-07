import java.util.Scanner;
public class power {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int base=0, power=0;
	System.out.print("Enter the base and then the exponenent");
	base = input.nextInt();
	power = input.nextInt();
	System.out.printf("%d%s%d%s%d", base, " raised to the power of ", power, " is ", integerPower(base, power) );
	}
	public static int integerPower(int base, int power) {
		int ans=1;
		for (int c=1; c<=power; c++) {
			ans*=base;
		}
		return ans;
	}
}
