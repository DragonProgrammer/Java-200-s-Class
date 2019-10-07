// using debugging system.out.println() statements found that it was trying 
//to do loop for 1000th place when using <=p.length changed to <.
public class primes {
public static void main(String[] args)
{boolean p[] = new boolean[1000];
for (int i =2; i<p.length; i++)
{p[i]= true;
//System.out.println(i);
}
int l = p.length;
//System.out.print(l+ " here");
for (int i=2; i*i<p.length; i++)
{
	if (p[i]==true)
{for (int r = i+i; r<p.length;r += i)
{p[r]=false;
//System.out.println(r+ "here");
}}}
for (int i=2; i<p.length; i++)
{if (p[i]==true)
{System.out.println(i);}
}

}
}