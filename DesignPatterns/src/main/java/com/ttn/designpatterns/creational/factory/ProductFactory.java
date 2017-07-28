package com.ttn.designpatterns.creational.factory;

public final class ProductFactory {

	public Product createProduct(ProductType productType) {
		
		Product product = null;
		
		try {
			Class<?> productClass = null;
			if(productType == ProductType.PRODUCT1) {
				productClass = ProductOne.class;
			} else if(productType == ProductType.PRODUCT2) {
				productClass = ProductTwo.class;
			}
			
			product = create(productClass);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	private Product create(Class<?> productClass) throws InstantiationException, IllegalAccessException {
		return ((Product) productClass.newInstance());
	}
}
