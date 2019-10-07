import java.util.EnumSet;
public class LightTest {
public static void main(String[] args)
{
	System.out.println("The lights:");
	for (Trafficlight light: Trafficlight.values())
	{System.out.printf("%7s %s%n", light, light.gettime());}
}
}
