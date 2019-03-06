
public class Circle extends Sphere {

	public Circle(int radius) {
	    super(radius);
	    
	    
		
	}
	@Override
    public void surface() {
		super.surface();
	    double perimeter=2*Math.PI*radius;
	    System.out.println(perimeter);
	    
		
	}

	@Override
	public void volume() {
    super.volume();
    double area=Math.PI*(radius*radius);
    System.out.println(area);
	}
	public void print() {
		double perimeter=2*Math.PI*radius;
	    System.out.println(perimeter);
	    double area=Math.PI*(radius*radius);
	    System.out.println(area);
	}
	}


