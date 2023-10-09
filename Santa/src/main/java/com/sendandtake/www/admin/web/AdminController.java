package com.sendandtake.www.admin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sendandtake.www.admin.service.AdminService;

@Controller
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	

}
