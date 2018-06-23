package models;

import interfaces.IProductPart;

public class ProductPart implements IProductPart {
	
	String name;
	
	ProductPart(String value){
		name = value;
		System.out.println(name);
	}
}
