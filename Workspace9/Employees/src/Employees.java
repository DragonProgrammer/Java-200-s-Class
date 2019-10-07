
public class Employees {
public String First, Last, SSI;
public String getFirst()
{return First;}
public String getLast() {return Last;}
public String getSSI() {return SSI;}
Employees(String F, String L, String S)
{SSI=S; First=F; Last = L;}
public String toString()
{return String.format("%s %s %s%n%s %s", "Employee Name: ", getFirst(), getLast(),
		"Social Securitiy Number: ", getSSI());
}
}

