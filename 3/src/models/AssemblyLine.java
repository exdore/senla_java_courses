package models;

import interfaces.IAssemblyLine;
import interfaces.IProduct;

public class AssemblyLine implements IAssemblyLine {

	FirstStep firstStep;
	SecondStep secondStep;
	ThirdStep thirdStep;
	
	public AssemblyLine(){
		firstStep = new FirstStep();
		secondStep = new SecondStep();
		thirdStep = new ThirdStep();
	}
	public IProduct assembleProduct(IProduct product) {
		return new Product(firstStep.buildProductPart(),secondStep.buildProductPart(),thirdStep.buildProductPart());
	}
}
