import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Enter a line of characters");
String L = input.nextLine();
int count = 0;
for (int i = 0; i<L.length(); i++)
{String l = L.substring(i, i+1);
if (l.equalsIgnoreCase("a") ||l.equalsIgnoreCase("e") ||l.equalsIgnoreCase("i") ||l.equalsIgnoreCase("o") ||l.equalsIgnoreCase("u")) 
{count++;}
	}
System.out.println("Number of Vowels " + count);}
}
