package Lab1.java5;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SuppressWarnings("unused")
@Controller
public class HelloController {
	@RequestMapping("/dung-hello")
	public String dunghello() {
		return "hello";
	}

	@RequestMapping("/dung-login")
	public String login() {
		return "user/login";
	}

	@RequestMapping("user/login")
	public String login2(Model model, HttpServletRequest request) {
		String id = request.getParameter("name");
		String pass = request.getParameter("pass");
		if (id.equals("saomai") && pass.equals("hello")) {
			model.addAttribute("uid", id);
			model.addAttribute("pws", pass);
			return "user/info";
		}
		model.addAttribute("message", "Ban da nhap sai thong tin tk, mk:");
		return "user/login";
	}
}
