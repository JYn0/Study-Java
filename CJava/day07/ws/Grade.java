package ws;

public class Grade {
	private int[] data;

	public Grade(int[] data) {
		this.data = data;
	}

	int datasum = 0;

	public int sum(int data[]) {

		for (int temp : data) {
			datasum += temp;
		}
		return datasum;
	}

	double dataavg = 0.0;

	public double avg(int data[]) {
		dataavg = (double) datasum / data.length;
		return dataavg;
	}

	public String level(int data[]) {
		String grd = "";
		if (dataavg >= 90) {
			grd = "A";
		} else if ((dataavg >= 80) && (dataavg < 90)) {
			grd = "B";
		} else if ((dataavg >= 70) && (dataavg < 80)) {
			grd = "C";
		} else if ((dataavg >= 60) && (dataavg < 70)) {
			grd = "D";
		} else {
			grd = "F";
		}
		return grd;
	}

	public String max(int[] data) {
		int temp = 0, str = 0;
		String max = "";
		for (int i = 0; i < data.length; i++) {
			if (data[i] > temp) {
				temp = data[i];
				str = i;
			}
		}
		switch (str) {
		case 0:
			max = "국어";
			break;
		case 1:
			max = "영어";
			break;
		case 2:
			max = "수학";
			break;
		case 3:
			max = "과학";
			break;
		}
		return max;
	}

	public String min(int[] data) {
		int temp = 101, str = 0;
		String min = "";
		for (int i = 0; i < data.length; i++) {
			if (data[i] < temp) {
				temp = data[i];
				str = i;
			}
		}
		switch (str) {
		case 0:
			min = "국어";
			break;
		case 1:
			min = "영어";
			break;
		case 2:
			min = "수학";
			break;
		case 3:
			min = "과학";
			break;
		}
		return min;
	}

	public int[] asort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] > data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}

	public int[] dsort(int[] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length - 1 - i; j++) {
				if (data[j] < data[j + 1]) {
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}
}