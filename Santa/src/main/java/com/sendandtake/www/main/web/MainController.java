package com.sendandtake.www.main.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sendandtake.www.main.model.MainVO;
import com.sendandtake.www.main.model.ProductVO;
import com.sendandtake.www.main.service.MainService;

@Controller
public class MainController {
	
	@Autowired
	MainService mainService;
	
	@GetMapping("/")
	String main (Model model) {
		
		
	List<ProductVO> list = mainService.selectList();
	
	model.addAttribute("list", list);
		
		return "main";
	}

}
