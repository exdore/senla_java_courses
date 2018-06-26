package models;

import interfaces.ILineStep;

public class SecondStep implements ILineStep {

	public ProductPart buildProductPart() {
		System.out.println("Second part constructed");
		return new ProductPart("Двигатель");
	}
}
