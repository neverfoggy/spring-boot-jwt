package com.kursach.controller;

import com.kursach.dao.DeptDao;
import com.kursach.dao.ElemDao;
import com.kursach.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController{
	@Autowired
	ElemDao elemDao;

	@Autowired
	DeptDao deptDao;

	@Autowired
	RoleDao roleDao;

	@GetMapping("/")
	public String firstPage() {

		return "login";
	}
	@GetMapping("/login")
	public String logPage() {
		return "login";
	}
	@GetMapping("/reg")
	public String regPage(Model model) {
		model.addAttribute("checker", roleDao.findAll());
		return "register";
	}
	@GetMapping("/user")
	public String userPage(Model model) {
		model.addAttribute("depts", deptDao.findAll());
		model.addAttribute("elems", elemDao.findAll());
		return "secure";
	}

	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

}

