package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	/**
	 * 进入主页
	 * @param model
	 * @return
	 */
	@RequestMapping("index.html")
	public String goto123(){
		return "index";
	}
	
	/**
	 * 进入开发者登录页
	 */
	@RequestMapping("manager/login")
	public String goIntoDev(){
		return "backendlogin";
	}
	
	/**
	 * 进入后台登录页
	 */
	@RequestMapping("dev/login")
	public String goIntoBack(){
		return "devlogin";
	}
}
