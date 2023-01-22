package com.bridgelabz.employeewages;

import java.util.Random;

public class EmployeeWage  implements IEmployeeWage {
    
    // instance variables
    int noOfCompanies, index;
    CompanyEmpWage[] companies; //declaring array

    //Constructor for the class EmployeeWage
    public EmployeeWage(int noOfCompanies) {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        index = 0;
    }
    //Assigning to the array
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs) {
        companies[index++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }
    //Computation of company wage
    int companyWage(CompanyEmpWage companyEmpWage) {
        System.out.println("* Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee:");
        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHrs = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHrs <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = generateEmployeeType(); //random value(0,1,2)
            workingHrs = getWorkingHrs(empType); //Full time, Part time or Absent
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.print("\n Day "+day+": Working hrs ="+workingHrs+", Total Wage ="+ wage+", Total working hour =" +totalWorkingHrs +"\n");
        }
        return totalWage;
    }
    int generateEmployeeType() {
        Random random = new Random();
        return random.nextInt(3);
    }
    int getWorkingHrs(int empType) {
        switch (empType) {
            case 1:
                return 8; //Full time
            case 2:
                return 4; //Part time
            default:
                return 0; //Absent
        }
    }
    public void companyWage() {
        for (CompanyEmpWage company : companies) //for-each loop
        {
            int totalWage = companyWage(company);
            company.setTotalEmployeeWage(totalWage);
            System.out.println(company); //overriding the toString() method
        }
    }
    
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation. \n");
		EmployeeWage emp = new EmployeeWage(3); //creating an object and declaring number of companies = 3
        emp.addCompany("Bridgeabz", 20, 20, 100);
        emp.addCompany("TATA", 34, 23, 130);
        emp.addCompany("BAJAJ", 10, 15, 99);
        emp.companyWage();
	}
}
