
public enum Trafficlight {
green("5 min"),
yellow("1 min"),
red("6 min");
	private final String time;
	Trafficlight(String time){this.time=time;}
	public String gettime()
	{return time;}
	
}
