package main.java.jp.co.kou;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Day0624 {
	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
//		System.out.println(cl);
//		long timeInMillis = cl.getTimeInMillis();
//		System.out.println(timeInMillis);
//		Date date = new Date(timeInMillis + (1000L * 60 * 60 * 24));
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String format = simpleDateFormat.format(date);
//		System.out.println(format);
//		int i = cl.get(Calendar.YEAR);
//		System.out.println(i);
//		int m = cl.get(Calendar.MONTH);
//		System.out.println(m);
//		cl.set(Calendar.MONTH, 12);
//		System.out.println(cl);
//		Date date = cl.getTime();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String format = simpleDateFormat.format(date);
//		System.out.println(format);
//		cl.add(Calendar.MONTH, -1);
//		Date date = cl.getTime();
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		String format = simpleDateFormat.format(date);
//		System.out.println(format);
//		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//		System.out.println(availableZoneIds);
//		ZoneId systemDefault = ZoneId.systemDefault();
//		System.out.println(systemDefault);
//		ZoneId.of("Asia/ShangHai");
//		Instant now = Instant.now();
//		System.out.println(now);
//		ZonedDateTime atZone = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
//		System.out.println(atZone);
//		Instant Instant1 = Instant.now().minusSeconds(1);
//		System.out.println(Instant1);
//		ZonedDateTime now = ZonedDateTime.now();
//		System.out.println(now);
//		DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss.SSS");
//		String format = ofPattern.format(now);
//		System.out.println(format);
		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		LocalDate date = LocalDate.of(2025, 05, 23);
//		System.out.println(date);
//		int year = now.getYear();
//		System.out.println(year);
//		Month month = now.getMonth();
//		System.out.println(month.getValue());
//		int dayOfYear = now.getDayOfYear();
//		System.out.println(dayOfYear);
//		MonthDay.from(month);
//		Integer i = 10;
//		int i2 = i;
//		int parseInt = Integer.parseInt("5");
//		System.out.println(parseInt);
//		int a = 1;
//		String.valueOf(a);
		int sum = 0;
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("入力してください");
			String nextLine = scanner.nextLine();
			int number = Integer.parseInt(nextLine);
			List<Integer> list = new ArrayList<>();
			if (number >= 1 && number <= 100 ) {
				sum += number;
				if (sum <=200) {
					list.add(number);
				} else {
					System.out.println("200超えました");
					break;
				}
				
			} else {
				System.out.println("不正、もう一回入力してください");
			}
			
		}

	}
}   
