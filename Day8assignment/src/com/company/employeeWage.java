package com.company;

public class employeeWage {
    private final int IS_PART_TIME = 1;
    private final int IS_FULL_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;
    public static final int HALF_DAY_HOUR = 4;
    public static final int TOTAL_WORKING_DAYS = 20;
    public static final int TOTAL_WORKING_HOURS = 100;
    private int totalWorkedDays;
    private int totalWorkedHOurs;
    public int calculate(){
        int days = 1 , employeeWorkingHoursPerDay , totalEmployeeWage , totalEmployeeWorkedHours = 0;
        while (days <= TOTAL_WORKING_DAYS & totalEmployeeWorkedHours <= TOTAL_WORKING_HOURS){
            int attendance = (int) (Math.round(Math.random()*10)%3);
            switch (attendance){
                case IS_FULL_TIME:
                    employeeWorkingHoursPerDay = FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    employeeWorkingHoursPerDay = HALF_DAY_HOUR;
                    break;
                default:
                    employeeWorkingHoursPerDay = 0;
                    break;
            }
            totalEmployeeWorkedHours += employeeWorkingHoursPerDay;
            days++;
        }
        if (days == 21)days = 20;
        totalEmployeeWage = totalEmployeeWorkedHours * WAGE_PER_HOUR;
        totalWorkedDays = days;
        totalWorkedHOurs = totalEmployeeWorkedHours;
        return totalEmployeeWage;
    }
    public int getTotalWorkedDays() {

        return totalWorkedDays;
    }
    public int getTotalWorkedHOurs(){

        return totalWorkedHOurs;
    }
}
