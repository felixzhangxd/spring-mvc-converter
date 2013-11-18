package biz.ezcom.spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/initbinder")
public class InitBinderController {
	/**
	 * 1.目标方法有参数就执行 
	 * 2.WebDataBinder binder 每次请求创建一个
	 * 3.只限于本类
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("initBinder");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@RequestMapping(value = { "/input" }, method = { RequestMethod.GET })
	public void input(Date date) {
		System.out.println(date);
	}
}
