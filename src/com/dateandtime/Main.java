package com.dateandtime;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int year = 2001;

        for (int i = 1; i < 13; i++) {
            YearMonth yearMonth = YearMonth.of(year, i);
            int dayMonth = yearMonth.lengthOfMonth();
            System.out.println(dayMonth);
        }

        LocalDate localDate = LocalDate.now();
        LocalDate dob = LocalDate.of(1985, 3, 8);
        System.out.println(dob.getDayOfWeek());
        System.out.println(dob.getDayOfYear());
        System.out.println(dob.getMonth());
        System.out.println(dob.getYear());
        System.out.println(localDate.isAfter(dob));
        System.out.println(localDate.isBefore(dob));
        long days = ChronoUnit.DAYS.between(dob, localDate);
        System.out.println(days);
        showHolidays();




    }

    public static boolean isFriday13(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (date.getDay() != 13 && calendar.get(Calendar.DAY_OF_WEEK) != 6) {
            return false;
        }
        return true;
    }

    public static void howOldAreYouIn(Date date) {
        Date birth = new Date(85, 3, 8);


        System.out.println("Your age is: " + (date.getYear() - birth.getYear()) + " years");
    }
    public static void showHolidays(){
        SimpleDateFormat sd = new SimpleDateFormat("dd MMMM");
        Date newYear = new Date();
        Date dob = new Date();
        newYear.setMonth(11);
        newYear.setDate(31);
        dob.setMonth(2);
        dob.setDate(8);
        System.out.println("Новый год - "+ sd.format(newYear));
        System.out.println("Date of birth - "+ sd.format(dob));


    }


}
