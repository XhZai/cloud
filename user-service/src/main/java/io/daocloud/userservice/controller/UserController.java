package io.daocloud.userservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Author: Grissom date: 2020/7/9 8:24 下午
 */
@RestController
public class UserController {
	@PostMapping("/user")
	public String  user() {
		return "hello world";
	}

}
