package com.bteam.test.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.bteam.test.config.UserDetailsImpl;
import com.bteam.test.model.User;

@Controller
public class UserController {

	// 회원가입 페이지
	@GetMapping("/auth/joinForm")
	public String main() {
		return "user/joinForm";
	}

	// 로그인 페이지
	@GetMapping("/auth/loginForm")
	public String login() {
		return "user/loginForm";
	}

	@GetMapping("/user/mypage")
	public String userInfo(Model model, @AuthenticationPrincipal UserDetailsImpl userDetails) {
		model.addAttribute("username", userDetails.getUsername());
		model.addAttribute("password", userDetails.getPassword());
		model.addAttribute("userid", userDetails.getUserid());
		model.addAttribute("email", userDetails.getEmail());
		model.addAttribute("phonenumber", userDetails.getphoneNumber());

		return "/user/myPage";
	}
}
