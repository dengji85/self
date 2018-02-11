package com.dengji85.self.blog.manager.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ShiroPage {
	@ExceptionHandler(AuthorizationException.class)
	@ResponseBody
	public  String notPermission () {
		return "没有权限";
	}

}
