
public class Rectangle extends Shape {
	
	double length;
	double width;
	double area;
	
	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getArea(double length, double width) {
		this.length = length;
		this.width = width;
		return area = length*width;
	}
	
	@Override
	public double getArea() {
		return area = length * width;
	}
	
	public String toString() {
		return "Rectangle[length=" + length + ", width=" + width + ",Shape[color=" + super.toString() +"]";
	}
}
