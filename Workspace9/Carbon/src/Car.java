
public class Car implements carbonFootprint{
private int gal, miles;
double filter = .1;
public void setG(int g) {gal=g;}
public void setM (int m) {miles = m;}
public int getG() {return gal;}
public int getM() {return miles;}
public double getF() {return 10*(1-filter);}
@Override
public double getcarbonFootprint() {return gal*miles*filter;}
}
