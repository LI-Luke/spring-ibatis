package tw.com.luke.mvc.controller.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tw.com.luke.service.test.TestService;

@Controller
public class TestController {
	private static final Logger log = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping(value = "index", method = RequestMethod.GET )
	public String index(){
		log.debug("TEST");
		return "Test";
	}
	
	@ResponseBody
	@RequestMapping(value = "test1", method = RequestMethod.GET )
	public String test1(){
		log.debug("TEST1");
		testService.getDate("dataSource1");
		return "Test1";
	}
	
	@ResponseBody
	@RequestMapping(value = "test2", method = RequestMethod.GET )
	public String test2(){
		log.debug("TEST2");
		testService.getDate("dataSource2");
		return "Test2";
	}
	
}
