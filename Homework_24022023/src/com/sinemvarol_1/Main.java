package com.sinemvarol_1;

public class Main {

	// Maaş, Vergi, Bonus, Maaş artımı hesaplayan bir program
	// Sınıfın attributeları: name, salary, workHours (çalıştığı saat),
	// hireYear (işe giriş yılı), tax (vergi), bonus (mesai ücreti), 
	// salaryRaise (maaş artırımı)
	//
	// tax metodu --> eğer çalışanın maaşı 2000 tl'den az ise vergi uygulanmayacak,
	// 					fazla ise maaşının %5'i kadar vergisi olacak
	// bonus metodu --> eğer haftada 40 saatten fazla çalıştıysa çalıştığı saat
	// 					başına 30 tl maaşa bonus uygulanacak
	// 					ve ne kadar bonus aldığı hesaplanacak
	// raiseSalary --> işe girdiği yıla göre maaş artışı yapılacak. şu anki yıl
	// 					2023, 10 yıldan az ise %5, 10-20 yıl arasında %10, 
	//					20 yıldan fazla ise %15 zam yapılacak

	public static void main(String[] args) {
		
		EmployeeManager employeeManager = new EmployeeManager();
		
		Employee employee1 = new Employee("Ahmet", 3000, 65, 1995);
		
		employeeManager.showInformation(employee1);
		
		Employee employee2 = new Employee("Sinan", 1000, 35, 2020);
		
		employeeManager.showInformation(employee2);
		
		Employee employee3 = new Employee("Mehmet", 5000, 40, 2012);
		
		employeeManager.showInformation(employee3);

	}

}
