package com.Obsqura.aggregation;

public class Employee {
	int id;
	String ename;
	Car c1;
	Bike b1;
	

	/**
	 * @param id
	 * @param ename
	 * @param c1
	 * @param b1
	 */
	public Employee(int id, String ename, Car c1, Bike b1) {
		this.id = id;
		this.ename = ename;
		this.c1 = c1;
		this.b1 = b1;
	}
	void show() {
		System.out.println("Id:" + id);
		System.out.println("Employee Name:"+ ename);
		System.out.println(c1.regno + c1.colour + c1.cname);
		System.out.println(b1.reg1no + b1.bname);
	}


public static void main(String[] args) {
Car details = new Car(100203," Red ", " KIA ");
Bike details1 = new Bike(1111, " Royal Enfield ");
Employee d = new Employee(01, " Rahul ", details, details1);
d.show();
	}

}
