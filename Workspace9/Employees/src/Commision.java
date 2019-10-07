
public class Commision extends Employees{
public double Gross, Rate;
Commision(String F, String L, String S, double G, double R)
{
	super(F, L, S);
	Gross = G; Rate = R;
	if (Gross < 0.0)
	{throw new IllegalArgumentException("Gross sales muste be atleast $0.00.");}
	if (Rate < 0.0 || Rate > 1.0)
	{throw new IllegalArgumentException("Commision rate muste be between 0.0 and 1.0.");}
}
public void setGross(double G)
{
	Gross=G;
	if (Gross < 0.0)
	{throw new IllegalArgumentException("Gross sales muste be atleast $0.00.");}
}
public double getGross()
{return Gross;}
public double getRate() {return Rate;}
public void setRate(double R)
{
	Rate =R;
	if (Rate < 0.0 || Rate > 1.0)
	{throw new IllegalArgumentException("Commision rate muste be between 0.0 and 1.0.");}

}
public double Earnings()
{return Gross*Rate;}
@Override
public String toString()
{return String.format("%s%n%s%.2f%n%s %.2f", super.toString(), "Gross Sales: $", getGross(), "Commision Rate: ",
		getRate());
}
}