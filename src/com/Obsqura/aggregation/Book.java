package com.Obsqura.aggregation;

public class Book {
	String name;
	int price;
	Author a;
	

	/**
	 * @param name
	 * @param price
	 * @param a
	 */
	public Book(String name, int price, Author a) {
		this.name = name;
		this.price = price;
		this.a = a;
	}
void advertise() {
	System.out.println("Book Name:"+ name);
	System.out.println("Book price:" + price );
	System.out.println(a.a1name + a.age + a.place);
	
}
public static void main(String[] args) {
	Author q= new Author( " David ", 49, " Paris ");
	Book f= new Book(" Homosapiens", 560, q);
	f.advertise();
	}

}
