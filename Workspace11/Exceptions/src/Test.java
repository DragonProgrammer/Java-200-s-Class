
public class Test {
	public static void main (String[] args) {
int N;

System.out.println("Enter a number between 1 and 20");
System.out.println("Number entered is -5");
try {
N = -5;
//Exception e = new EceptionC("Happened in C");
//Exception b = new ExceptionB("Happened in B");
Exception r = new ExeptionA("Happened in A");
getE(N);
}
catch(ExeptionA r)
{System.out.println(r.getMessage());
try {
	Exception c = new ExeptionA("Happened in A");

	N=21;
	getE(N);}
catch(ExeptionA c)
{System.out.print(c.getMessage());
}
	}}
public static void getE (int N) throws ExeptionA
{
	if (N<0) {
	throw new ExceptionB("Needs to be Possitive");}
	if (N>20) {throw new EceptionC("Needs to be less then 21");//int x = N/0;
	
}}}