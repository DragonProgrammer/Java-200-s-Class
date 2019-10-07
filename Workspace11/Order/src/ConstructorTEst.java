
public class ConstructorTEst {
public static void main(String[] arg) {
	ExeptionA r = new ExeptionA("Constructor failed");
	try{
		Someclass F = new Someclass();
	}
	catch(ExeptionA A) {
		System.out.print(r.getMessage());
	}
}
}
