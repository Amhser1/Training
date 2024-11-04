package com.Obsqura.aggregation;

public class Address {
	String address;
	Student s;
	
	/**
	 * @param address
	 * @param s
	 */
	public Address(String address, Student s) {
		this.address = address;
		this.s = s;
	}
void display() {
	System.out.println("Address:" + address);
	System.out.println(s.roll + s.name );
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1= new Student(01," Akshay ");
Student s2= new Student(02," Arunima ");

Address a= new Address("Palakkad",s1);
Address b= new Address("Alappuzha",s2);
a.display();
b.display();

	}

}
