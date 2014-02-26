package springapp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	private static final Log LOGGER = LogFactory.getLog(springapp.web.HelloController.class);

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.info("Pintamos hola!!!");
		return new ModelAndView("hello.jsp");
	}
}