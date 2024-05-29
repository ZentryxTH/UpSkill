
public class Triangle extends Shape{
	
	double base;
	double height;
	double area;
	
	public Triangle() {
		this.base = 0;
		this.height = 0;
	}
	
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public double getArea(double base, double height) {
		this.base = base;
		this.height = height;
		return area = 0.5*base*height;
	}
	
	@Override
	public double getArea() {
		return area = 0.5*base*height;
	}
	
	public String toString() {
		return "Triangle[base=" + base + ", height=" + height + ", Shape[color=" + super.getColor() + "]]";
	}
}
