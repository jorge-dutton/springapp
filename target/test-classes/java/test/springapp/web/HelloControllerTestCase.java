package test.springapp.web;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import springapp.web.HelloController;

public class HelloControllerTestCase extends TestCase {

	@Test
	public void testHandleRequestview() throws Exception{
		HelloController controller = new HelloController();
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("hello.jsp", modelAndView.getViewName());
	}
	
}
