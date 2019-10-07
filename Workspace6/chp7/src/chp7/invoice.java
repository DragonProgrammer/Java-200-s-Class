public class invoice {
String pN, pD;
int pQ;
double pP;
public invoice(String N, String D, int Q, double P)
{
	pN=N;
	pD=D;
	pQ=Q;
	pP=P;
	if (pQ<0)
	{pQ=0;}
	if (pP<0.0)
	{pP=0;}
}
public void setN(String n)
{pN=n;}
public void setD(String d)
{pD=d;}
public void setQ(int q)
{pQ=q;}
public void setP(double p)
{pP=p;}
public String getN()
{return pN;}
public String getD()
{return pD;}
public int getQ()
{return pQ;}
public double getP()
{return pP;}
public double getinvouceAmount()
{return pQ*pP;}
}