
public class TestOrder {

	public static void main (String[] args) {
int N;

System.out.println("Enter a number between 1 and 20");
System.out.println("Number entered is -5");
Exception e = new EceptionC("Caught C");
Exception b = new ExceptionB("Cought B");
Exception r = new ExeptionA("Caught A");

try {
N = -5;
System.out.println("Threw C");
throw new EceptionC();
//getE(N);
}
catch(ExeptionA A)
{System.out.println(r.getMessage());}
catch(ExceptionB B) // compiler error unreachable code
{System.out.println(b.getMessage());}
catch(EceptionC C) // compiler error unreachable code
{System.out.println(e.getMessage());}

try {
N = -5;
System.out.println("Threw C");
throw new EceptionC();
//getE(N);
}

catch(EceptionC C)
{System.out.println(e.getMessage());}
catch(ExceptionB B)
{System.out.println(b.getMessage());}
catch(ExeptionA A)
{System.out.println(r.getMessage());}


}}