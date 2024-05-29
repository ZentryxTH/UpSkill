
public class WaxDie extends Cube implements Comparable<Object3D>{
	
	public WaxDie(String name, double edge) {
		super(name, Material.Wax, edge);
	}
	
	public int compareTo(Object3D o) {
		if(o instanceof WaxDie) {
			WaxDie other = (WaxDie) o;
			if(this.getVolume() < other.getVolume()) {
				return -1;
			}
		}
		return 0;
	}
	
	public Object3D convertToOtherShape() {
		String name = "Sphere";
		Material other = Material.Wax;
		double radius = Math.cbrt((3 * this.getVolume())/(4 * PI));
		return new Sphere(name, other, radius);
	}
	
	public double getVolume() {
		return Math.pow(this.getEdge(), 3);
	}
	
	public double getSurface() {
		return 6 * Math.pow(this.getEdge(), 2);
	}
}	
