package shape;

public class ShapeTest {

	public static void main(String[] args) {
		// Shape s = new Shape(new Point(10,10));
		// heterogeneous Collection
		Shape s[] = new Shape[3];
		s[0] = new Circle(new Point(1, 1), 5);
		s[1] = new Triangle(new Point(2, 2), 5, 6);
		s[2] = new Rectangle(new Point(3, 3), 5, 6);

		// Polymorphism 다형성
		// 의미는 같지만 표현되는 것은 다르다
		for (Shape sh : s) {
			sh.move(5, 5);
			if (sh instanceof Circle) { // instanceof:비교연산자
				Circle c = (Circle) sh;
				c.fillColor("red");
			}
			System.out.println(sh.toString());
//			System.out.println(sh.getArea());
//			System.out.println(sh.getCircume());
		}

	}

}
