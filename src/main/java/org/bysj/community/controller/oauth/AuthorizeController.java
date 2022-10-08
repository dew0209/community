package org.bysj.community.controller.oauth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Copyright (c) by [安徽航天信息]
 *
 * @author LvLu
 * @className AuthorizeController
 * @date 2022-10-08 20:39
 * @description github OAuth
 */
@Controller
public class AuthorizeController {
	@GetMapping("/callback")
	public String callback(@RequestParam(name="code")String code,
						   @RequestParam(name="state")String state,
						   Model model){

		return "index";
	}
}
