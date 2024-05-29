
public class Cube extends Object3D {
	private double edge;
	
	public Cube(String name, Material matType, double edge) {
		super(name,matType);
		this.edge = edge;
	}
	
	public double getEdge() {
		return edge;
	}
	
	public double getVolume() {
		return Math.pow(edge,3);
	}
	
	public double getSurface() {
		return 6 * Math.pow(edge, 2);
	}
}
