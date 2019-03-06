
public class driver {

	public static void main(String[] args) {
		Sphere s=new Sphere(2.5);
		System.out.println("Sphere:");
		s.print();
		System.out.println();
		Circle c=new Circle(2);
		System.out.println("Circle:");
		c.print();
		System.out.println();
	    Cube b=new Cube(2,3.45,4);
	    b.print();
		
	}
	

}
