package com.bridgelabz.employeewages;

public class EmployeeWage {
    
    public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
        
		int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int dailyWage = 0;

        int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
        switch (employeeCheck) {
        case 2:
            dailyWage = fullTimeHour * wagePerHour;
            System.out.println("Employee is present full time");
            break;
        case 1:
            dailyWage = partTimeHour * wagePerHour;
            System.out.println("Employee is present half time");
            break;
        default:
            System.out.println("Employee is absent");
    }
    System.out.println("Employee total wage is: " +dailyWage);
    }
}
