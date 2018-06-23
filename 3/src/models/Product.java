package models;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Product implements IProduct {

	public ProductPart firstPart;
	public ProductPart secondPart;
	public ProductPart thirdPart;
	
	Product(ProductPart first, ProductPart second, ProductPart third){
		installFirstPart(first);
		installSecondPart(second);
		installThirdPart(third);
	}
	
	public Product(){
	
	}
	@Override
	public void installFirstPart(IProductPart part) {
		System.out.println("First part installed:");
		firstPart = (ProductPart) part;
		System.out.println(firstPart.name + " installed");
	}

	@Override
	public void installSecondPart(IProductPart part) {
		System.out.println("Second part installed:");
		secondPart = (ProductPart) part;
		System.out.println(secondPart.name + " installed");
	}

	@Override
	public void installThirdPart(IProductPart part) {
		System.out.println("Third part installed:");
		thirdPart = (ProductPart) part;
		System.out.println(thirdPart.name + " installed");
	}

}
