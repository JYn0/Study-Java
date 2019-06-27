package calc;

public class Calc {
	private int [] data;
	
	public Calc() {
		
	}
	public Calc(int[] data) {
		this.data = data;
	}
	// 1. Sum
	public int sum(int [] data) {
		int datasum = 0;
		for(int temp: data) {
			datasum += temp;
		}
		return datasum;
	}
	public double avg(int [] data) {
		int datasum = 0;
		for(int temp: data) {
			datasum += temp;
		}
		double dataavg = (double)datasum / data.length;
		return dataavg;
	}
	// 2. Sort Asc
	public int [] asort(int [] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length-1-i; j++) {
				if(data[j] > data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp; 
				}
			}
		}
		return data;
	}
	// 3. Sort Desc
	public int [] dsort(int [] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data.length-1-i; j++) {
				if(data[j] < data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp; 
				}
			}
		}
		return data;
	}
}