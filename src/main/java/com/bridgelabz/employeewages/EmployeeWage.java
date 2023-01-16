package com.bridgelabz.employeewages;

import java.util.Random;

public class EmployeeWage {
    
    final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;
    final static int Total_Working_Day = 20;
    final static int EMP_TOTAL_HOURS = 100;
    final static int EMP_RATE_PER_HOUR = 20;
public static void compempWage( ) {
    int totalworkingdays = 0;
    int empHours = 0;
    int empWage = 0;
    int Totalemphrs = 0;
    System.out.println("Welcome to Employee Wage Builder");

    while (Totalemphrs <= EMP_TOTAL_HOURS && totalworkingdays <= Total_Working_Day) {
        totalworkingdays++;
        Random random = new Random();

        int empCheck = random.nextInt(2);

        switch (empCheck) {
            case FULL_TIME_WORKER:
                empHours = 8;
                System.out.println("Employee is present");
                break;
            case PART_TIME_WORKER:
                empHours = 4;
                System.out.println("Employee is present");
                break;
            default:
                empHours = 0;
                System.out.println("Employee is absent");
        }
        Totalemphrs = Totalemphrs + empHours;
        empWage = empHours * EMP_RATE_PER_HOUR;
        int Total_emp_wage = empWage + Totalemphrs;
        Total_emp_wage = Total_emp_wage * Total_Working_Day;
        System.out.println("The daily wage of Employee is" + empWage);
        System.out.println("The Monthly Wage of Employee is" + Total_emp_wage);

    }
}
public static void main(String[] args) {
        compempWage( );
    }
}

		
       
       