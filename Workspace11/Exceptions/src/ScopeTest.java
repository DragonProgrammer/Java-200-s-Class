
public class ScopeTest {
public static void main(String[] arg) {
	try {
		thrower();
	}
	catch (ExceptionB B) {
		System.out.println("Caught exception B in main");
	}
	catch (ExeptionA A) {
		System.out.println("Caught exeption A in main");
	}
}
public static void methodA() throws ExeptionA{
System.out.print("gothere");
	throw new ExeptionA();}
public static void methodC() throws EceptionC{
throw new EceptionC();}
public static void methodB() throws ExceptionB{
	System.out.print("gothere");
	throw new ExceptionB();}
public static void thrower() throws ExeptionA, ExceptionB{
	try {
		methodB();
		methodA();	
		methodC();
			
	}
	catch (EceptionC C)
	{System.out.println("Caught C in thrower");}
	//finally {
		//System.out.print("Finely executed in thrower");
	//}
}}
//public static void

