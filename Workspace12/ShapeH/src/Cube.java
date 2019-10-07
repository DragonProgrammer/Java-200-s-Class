
public class Cube extends ThreeDShape{
	public Cube (double w) {Shape.setW(w);}
	@Override
	public double getArea() {
		return 6*(Math.pow(Shape.getW(),2));
	}
	@Override
	public double getVolume() {return Math.pow(Shape.getW(),3);}
}
