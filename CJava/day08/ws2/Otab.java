package ws2;

public class Otab extends Mobile{
	public Otab() {
		
	}
	public Otab(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	@Override
	public int operate(int time) {
		int temp = 0;
		temp = time * 12;
		return batterySize - temp;
	}
	@Override
	public int charge(int time) {
		int temp = 0;
		temp = time * 8;
		return batterySize + temp;
	}
	
	@Override
	public String toString() {
		return "Otab [mobileName=" + mobileName + ", batterySize=" + batterySize + ", osType=" + osType + "]";
	}
	
}
