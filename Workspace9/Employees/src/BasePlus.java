
public class BasePlus extends Commision{
public double Base;
	BasePlus(String F, String L, String S, double G, double R, double B)
{super(F, L, S, G, R);
Base=B;
if (Base<0.0)
{throw new IllegalArgumentException("Base salery muste be atleast $0.00.");}
}
	public double getBase() {return Base;}
	public void setBase(double B) {Base=B;}
	@Override
	public String toString()
	{return String.format("%s%n%s%.2f", super.toString(), "Base Salary: $", getBase());}
	public double earnings()
	{return Base+(Rate*Gross);}
}

