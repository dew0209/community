package org.bysj.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Copyright (c) by [安徽航天信息]
 *
 * @author LvLu
 * @className IndexController
 * @date 2022-10-08 19:55
 * @description 登录页
 */
@Controller
public class IndexController {
	@GetMapping({"/","/index"})
	public String index(){
		return "index";
	}
}
