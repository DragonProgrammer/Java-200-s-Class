
public class Square extends TwoDShape{
	public Square (double w) {Shape.setW(w);}
	@Override
	public double getArea() {return Math.pow(Shape.getW(), 2);}
	@Override
	public double getVolume() {return 0;}
}
