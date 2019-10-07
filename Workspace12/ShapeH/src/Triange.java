
public class Triange extends TwoDShape{
	public double Hieght;
	public Triange (double w, double h) {Shape.setW(w); Hieght=h;}
	@Override
	public double getArea() {return (Hieght*Shape.getW())/2;}
	@Override
	public double getVolume() {return 0;}
	}
