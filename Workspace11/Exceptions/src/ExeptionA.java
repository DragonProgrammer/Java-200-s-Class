
public class ExeptionA extends Exception{

public ExeptionA() {};
public ExeptionA(String message) {super(message);}
public ExeptionA(String message, Throwable ExceptionB) {super (message);}
}

