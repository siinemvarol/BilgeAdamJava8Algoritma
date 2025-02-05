package com.sinemvarol_1;

public class EmployeeManager {

	private int employeeCounter = 1;

	public void tax(Employee employee) {
		if (employee.getSalary() > 0 && employee.getSalary() <= 2000) {
			employee.setTax(0);
			System.out.println("Taxes did not applied because salary is equal to or lower than 2000 TL.");
		} else {
			employee.setTax(employee.getSalary() * 0.05);
			System.out.println("Taxes calculated as 5% of the salary.");
		}

	}

	public void bonus(Employee employee) {
		if (employee.getWorkHours() > 40) {
			employee.setBonus((employee.getWorkHours() - 40) * 30);
			// employee.setSalary(employee.getSalary() + employee.getBonus());
			System.out.println("Bonus is calculated for work hours: " + employee.getWorkHours());
		} else {
			System.out.println("Bonus did not added to salary because work hours are less than or equal to 40.");
		}
	}

	public void raiseSalary(Employee employee) {
		if (((2023 - employee.getHireYear()) >= 0) && (2023 - employee.getHireYear()) < 10) {
			employee.setSalaryRaise(employee.getSalary() * 0.05);
			System.out.println("Raise is made 5% of salary because hire year is less than ten.");
		} else if (((2023 - employee.getHireYear()) >= 10) && (2023 - employee.getHireYear()) < 20) {
			employee.setSalaryRaise(employee.getSalary() * 0.10);
			System.out.println("Raise is made 10% of salary because hire year is more than ten and less than twenty.");
		} else if ((2023 - employee.getHireYear()) >= 20) {
			employee.setSalaryRaise(employee.getSalary() * 0.15);
			System.out.println("Raise is made 15% of salary because hire year is more than twenty.");
		} else {
			System.out.println("Raise could not calculated because hire year is invalid.");
		}
	}

	public double salaryUpdated(Employee employee) {
		employee.setSalary(employee.getSalary() - employee.getTax() + employee.getBonus());
		return employee.getSalary();
	}

	public double finalSalary(Employee employee) {
		employee.setSalary(employee.getSalary() + employee.getSalaryRaise());
		return employee.getSalary();
	}

	public void showInformation(Employee employee) {
		System.out.println("- Employee " + employeeCounter + " -\n");
		System.out.println("Name: " + employee.getName());
		System.out.println("Salary: " + employee.getSalary());
		System.out.println("Working hours: " + employee.getWorkHours());
		System.out.println("Hire year: " + employee.getHireYear());
		tax(employee);
		System.out.println("Tax: " + employee.getTax());
		bonus(employee);
		System.out.println("Bonus: " + employee.getBonus());
		raiseSalary(employee);
		System.out.println("Salary raise: " + employee.getSalaryRaise());
		System.out.println("- - - - -");
		System.out.println("Salary with taxes deducted and bonuses included: " + salaryUpdated(employee));
		System.out.println("Final salary with raise added: " + finalSalary(employee));
		System.out.println("- - - - -\n");

		employeeCounter++;
	}

}
