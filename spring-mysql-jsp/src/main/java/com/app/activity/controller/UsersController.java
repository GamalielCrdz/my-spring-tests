package com.app.activity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.app.activity.entity.User;
import com.app.activity.repository.CountryServices;
import com.app.activity.repository.UserServices;

@Controller
public class UsersController {

	@Autowired
	CountryServices countryServices;
	
	@Autowired
	UserServices userServices;
	
	@RequestMapping("/user")
	public String form(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("countries", countryServices.allCountries());
		return "userForm";
	}
	
	@RequestMapping("/user/addUser")
	public String addUser(User user) {
		userServices.saveUser(user);
		return "redirect:/userList";
	}
	
	@RequestMapping("/userList")
	public String userList(Model model) {
		model.addAttribute("users", userServices.allUsers());
		return "userList";
	}
	
	@RequestMapping("/userList/deleteUser/{id}")
	public String deleteUser(@PathVariable Long id) {
		userServices.deleteUser(id);
		return "redirect:/userList";
	}
	
	@RequestMapping("/userList/updateUser/{id}")
	public String updateUser(@PathVariable Long id, Model model) {
		model.addAttribute("user", userServices.findById(id));
		model.addAttribute("countries", countryServices.allCountries());
		return "userForm";
	}
}
