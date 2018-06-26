package models;

import interfaces.IProduct;
import interfaces.IProductPart;

public class Product implements IProduct {

	private ProductPart firstPart;
	private ProductPart secondPart;
	private ProductPart thirdPart;
	
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
		System.out.println(firstPart.getName() + " installed");
	}

	@Override
	public void installSecondPart(IProductPart part) {
		System.out.println("Second part installed:");
		secondPart = (ProductPart) part;
		System.out.println(secondPart.getName() + " installed");
	}

	@Override
	public void installThirdPart(IProductPart part) {
		System.out.println("Third part installed:");
		thirdPart = (ProductPart) part;
		System.out.println(thirdPart.getName() + " installed");
	}

}
