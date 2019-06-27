package ws2;

public class Ltab extends Mobile {

	public Ltab() {
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	

	@Override
	public int operate(int time) {
		int temp = 0;
		temp = time * 10;
		return batterySize - temp;
	}

	@Override
	public int charge(int time) {
		int temp = 0;
		temp = time * 10;
		return batterySize + temp;
	}

	@Override
	public String toString() {
		return "Ltab [mobileName=" + mobileName + ", batterySize=" + batterySize + ", osType=" + osType + "]";
	}
}
