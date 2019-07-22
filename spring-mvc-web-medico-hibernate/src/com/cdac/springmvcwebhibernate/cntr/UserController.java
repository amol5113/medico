package com.cdac.springmvcwebhibernate.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.springmvcwebhibernate.dto.Doctor;
import com.cdac.springmvcwebhibernate.dto.DoctorAll;
import com.cdac.springmvcwebhibernate.dto.User;
import com.cdac.springmvcwebhibernate.serv.UserService;


@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/prep_login_form.htm")
	public String prepLoginForm(ModelMap model) {
		model.put("user", new User());
		//model.put("doctor", new Doctor());
		return "user";
	}

	@RequestMapping(value = "/prep_reg_form.htm")
	public String prepRegForm(ModelMap model) {
		model.put("user", new User());
		model.put("doctor", new Doctor());
		return "reg";
	}

	@RequestMapping(value = "/user.htm")
	public String register(User user , ModelMap model) {
		userService.insert(user);
		model.put("user", new User());
		//System.out.println(doctorAll);
		model.put("doctor", new Doctor());
		return "user";
	}
	
	/*@RequestMapping(value = "/user.htm")
	public String register(DoctorAll doctorAll,ModelMap model) {
		userService.insert(doctorAll);
		//model.put("user", new User());
		model.put("doctorAll", new DoctorAll());
		return "user";
	}*/
/*
	@RequestMapping(value = "/login.htm")
	public String login(User user,ModelMap model,HttpSession session) {

		boolean b = userService.checkUser(user);
		if(b) {
			session.setAttribute("user", user);
			return "home";
		}
		model.put("user", new User());
		return "index";
	}
*/	/*
	@RequestMapping(value = "/user_list.htm")
	public String userList(ModelMap model) {
		List<User> ulist = userService.selectAllUsers();
		model.put("ul", ulist);
		return "user_list";
	}

	@RequestMapping(value = "/delete_user.htm")
	public String deleteUser(@RequestParam int userId,ModelMap model) {
		userService.removeUser(userId);
		List<User> ulist = userService.selectAllUsers();
		model.put("ul", ulist);
		return "user_list";
	}
*/
}