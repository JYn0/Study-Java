package bm;

public class User {
	private String id;
	private int point;
	private int placeX;
	private int placeY;
	private int sum;

	{
		point = 1000;
	}
	public User() {
	}

	public User(int point, int placeX, int placeY) {
		this.point = point;
		this.placeX = placeX;
		this.placeY = placeY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getPlaceX() {
		return placeX;
	}

	public void setPlaceX(int placeX) {
		this.placeX = placeX;
	}

	public int getPlaceY() {
		return placeY;
	}

	public void setPlaceY(int placeY) {
		this.placeY = placeY;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", point=" + point + ", placeX=" + placeX + ", placeY=" + placeY + ", sum=" + sum
				+ "]";
	}
	
	
}
