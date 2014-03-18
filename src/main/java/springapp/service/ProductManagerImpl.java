package springapp.service;

import java.util.List;

import springapp.domain.Product;

public class ProductManagerImpl implements ProductManager {

	private static final long serialVersionUID = 1L;
	private List<Product> products;

	@Override
	public void increasePrice(int percentage) {
		if(products != null && !products.isEmpty()) {
			for(Product product : products) {
				double newPrice = product.getPrice().doubleValue() * (percentage + 100) /100;
				product.setPrice(newPrice);
			}
			
		}
	}

	@Override
	public void decreasePrice(int percentage) {
		if(products != null && !products.isEmpty()) {
			for(Product product : products) {
				double newPrice = product.getPrice().doubleValue() * (100 - percentage) /100;
				product.setPrice(newPrice);
			}
			
		}
	}

	@Override
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@Override
	public List<Product> getProducts() {
		return this.products;
	}

}
