
public class Sphere implements Shape,Print{
          protected double radius=2.5;
          

		public Sphere(double radius) {
			this.radius=radius;
		}

	
		public void print() {
			System.out.println(radius);
			double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3 );
			System.out.println(volume);
			double surface=(4.0)*Math.PI*Math.pow(radius, 2);
			System.out.println(surface);
			
		}

		
	    public void surface() {
			double surface=(4.0)*Math.PI*Math.pow(radius, 2);
			System.out.println(surface);
			
			
		}

		
		public void volume() {
			System.out.println(radius);
			double volume = ( 4.0 / 3.0 ) * Math.PI * Math.pow(radius, 3 );
			System.out.println(volume);
		}

	
          

}
