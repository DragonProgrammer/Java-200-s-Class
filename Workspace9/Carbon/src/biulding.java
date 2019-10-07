
public class biulding implements carbonFootprint{
public int fireplaces, hours;
public void setF (int f) {fireplaces = f;}
public void setH (int h) {hours = h;}
public int getF() {return fireplaces;}
public int getH() {return hours;}
@Override
public double getcarbonFootprint() {return fireplaces*hours;}
}
