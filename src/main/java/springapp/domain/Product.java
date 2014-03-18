package springapp.domain;

import java.io.Serializable;

public class Product implements Serializable {

	private String description;
	private double price;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Description: " + this.description + "; ");
		buffer.append("Price:       " + this.price);
		return buffer.toString();
	}
}