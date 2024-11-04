package com.Obsqura.aggregation;
//aggregation - has a realtion
//to link between two classes
//an object in oneclass is used a variable in another class- aggregation
//sub class
public class Product {
	int id; // instance variables declaration
	String name; // instance variables declaration
	String descrip; // instance variables declaration
	/**
	 * @param id
	 * @param name
	 * @param descrip
	 */
	public Product(int id, String name, String descrip) {
		this.id = id;
		this.name = name;
		this.descrip = descrip;
	} // constructor of first class

}
