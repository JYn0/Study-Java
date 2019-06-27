package tv;

public class TV {
	// attribute(property)
	private String color;
	private boolean power;
	private int channel;
	
	// constructor(function init)
	TV(){
		color = "red";
		power = false;
		channel = 10;
	}
	TV(String color, boolean power, int channel) {
		//this -> 생성된 instance의 주소
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	TV(String color) {
		this.color = color;
		this.power = false;
		this.channel = 10;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		// 숫자 못 들어오게 한다
		// 컬러는 몇개로 정해서 동작한다
		if(color.equals("" ) || color == null) {
			return;
		}
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	// function(behavior)
	void power() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	@Override
	public String toString() {
		return "TV [color=" + color + ", power=" + power + ", channel=" + channel + "]";
	}
	
}
