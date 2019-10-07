
public class Sphere extends ThreeDShape{
	public Sphere (double w) {Shape.setW(w);}
	@Override
	public double getArea() {
		return 4*(3.14159*Math.pow((Shape.getW()/2),2));}
	@Override
	public double getVolume() {
		return (4/3)*(3.14159*Math.pow((Shape.getW()/2),3));}
	}


