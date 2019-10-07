
public class Circle extends TwoDShape{
	public Circle (double w) {Shape.setW(w);}
	@Override
	public double getArea() {
		return 3.14159*Math.pow((Shape.getW()/2),2);
	}
	@Override
	public double getVolume() {return 0;}
}
