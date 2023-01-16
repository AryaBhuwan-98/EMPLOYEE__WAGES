package com.bridgelabz.employeewages;

public class EmployeeWage {
    
    public static void main(String[] args) {
		
        
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int workingDays = 20;
        int dailyWage = 0;

        for (int day=0; day<=workingDays; day++) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));

            switch (employeeCheck) {
                case 2:
                    dailyWage = dailyWage + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time: " +dailyWage);
                    break;
                case 1:
                    dailyWage = dailyWage + partTimeHour * wagePerHour;
                    System.out.println("Employee is present half time: " +dailyWage);
                    break;
                default:
                    System.out.println("Employee is absent: " +dailyWage);
            }
        }
        System.out.println("Employee total wage for month is: " +dailyWage);
    }
}
