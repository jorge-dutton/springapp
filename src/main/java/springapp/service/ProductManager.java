package springapp.service;

import java.io.Serializable;
import java.util.List;

import springapp.domain.Product;

public interface ProductManager extends Serializable {
	
	public void increasePrice(int percentage);
	public void decreasePrice(int percentage);
	public void setProducts(List<Product>products);
	public List<Product> getProducts(); 

}
