
public class Tetrahedron extends ThreeDShape{
	public Tetrahedron (double w) {Shape.setW(w);}
	public double getArea() {
		return Math.sqrt(3)*Math.pow(Shape.getW(),2);}
	@Override
	public double getVolume() {
		return Math.pow(Shape.getW(),3)/(6*Math.sqrt(2));}
}
