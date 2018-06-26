package models;

import interfaces.ILineStep;

public class FirstStep implements ILineStep {

	public ProductPart buildProductPart() {
		System.out.println("First part constructed");
		return new ProductPart("Корпус");
	}
}
