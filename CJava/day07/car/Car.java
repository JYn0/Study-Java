package car;
//여기서는 print 의미없음
public class Car {
	// attribute
	private String name;
	private String color;
	private int fSize; //fuel
	//private int cfSize; //current fuel
	private int speed;
	private int maxSpeed;
	private int defaultSize = 100;
	private int cfSize = defaultSize * 2;
	private static int serial = 1;
	// initialization block
	// Car c = new Car(); -> 실행할 때 초기화됨
	{//new할때마다 동작
		cfSize = defaultSize * 2;
		if(cfSize <= 0) {
			cfSize = 0;
		}
		cfSize++;//(instance variable)
	}
	static {
		serial *= 1000;//class variable
	}
	
	// constructor // -> 오른쪽버튼 source
	//class의 instance가 생성될때 동작되는 함수(초기화), return X, class와 이름이 같음
	public Car() {
		this.name = "K1";
		this.color = "red";
		this.fSize = 50;
		this.maxSpeed = 50;
		//cfSize, speed -> default(0)
	}
	//Overload : 이름같은데 argument가 다름
	public Car(String name, String color, int fSize) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
	}
	
	public Car(String name, String color, int fSize, int maxSpeed) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
		this.maxSpeed = maxSpeed;
	}
	public Car(String name, String color, int fSize, int cfSize, int speed) {
		this.name = name;
		this.color = color;
		this.fSize = fSize;
		this.cfSize = cfSize;
		this.speed = speed;
	}
	
		
	// function
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", fSize=" + fSize + ", cfSize=" + cfSize + ", speed=" + speed
				+ "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getfSize() {
		return fSize;
	}
	public void setfSize(int fSize) {
		this.fSize = fSize;
	}
	public int getCfSize() {
		return cfSize;
	}
	public void setCfSize(int cfSize) throws Exception {// 이함수를 쓸 때 문제가 발생할 수 있다
		if ((this.cfSize + cfSize) > this.fSize) {
			throw new Exception(); //잘못된 값을 넣은 것을 알려줌
			//return; Exception에서 더이상 내려오지 않아 필요없음
		}
		this.cfSize += cfSize;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(this.maxSpeed < speed) {
			this.speed = maxSpeed;
			return;
		}
		this.speed = speed;
	}
	
	
	public void go(int level) {
		// level 1~5
		// speed up 1:10
		// fuel down1L 10km
		switch(level) {
		case 1:
			// this.speed = 20; -> 오류날 수 있음
			this.setSpeed(20);
			this.cfSize -= 1;
			break;
		case 2:
			this.setSpeed(40);
			this.cfSize -= 2;
			break;
		case 3:
			this.setSpeed(60);
			this.cfSize -= 3;
			break;
		case 4:
			this.setSpeed(80);
			this.cfSize -= 4;
			break;
		case 5:
			this.setSpeed(100);
			this.cfSize -= 5;
			break;
		default:
			break;
		}
	}
	public void stop() {
		this.speed = 0;
	}
	
	
}
