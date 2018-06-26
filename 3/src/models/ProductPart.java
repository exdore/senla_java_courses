package models;

import interfaces.IProductPart;

public class ProductPart implements IProductPart {
	
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	ProductPart(String value){
		setName(value);
	}
}
