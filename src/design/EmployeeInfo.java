package design;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class EmployeeInfo extends empAbstract {
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	 static String companyName;
	 private String name;

	 public static void setCompanyName(String companyName) {
		 EmployeeInfo.companyName = companyName
	 }

	 public void setEmployeeID(int employeeID) {
		 this.name = name;
	 }

	 public void setSalary(double salary) {
		 this.salary = salary;
	 }

	 public void setCell(int cell) {
		 this.cell = cell;

	 }
	 public void setIndustry(String industry) {
		 this.industry = industry;
	 }

	 public static String getCompanyName () {
		 return companyName;
	 }

	public String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public String getCell() {
		return Cell;
	}

	public String getIndustry() {
		return Industry;
	}
	 private double salary;
	 private int cell;
	 private String industry;
	 private String date_of_birth;

	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(){
	}
    public EmployeeInfo(int employeeId){
		this.employeeId=employeeId;
	}
	public EmployeeInfo(String name, int employeeId) {
		this.name=name;
		this.employeeId=employeeId
	}
	
	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeeBonus(double salary, String performance){
		int total=0;
		if(performance =="best") {
			total = (int) (salary * 0.1);
		}else if(performance == "average") {
			total = (int) (salary * 0.08);
		}else if (performance == "bad") {
			total = (int) (salary * 0.02);
		}


			return total;
		}

	public static int getDifferenceYears(String firstDay, String lastDay) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat
		String date1 = firstDay;
		String date2 = lastDay;
		Date newDate1 = format.parse(date1);
		Date newDate2 = format.parse(date2);
		Calendar a = getTheCalendar(newDate1);
		Calendar b = getTheCalendar(newDate2);
		int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
		if(a.get(Calendar.MONTH) >


		private static class DateConversion {

			public DateConversion(Months months) {
			}

			public static String convertDate(String date) {
				String[] extractMonth = date.split(",");
				String givenMonth = extractMonth[0];
				int monthDate = whichMonth(givenMonth);
				String actualDate = monthDate + "/" + extractMonth[1];
				return actualDate;
			}

			public static int whichMonth(String givenMonth) {
				Months months = Months.valueOf(givenMonth);
				int date = 0;
				switch (months) {
					case January:
						date = 1;
						break;
					case February:
						date = 2;
						break;
					case March:
						date = 3;
						break;
					case April:
						date = 4;
						break;
					case May:
						date = 5;
						break;
					case June:
						date = 6;
						break;
					case July:
						date = 1;
						break;
					case August:
						date = 1;
						break;
					case September:
						date = 1;
						break;
					case October:
						date = 1;
						break;
					case November:
						date = 1;
						break;
					case December:
						date = 1;
						break;
					default:
						date = 0;
						break;
				}
				return date;

			}
		}
	}
}
	
