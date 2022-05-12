package dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateTimeAPIDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt=LocalDateTime.now();
		
        System.out.println("Current Date and Time is :"+dt);
		
		int dd=dt.getDayOfMonth();
		int mm=dt.getMonthValue();
		int yyyy=dt.getYear();
		
		System.out.println("Date/Month/Year:"+dd+"/"+mm+"/"+yyyy);
		System.out.printf("Date-Month-Year: %d-%d-%d",dd,mm,yyyy);
		
		int hh=dt.getHour();
		int nm=dt.getMinute();
		int ss=dt.getMinute();
		int nn=dt.getNano();
		
		System.out.printf("\nHour:Minutes:seconds:Nano Second: %d:%d:%d:%d\n",hh,nm,ss,nn);
		
		LocalDateTime dt1=LocalDateTime.of(2022,9,25,14,30);
		System.out.println("BirthDay:"+dt1);
		
		LocalDate birthDate=LocalDate.of(1998,9,25);
		LocalDate currentDate=LocalDate.now();
		Period p=Period.between(birthDate, currentDate);
		System.out.printf("%d Years %d months and %d days",p.getYears(),p.getMonths(),p.getDays());
		
		Year y=Year.of(2020);
		if(y.isLeap())
			System.out.printf("\n%d is a Leap Year",y.getValue());
		else
			System.out.printf("\n%d is not a leap year",y.getValue());
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println("\nCurrent System time zone: "+zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime dt2=ZonedDateTime.now(la);
		System.out.println("Los Angeles Time Zone: "+dt2);
		
		LocalDate date=LocalDate.now();
		System.out.println("Current Date: "+date);
		
		LocalTime time=LocalTime.now();
		System.out.println("Current Time: "+time);
		
		int dd1=date.getDayOfMonth();
		int mm1=date.getMonthValue();
		int yyyy1=date.getYear();
		
		System.out.println("Date/Month/year: "+dd1+"/"+mm1+"/"+yyyy1);
		System.out.printf("Date-Month-year: %d-%d-%d",dd1,mm1,yyyy1);
		
		int hh1=time.getHour();
		int nm1=time.getMinute();
		int ss1=time.getMinute();
		int nn1=time.getNano();
		
		System.out.printf("\nHour:Minute:Second:Nano Second: %d:%d:%d:%d",hh1,nm1,ss1,nn1);
		
		LocalDate tomorrow=LocalDate.now().plusDays(1);
		System.out.println("\nTomorrow is :"+tomorrow);
		
		int date1=LocalDate.parse("2022-05-11").getDayOfMonth();
		System.out.println("Date of month is: "+date1);
   		
		boolean notBefore=LocalDate.parse("2022-05-11").isBefore(LocalDate.parse("2022-05-15"));
		System.out.println(notBefore);
		
		boolean isAfter=LocalDate.parse("2022-05-11").isAfter(LocalDate.parse("2022-05-15"));
		System.out.println(isAfter);
		
		LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
		LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12").with(TemporalAdjusters.firstDayOfMonth());
		
		System.out.println(beginningOfDay);
		System.out.println(firstDayOfMonth);
		
		LocalDate initial=LocalDate.parse("2022-05-11");
		LocalDate final1=initial.plus(Period.ofDays(5));
		System.out.println(final1);
		
		int period=Period.between(initial, final1).getDays();
		System.out.println(period);
		
		long period1=ChronoUnit.DAYS.between(initial, final1);
		System.out.println(period1);
		
		LocalTime initialTime=LocalTime.parse("06:30:00");
		LocalTime finalTime=LocalTime.parse("08:50:00");
		
		long duration=Duration.between(initialTime,finalTime).getSeconds();
		System.out.println(duration+" Seconds");
		
		long duration1=ChronoUnit.SECONDS.between(initialTime,finalTime);
		System.out.println(duration1);
	}

}
