
public class ButterBall extends Sphere implements Comparable<Object3D>, Meltable {
	
	public ButterBall(String name, double radius) {
		super(name, Material.Butter, radius);
	}
	
	public int compareTo(Object3D o) {
		if(o instanceof ButterBall) {
			ButterBall other = (ButterBall) o;
			if(this.getSurface() < other.getSurface()) {
				return -1;
			}
		}
		return 0;
	}
	
	public Object3D convertToOtherShape() {
		String name = "Cube" ;
		Material other = Material.Butter;
		double edge = Math.cbrt(this.getVolume());
		return new Cube(name, other, edge);
	}
	
	public double getVolume() {
		 return (4 * PI * Math.pow(this.getRadius(), 3))/3 ;
	}
	
	public double getSurface() {
		return 4 * PI * Math.pow(this.getRadius(), 2);
	}
}
