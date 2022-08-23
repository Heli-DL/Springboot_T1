package s22.harjoitus1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	
	@RequestMapping("index")
	public String sayMain() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	public String sayContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	public String sayHello(@RequestParam(name="location") String location,
			@RequestParam(name="name") String name) {
		return "Welcome to the " + location + " " + name + "!";
	}
	
}
