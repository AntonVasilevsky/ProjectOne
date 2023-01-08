package com.geometry;

public enum DayOfWeek {
    SUNDAY(7, "Sunday"),
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday");
    private int dayNumber;
    private String name;
    DayOfWeek(int dayNumber, String name){
        this.dayNumber = dayNumber;
        this.name = name;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getName() {
        return name;
    }
    public DayOfWeek getDayOfWeek(int dayNumber){
        return null;
    }


}
