
public class rectangle {
float width= 1;
float legth = 1;
public void verify()
{if (width <0.0 || width >20.0) {System.out.println("Width should be between 0 and 20.");}
if (legth <0.0 || legth >20.0) {System.out.println("Length should be between 0 and 20.");}}
void setL(float l)
{legth = l;}
float getl()
{return legth;}
void setW(float w) {width = w;}
float getW() {return width;}
float calcArea()
{return width*legth;}
float calcperim()
{
return (2*width)+(2*legth);}
}
