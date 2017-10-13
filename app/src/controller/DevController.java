package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.DevUserService;
import entity.DevUser;

@Controller
@RequestMapping("dev")
public class DevController {
	@Autowired
	private DevUserService devUserService;
	
	/**
	 * 登录操作
	 */
	@RequestMapping("dologin")
	public String doLogIn(@RequestParam("devCode")String devCode,@RequestParam("devPassword")String devPassword,Model model){
		if(devUserService.getByCode(devCode)!=null){
			return "developer/main";
		}else{
			model.addAttribute("error", "用户名不存在");
			return "devlogin";
		}
	}
}
