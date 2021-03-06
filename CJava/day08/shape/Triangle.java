package shape;

public class Triangle extends Shape {
	private int width;
	private int height;
	
	public Triangle() {
	}

	public Triangle(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double result = 0.0;
		result = width * height / 2;
		return result;
	}

	@Override
	public double getCircume() {
		double result = 0.0;
		result = Math.sqrt(Math.pow(this.width, 2)+Math.pow(this.height, 2));
		return result;
	}

	@Override
	public String toString() {
		return "Triangle [point=" + point + ", width=" + width + ", height=" + height + "]";
	}

}
