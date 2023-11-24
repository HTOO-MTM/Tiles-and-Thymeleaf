package thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
	@RequestMapping("/")
	public class WebController {

		@GetMapping("home")
		public ModelAndView getHome() {
			return new ModelAndView("home");
		}
		
		@GetMapping("greeting")
		public ModelAndView getHello() {
			return new ModelAndView("greet");
		}
			
		@GetMapping("leaf")
		public ModelAndView getLeaf() {
			return new ModelAndView("thymeleaf");
		}
		
	}
