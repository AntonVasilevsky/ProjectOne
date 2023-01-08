package com.geometry;

import java.time.LocalDate;

public class DateDefiner {

        private DayOfWeek getDayOfWeek(int dayNumber){
            DayOfWeek[] days = DayOfWeek.values();
            for (DayOfWeek d: days
            ) {
                if(dayNumber== d.getDayNumber())
                    return d;
            }return null;
        }
        private Month getMonth(int monthNumber){
            Month[] months = Month.values();
            for (Month m: months
            ) {
                if(monthNumber==m.getMonthNumber()){
                    return m;
                }
            }return null;
        }
        public  CurrentDate getCurrentDate(){
            LocalDate current = LocalDate.now();
            int year = current.getYear();
            int monthNumber = current.getMonthValue();
            int dayOfMonth = current.getDayOfMonth();
            Month month = getMonth(monthNumber);
            var dayNumber = current.getDayOfWeek().getValue();
            DayOfWeek dayOfWeek = getDayOfWeek(dayNumber);
            return new CurrentDate(year, month, dayOfMonth, dayOfWeek);
        }

}
