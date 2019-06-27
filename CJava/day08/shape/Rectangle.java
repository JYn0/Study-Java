package shape;

public class Rectangle extends Shape {
	private int width;
	private int height;

	public Rectangle() {
	}

	public Rectangle(Point point, int width, int height) {
		super(point);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		double result = 0.0;
		result = width * height;
		return result;
	}

	@Override
	public double getCircume() {
		double result = 0.0;
		result = 2 * (width + height);
		return result;
	}

	@Override
	public String toString() {
		return "Rectangle [point=" + point + ", width=" + width + ", height=" + height + "]";
	}

}
