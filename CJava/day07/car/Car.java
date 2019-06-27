package car;
//���⼭�� print �ǹ̾���
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
	// Car c = new Car(); -> ������ �� �ʱ�ȭ��
	{//new�Ҷ����� ����
		cfSize = defaultSize * 2;
		if(cfSize <= 0) {
			cfSize = 0;
		}
		cfSize++;//(instance variable)
	}
	static {
		serial *= 1000;//class variable
	}
	
	// constructor // -> �����ʹ�ư source
	//class�� instance�� �����ɶ� ���۵Ǵ� �Լ�(�ʱ�ȭ), return X, class�� �̸��� ����
	public Car() {
		this.name = "K1";
		this.color = "red";
		this.fSize = 50;
		this.maxSpeed = 50;
		//cfSize, speed -> default(0)
	}
	//Overload : �̸������� argument�� �ٸ�
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
	public void setCfSize(int cfSize) throws Exception {// ���Լ��� �� �� ������ �߻��� �� �ִ�
		if ((this.cfSize + cfSize) > this.fSize) {
			throw new Exception(); //�߸��� ���� ���� ���� �˷���
			//return; Exception���� ���̻� �������� �ʾ� �ʿ����
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
			// this.speed = 20; -> ������ �� ����
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
