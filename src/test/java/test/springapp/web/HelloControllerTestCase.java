package test.springapp.web;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import springapp.web.HelloController;

public class HelloControllerTestCase extends TestCase {

	@Test
	public void testHandleRequestview() {
		HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        String nowValue = (String)modelAndView.getModel().get("now");
        assertNotNull(nowValue);
	}
	
}
