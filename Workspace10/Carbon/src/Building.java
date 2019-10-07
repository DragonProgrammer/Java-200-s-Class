public class Building implements carbonFootprint{
public int fireplaces, hours;
public Building(int F, int H)
{ fireplaces = F; hours = H;}
public void setF (int f) {fireplaces = f;}
public void setH (int h) {hours = h;}
public int getF() {return fireplaces;}
public int getH() {return hours;}
@Override
public double getcarbonFootprint() {return fireplaces*hours;}
}
