package com.foxmula.assignment1;



public class Time {
	private int hour,minute,second;
	
	public Time() {
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	public Time(int h, int m, int s) {
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	public static Time add(Time t1, Time t2) {
	    Time sum = new Time();
	    sum.hour = t1.hour + t2.hour;
	    sum.minute = t1.minute + t2.minute;
	    sum.second = t1.second + t2.second;

	    if (sum.second >= 60.0) {
	        sum.second -= 60.0;
	        sum.minute += 1;
	    }
	    if (sum.minute >= 60) {
	        sum.minute -= 60;
	        sum.hour += 1;
	    }
	    return sum;
	}
	public static void print(Time t) {
	    System.out.println("New time is: " + t.hour + ":" + t.minute + ":" + t.second);
	}
	public static void main(String args[]) {
		Time t1 = new Time(9, 14, 30);
		Time t2= new Time(3, 35, 0);
		Time AddedTime = add(t1, t2);
		print(AddedTime);
	}
}
