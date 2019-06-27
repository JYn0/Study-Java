package ws2;

public class Mobile {
	protected String mobileName;
	protected int batterySize;
	protected String osType;

	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public String getMobileName() {
		return mobileName;
	}

	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", batterySize=" + batterySize + ", osType=" + osType + "]";
	}

	public int operate(int time) {
		int a = 0;
		return a;
	}

	public int charge(int time) {
		int a = 0;
		return a;
	}
}
