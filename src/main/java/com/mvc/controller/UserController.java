package com.mvc.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.spring.User;
import com.mvc.spring.UserService;

@Controller

public class UserController {
	
	private final UserService userService;
	
	@Inject
	public UserController(UserService userService){
		this.userService=userService;
	}
	
	
	@RequestMapping({"/","/home"})
	public String firstHit(Model model){
		
		model.addAttribute(new User());
		return "regForm";
		
	}

	@RequestMapping({"/edit","/new"})
	public String newUser(Model model){
		
		System.out.println("In first Hits ");
		return "welcome";
		
	}
	@RequestMapping(value="/users",method=GET)
	public String listUser(@RequestParam("user") String userName,Model model){
		User user=null;
		try{
		user=userService.getUser(userName);
		}
		catch(Exception exp){
			model.addAttribute("Exception",exp.getStackTrace().toString());
			return "error";
		}
		System.out.println(user);
		//System.out.println(user.getClass().getDeclaredMethods());
		System.out.println(user.getAge());
		model.addAttribute("user",user);
		/*model.addAttribute("userName",user.getUserName());
		model.addAttribute("Age", user.getAge());
		model.addAttribute("Address", user.getAddress());
		*/return "list";
		
	}
}
