package org.bysj.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (c) by [安徽航天信息]
 *
 * @author LvLu
 * @className HelloController
 * @date 2022-10-08 19:03
 * @description
 */
@Controller
public class HelloController {
	@GetMapping("/helloWorld")
	public String hello(@RequestParam("name")String name, Model model){
		model.addAttribute("name",name);
		return "hello";
	}
}
