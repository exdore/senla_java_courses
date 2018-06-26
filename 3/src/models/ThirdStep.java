package models;

import interfaces.ILineStep;

public class ThirdStep implements ILineStep {

	public ProductPart buildProductPart() {
		System.out.println("Third part constructed");
		return new ProductPart("Башня");
	}
}
