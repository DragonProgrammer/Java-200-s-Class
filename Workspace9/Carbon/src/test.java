public class test {
	public static void main(String[] args) {
Car Ford = new Car();
biulding Home = new biulding();
Bicycle Trike = new Bicycle();
//sting F = "A Ford car using " + Ford.getG() + " gallons, and driving " + Ford.getM() + "miles, and whose filter scrubs " + Ford.getF() + "% of the emissions produces " + Ford.getcarbonFootprint() + "lb of carbon.";
System.out.printf("%s%d%s%d%s%.1f%s%.1f%s%n", "A Ford car using ", Ford.getG(), " gallons, and driving ", Ford.getM(), "miles, and whose filter scrubs ",
		Ford.getF(), "% of the emissions produces ", Ford.getcarbonFootprint(), "lb of carbon.");
System.out.printf("%s%d%s%d%s%d%s%n", "A house with ", Home.getF(), "fireplaces burning for ", Home.getH(), "hours produces ", Home.getcarbonFootprint(),
		"lb of carbon");
System.out.print("A bicycle under any normal circumstances creates " + Trike.getcarbonFootprint() + "lb carbon.");
}}
