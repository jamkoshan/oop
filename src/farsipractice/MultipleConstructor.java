package farsipractice;

public class MultipleConstructor {
	private int hour = 1;
	private int minute = 2;
	private int second = 3;

	public MultipleConstructor() {
		this(0, 0, 0);
	}

	public MultipleConstructor(int h) {
		this(h, 0, 0);

	}

	public MultipleConstructor(int h, int m) {
		this(h, m, 0);

	}

	public MultipleConstructor(int h, int m, int s) {
		setTime(h, m, s);

	}

	private void setTime(int h, int m, int s) {
		{
			setHour(h);
			setMinute(m);
			setSecond(s);
		}

	}

	public int getHour() {
		return hour;
	}

	public void setHour(int h) {
		hour = ((h >= 0 && h < 24) ? h : 0);
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int m) {
		minute = ((m >= 0 && m < 60) ? m : 0);
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int s) {
		second = ((s >= 0 && s < 60) ? s : 0);
	}
public String toMilitary() {
	return String.format("%02d:%02d:%02d", getHour(),getMinute(),getSecond());
}
	
	
}
