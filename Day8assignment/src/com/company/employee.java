package com.company;

public class employee {

    public static void main(String[] args) {
        int employee1Wage;
        int employee1WorkedDays;
        int employee1WorkedHours;
        employeeWage employeeWage = new employeeWage();
        employee1Wage = employeeWage.calculate();
        employee1WorkedDays = employeeWage.getTotalWorkedDays();
        employee1WorkedHours = employeeWage.getTotalWorkedHOurs();
        System.out.println("employee1 wage = " + employee1Wage);
        System.out.println("employee1 worked days = " + employee1WorkedDays);
        System.out.println("employee1 worked hours = " + employee1WorkedHours);
    }
}
