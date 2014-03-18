package test.springapp.service;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import springapp.domain.Product;
import springapp.service.ProductManagerImpl;

public class ProductManagerImplTest {

	private ProductManagerImpl productManager;
	
	private static final int PRODUCT_COUNT = 2;
	
	private static final String RECORD_DESCRIPTION1 = "Roy Hamilton - Panic is on";
	private static final double RECORD_PRICE1       = 150.0;
	private static final String RECORD_DESCRIPTION2 = "Wade Flemons - Two of a kind";
	private static final double RECORD_PRICE2       = 530.0;	
	
	private static final int POSITIVE_PRICE_INCREASE = 10;
	
	@Before
	public void setUp() throws Exception {
		productManager = new ProductManagerImpl();
		List<Product> products       = new ArrayList<Product>();
		
		Product record = new Product();
		record.setDescription(RECORD_DESCRIPTION1);
		record.setPrice(RECORD_PRICE1);
		products.add(record);
		
		record = new Product();
		record.setDescription(RECORD_DESCRIPTION2);
		record.setPrice(RECORD_PRICE2);
		products.add(record);
		
		productManager.setProducts(products);
		
	}

	@Test
	public void testGetProductsWithNoProduct() {
		productManager = new ProductManagerImpl();
		assertNull(productManager.getProducts());
	}
	
	@Test
	public void testGetProducts() {
		List<Product> productList = productManager.getProducts();
		assertNotNull(productList);
		assertEquals(PRODUCT_COUNT, productList.size());
		
		Product product = productList.get(0);
		assertEquals(RECORD_DESCRIPTION1, product.getDescription());
		assertEquals(RECORD_PRICE1, product.getPrice(), 0);
		
		product = productList.get(1);
		assertEquals(RECORD_DESCRIPTION2, product.getDescription());
		assertEquals(RECORD_PRICE2, product.getPrice(), 0);
	}
	
	@Test
	public void testIncreasePriceWithNullListOfProducts() {
		try {
			productManager = new ProductManagerImpl();
			productManager.increasePrice(POSITIVE_PRICE_INCREASE);
		} catch(NullPointerException npe) {
			fail("Product list is null");
		}
	}
	
	@Test
	public void testIncreasePriceWithEmptyListOfProducts() {
		try {
			productManager = new ProductManagerImpl();
			productManager.setProducts(new ArrayList<Product>());
			productManager.increasePrice(POSITIVE_PRICE_INCREASE);
		} catch(Exception e) {
			fail("Product list is empty");
		}
	}
	
	@Test
	public void testIncreasePriceWithPositivePercentage() {
		productManager.increasePrice(POSITIVE_PRICE_INCREASE);
		double expectedRecord1PriceWithIncrease = 165.0;
		double expectedRecord2PriceWithIncrease = 583.0;
		
		List<Product> products = productManager.getProducts();
		assertEquals(expectedRecord1PriceWithIncrease, products.get(0).getPrice(), 0);
		assertEquals(expectedRecord2PriceWithIncrease, products.get(1).getPrice(), 0);
	}
	
	@Test
	public void testDecreasePriceWithPositivePercentage() {
		productManager.decreasePrice(POSITIVE_PRICE_INCREASE);
		double expectedRecord1PriceWithDecrease = 135.0;
		double expectedRecord2PriceWithDecrease = 477.0;
		
		List<Product> products = productManager.getProducts();
		assertEquals(expectedRecord1PriceWithDecrease, products.get(0).getPrice(), 0);
		assertEquals(expectedRecord2PriceWithDecrease, products.get(1).getPrice(), 0);
	}

}
