package main.java.jp.co.kou;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Day0621 {
	public static void main(String[] args) throws Exception {
//		Date date = new Date();
//		System.out.println(date);
//		long time = date.getTime();
//		System.out.println(time);
//		Long time = 60*1000*60*24*365*7777L;
//		Date date1 = new Date(time);
//		System.out.println(date1);
//		Date date = new Date();
//		Date date2 = new Date();
//		String str = "2025-05-06";
//		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
////		String strFormat = sm.format(date1);
////		System.out.println(strFormat);
//		Date date = sm.parse(str);
//		long time2 = date.getTime();
//		System.out.println(time2);
//		Long time = 60L*1000*60*24*365*5;
//		date.setTime(time + time2);
//		String format = sm.format(date);
//		System.out.println(format);
//		String str = "2000-11-11";
//		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
//		Date date = sm.parse(str);
//		SimpleDateFormat smResult = new SimpleDateFormat("yyyy年MM月dd日");
//		String format = smResult.format(date);
//		System.out.println(format);
		String start = "2023年11月11日 00:00:0";
		String end = "2023年11月11日 00:10:00";
		String jia = "2023年11月11日 00:01:00";
		String pi = "2023年11月11日 00:11:00";
		Long timeStart = timeChange(start);
		Long timeEnd = timeChange(end);
		Long jiaTime = timeChange(jia);
		Long piTime = timeChange(pi);
	    compare(timeStart,timeEnd,piTime);

		
	}
	public static Long timeChange(String str) {
		SimpleDateFormat sp = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date date = null;
		try {
			date = sp.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("日付不正");;
		}
		long time = date.getTime();
		return time;
		
		
	}
	public static void compare(Long start, Long end, Long time) {
		if (start <= time && time<= end) {
			System.out.println("ok");
		} else {
			System.out.println("XX");
		}
		
		
	}
}
  