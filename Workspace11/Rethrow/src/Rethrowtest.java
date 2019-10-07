
public class Rethrowtest {
public static void main(String[] arg) {
	ExeptionA r = new ExeptionA("HI");
	try {
		method1();
	}
	catch (ExeptionA a) {
		a.printStackTrace();
	}
}
public static void method1() throws ExeptionA{
//try {
	method2();
//}
//catch (ExeptionA a) {
	//throw new ExeptionA();
//}
}
public static void method2() throws ExeptionA{
throw new ExeptionA("Exception thrown in 2");
}
}
