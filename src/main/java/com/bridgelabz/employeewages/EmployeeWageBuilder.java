package com.bridgelabz.employeewages;

import java.util.Arrays;
import java.util.Scanner;


public class EmployeeWageBuilder {
    
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME=2;
    int wagePerHr;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs=0;
    static int i;
    static int company1TotalWage;
    static int company2TotalWage;

    public int empWageBuilder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        wagePerHr = scanner.nextInt();
        System.out.println("Enter the total Working days: ");
        totalWorkingDays = scanner.nextInt();
        System.out.println("Enter the total working hrs in a month: ");
        totalWorkingHrs = scanner.nextInt();

        for ( i=0;i<totalWorkingDays && workedHrs<totalWorkingHrs;i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME -> empHrs = 8;
                case IS_PART_TIME -> empHrs = 4;
            }
            int empWage = empHrs * wagePerHr;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage+=empWage;
            workedHrs+=empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
        return monthlyWage;
    }
    public static void main(String[] args){

        EmployeeWageBuilder company1 = new EmployeeWageBuilder();
        EmployeeWageBuilder company2 = new EmployeeWageBuilder();

        company1TotalWage=company1.empWageBuilder();
        System.out.println("Employee wage for company1: " + company1TotalWage);
        company2TotalWage=company2.empWageBuilder();
        System.out.println("Employee wage for company2: " + company2TotalWage);

        EmployeeWageBuilder [] companyEmpWageArray = new EmployeeWageBuilder[2];
        companyEmpWageArray[0]=company1;
        companyEmpWageArray[1]=company2;
        System.out.println(Arrays.toString(companyEmpWageArray));
    }
}
