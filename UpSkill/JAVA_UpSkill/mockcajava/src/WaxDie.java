
public class WaxDie extends Cube implements Comparable<Object3D> {
	
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
		double radius = Math.cbrt((3/4)*(1/PI)*this.getVolume());
		Material other = Material.Wax;
		String name = "Sphere";
		return new Sphere(name, other, radius);
	}
}
	