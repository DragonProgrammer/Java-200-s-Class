
public class Hourly extends Employees{
public double Hours, Wage;
Hourly(String F, String L, String S, double H, double W)
{super(F, L, S);
Hours = H; Wage = W;

if (Hours < 0.0 || Hours > 168)
{throw new IllegalArgumentException("Hours must be between 0.0 and 168.");}
if (Wage <0.0)
{throw new IllegalArgumentException("Wage must be atleast $0.00.");}
}
public void setWage(double W)
{
Wage=W;
	if (Wage <0.0)
	{throw new IllegalArgumentException("Wage must be atleast $0.00.");}
}
public void setHours(double H)
{
	Hours = H;
	if (Hours < 0.0 || Hours > 168)
	{throw new IllegalArgumentException("Hours must be between 0.0 and 168.");}
}
public double Earnings()
{if (Hours <40)
{double O = 1.5*(Hours-40);
return (Wage*40)+(O*Wage);
}
else
{ return Hours*Wage;}}
public double getH()
{return Hours;}
public double getW() {return Wage;}
@Override
public String toString()
{return String.format("%s%n%s%.2f%n%s%.2f", super.toString(), "The Hours: ", getH(),
		"The Wage: $", getW());}
}

