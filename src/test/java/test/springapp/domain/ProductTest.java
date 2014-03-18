package test.springapp.domain;

import org.junit.Before;
import org.junit.Test;

import springapp.domain.Product;
import junit.framework.TestCase;

public class ProductTest extends TestCase {
   private Product product;
   
   @Before
   protected void setUp() {
	   product = new Product();
   }
   
   @Test
   public void testSetAndGetDescription() {
	   String testDescription = "aDescription";
	   assertNull(product.getDescription());
	   product.setDescription(testDescription);
	   assertEquals(testDescription, product.getDescription());
   }
   
   @Test
   public void testSetAndGetPrice() {
	   double testPrice = 100.00;
	   assertEquals(0, 0, 0);
	   product.setPrice(testPrice);
	   assertEquals(testPrice, product.getPrice(), 0);
   }
}
