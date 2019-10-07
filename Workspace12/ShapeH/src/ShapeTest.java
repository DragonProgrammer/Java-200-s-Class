
public class ShapeTest {

	public static void main(String[] args) {
		Circle O = new Circle(3.0);
		Cube H = new Cube(3.0);
		Sphere U = new Sphere(3.0);
		Square h = new Square(3.0);
		Tetrahedron V = new Tetrahedron(3.0);
		Triange T = new Triange(3.0, 3.0);
		Shape Shapes[] = new Shape[6];
		Shapes[0] = O;
		Shapes[1] = H;
		Shapes[2] = U;
		Shapes[3] = h;
		Shapes[4] = V;
		Shapes[5] = T;
		for (Shape CurrentShape : Shapes) {
			System.out.println(CurrentShape.getClass().getName());
			//System.out.printf("%s%.2f", "The surface area is ", CurrentShape.getArea());
			if (CurrentShape instanceof ThreeDShape) {
				System.out.printf("%s%.2f%n%s%.2f%n%n", "The Surface Area is: ", CurrentShape.getArea(), "THe Volume is: ", CurrentShape.getVolume());
			}
			else {System.out.printf("%s%.2f%n%n", "The surface area is ", CurrentShape.getArea());}
		}}
	}

//}
