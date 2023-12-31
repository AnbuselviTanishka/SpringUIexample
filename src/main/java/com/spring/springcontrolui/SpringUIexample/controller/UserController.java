package com.spring.springcontrolui.SpringUIexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springcontrolui.SpringUIexample.model.User;

@Controller
public class UserController {
	
	@RequestMapping("/registerationPage")
	public ModelAndView ShowRegistrationPage()
	{
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	@RequestMapping(value = "registerUser" , method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("regResult");
		modelAndView.addObject("name", user.getName());
		modelAndView.addObject("id", user.getId());
		modelAndView.addObject("email", user.getEmail());
		return modelAndView;
	}
}
