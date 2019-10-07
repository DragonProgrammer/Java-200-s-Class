
public class Employees {
public String first, last;
public double salary;
public void setS(double pay)
{salary = pay;}
public void setF(String nfirst)
{first = nfirst;}
public void setL(String nLast)
{last = nLast;}
public String getF()
{return first;}
public String getL()
{return last;}
public double getS()
{return salary;}
public double raise()
{return salary *1.1;}
}
