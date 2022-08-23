package com.myweb.home.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.myweb.home.account.model.AccountDTO;

@Controller
@RequestMapping(value="/account")
public class AccountController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "account/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(String username, String password) {
		return "redirect:/";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join() {
		return "account/join";
	}
	
	@RequestMapping(value="join", method=RequestMethod.POST)
	public String join(AccountDTO accountDto) {
		return "redirect:/";
	}
	
}
