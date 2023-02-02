package com.coopnc.effectivejava3rd.item16.exam4;

public class Time {
	private static final int HOUR_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;

	public final int hour;
	public final int minute;

	public Time(int hour, int minute){
		if (hour < 0 || hour >= HOUR_PER_DAY)
			throw new IllegalArgumentException("시간 : "+hour);
		if (minute < 0 || minute >= MINUTES_PER_HOUR)
			throw new IllegalArgumentException("분 : "+minute);

		this.hour = hour;
		this.minute = minute;

	}
}
