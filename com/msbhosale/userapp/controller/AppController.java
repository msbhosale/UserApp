package com.msbhosale.userapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.msbhosale.userapp.beans.User;
import com.msbhosale.userapp.service.UserService;

@Controller
public class AppController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String loginPage(ModelMap map) {

		map.addAttribute("user", new User("", "", "", "", false));

		return "login";
	}

	@PostMapping("/login")
	public String performLogin(@ModelAttribute("user") User user) {

		String view = null;

		System.out.println(user);

		if (userService.isValidUser(user)) {
			view = "redirect:/welcome";
		} else {
			view = "redirect:/";
		}

		return view;
	}

	@GetMapping("/welcome")
	public String welcomePage() {

		return "home";
	}

	@GetMapping("/register")
	public String registrationPage(ModelMap map) {

		map.addAttribute("user", new User("", "", "", "", false));

		return "register";
	}

	@PostMapping("/doRegistration")
	public String registration(@ModelAttribute("userinfo") User user) {

		System.out.println(user);

		userService.registerUser(user);

		return "redirect:/register-success";
	}

	@GetMapping("/register-success")
	public String registrationSuccessPage() {

		return "register-success";
	}
	
	@GetMapping("/mylogin")
	public String randomPage() {
		
		return "mylogin";
	}
	
	@GetMapping("/myregister")
	public String randomPage2() {
		
		return "myregister";
	}
}