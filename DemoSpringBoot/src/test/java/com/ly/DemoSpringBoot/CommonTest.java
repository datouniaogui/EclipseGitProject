package com.ly.DemoSpringBoot;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommonTest {

	@Test
	void test () throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar calendar= Calendar.getInstance();
		Date now=calendar.getTime();
		System.err.println("now:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.DATE, -1);
		System.err.println("-1day:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.DATE, 2);
		System.err.println("+2day:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, -1);
		System.err.println("-1year:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.YEAR, 2);
		System.err.println("+2year:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, -1);
		System.err.println("-1MONTH:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.MONTH, +2);
		System.err.println("+2MONTH:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.HOUR, -1);
		System.err.println("-1HOUR:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.HOUR, +2);
		System.err.println("+2HOUR:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.MINUTE, -1);
		System.err.println("-1MINUTE:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.MINUTE, +2);
		System.err.println("+2MINUTE:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.SECOND, -1);
		System.err.println("-1SECOND:"+sdf.format(calendar.getTime()));
		calendar.add(Calendar.SECOND, +2);
		calendar.add(Calendar.DAY_OF_MONTH, +2);
		
		System.err.println("+2SECOND:"+sdf.format(calendar.getTime()));
		
//		Date now=new Date();
		
		SimpleDateFormat sdf1=new SimpleDateFormat("HH:mm:ss");
		Date date=sdf1.parse("08:00:01");
		Date date2=sdf1.parse("08:30:01");
		Date date3=sdf1.parse("00:00:01");
		Date date4=sdf1.parse("24:00:00");
		Date date5=sdf1.parse("00:00:00");
		
		
		System.err.println("date:"+date.getTime());
		System.err.println("date2:"+date2.getTime());
		System.err.println("date3:"+date3.getTime());
		System.err.println("date4:"+date4.getTime());
		System.err.println("date5:"+date5.getTime());
		System.err.println("date6:"+calendar.getTimeInMillis());
//		calendar.add(Calendar.SECOND, 1);
//		System.err.println("date7:"+calendar.getTimeInMillis());
		Calendar calendar2=Calendar.getInstance();
		System.err.println(sdf.format(calendar2.getTime()));
		System.out.println("YEAR:"+calendar2.get(Calendar.YEAR));
		System.out.println("MONTH:"+calendar2.get(Calendar.MONTH));//比实际-1（4时是3）
		System.out.println("DATE:"+calendar2.get(Calendar.DATE));
		System.out.println("HOUR:"+calendar2.get(Calendar.HOUR));
		System.out.println("MINUTE:"+calendar2.get(Calendar.MINUTE));
		System.out.println("SECOND:"+calendar2.get(Calendar.SECOND));
		
		
		System.err.println("====================================");
		System.out.println("YEAR:"+calendar2.get(Calendar.YEAR));
		System.out.println("DAY_OF_YEAR:"+calendar2.get(Calendar.DAY_OF_YEAR));
		System.out.println("DAY_OF_MONTH:"+calendar2.get(Calendar.DAY_OF_MONTH));
		System.out.println("DAY_OF_WEEK:"+calendar2.get(Calendar.DAY_OF_WEEK));
		System.out.println("DAY_OF_WEEK_IN_MONTH"+calendar2.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("WEEK_OF_MONTH:"+calendar2.get(Calendar.WEEK_OF_MONTH));
		System.out.println("WEEK_OF_YEAR:"+calendar2.get(Calendar.WEEK_OF_YEAR));
		
		
		
		Calendar calendar3=Calendar.getInstance();
		calendar3.setTime(sdf.parse("2020-01-20 12:34:00"));
		System.err.println("MONTH:"+calendar3.get(Calendar.MONTH));
		calendar3.add(Calendar.WEEK_OF_MONTH, 1);
		System.err.println(sdf.format(calendar3.getTime()));
		calendar3.add(Calendar.WEEK_OF_YEAR, 2);
		System.err.println(sdf.format(calendar3.getTime()));
//		System.out.println("DATE:"+calendar.get(Calendar.DATE));
		
		
		
		
//		System.err.println("calendar.getTime():"+calendar.getTime());
//		System.err.println("now:"+now);
		
		
	}
	
	
	
}
