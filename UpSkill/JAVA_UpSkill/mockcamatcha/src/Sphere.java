
public class Sphere extends Object3D {
	private double radius;
	
	public Sphere(String name, Material matType, double radius) {
		super(name, matType);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getVolume() {
		return (4 * PI * Math.pow(radius, 3))/3 ;
	}
	
	public double getSurface() {
		return 4 * PI * Math.pow(radius, 2);
	}
}
