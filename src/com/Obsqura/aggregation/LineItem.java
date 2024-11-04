package com.Obsqura.aggregation;

public class LineItem {
	int quantity;
	Product p;//parent class object treated here as an instance variable p 
	// or used reference variable 

	/**
	 * @param kg
	 * @param p
	 */
	public LineItem(int kg, Product p) { 
		//constructor for subclass
		this.quantity = kg;
		this.p = p;
	}
	void display() {
		//display method
		System.out.println("Quantity :"  +  quantity );
		System.out.println(p.id    + p.name  + p.descrip );
		// instance variable calling-object name.variable name
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating another object to call products in product class
		Product p1= new Product(01, " Chips "  , " Spicy ");
		// a new object p1 created
		LineItem i= new LineItem(5,p1);//new lineitem is a constructor contains quantity and product
		//p1 is an object so use without quotes
		// creating another object to call products in LineItem class
		i.display();// method calling 
	}
	}


