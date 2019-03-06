
public class Cube implements Shape,Print {
                private int height;
                private double length;
                private int width;
                
     public Cube(int height, double length, int width) {
		// TODO Auto-generated constructor stub
	}


	public void print() {
	height=2;
	System.out.println(height);
	length=3.45;
	System.out.println(length);
	width=4;
	System.out.println(width);
	double volume=height*length*width;
	System.out.println(volume);
	double surface=2*height*length+2*height*width+2*length*width;
	System.out.println(surface);
		
	}

	
	public void surface() {
	
		
	}

	@Override
	public void volume() {
		// TODO Auto-generated method stub
		
	}

}
