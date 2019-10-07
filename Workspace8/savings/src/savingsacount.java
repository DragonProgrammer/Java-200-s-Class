
public class savingsacount {
	 private double savingsBalance;
	 static double anualInterestRate;
	 savingsacount(double Savings, double Interest)
	 {
		 savingsBalance=Savings;
		 anualInterestRate=Interest;
	 }
	 double caculateMonthlyInterest(double Balance, double Rate)
{
		 Balance=savingsBalance;
		 Rate = anualInterestRate;
		 return (savingsBalance*anualInterestRate)/12;}
	 static void modifyInterestRate(double newRate)
	 {
		 anualInterestRate=newRate;
	 }
	 public double newBalance()
	 {return savingsBalance+(savingsBalance*anualInterestRate);}
}
