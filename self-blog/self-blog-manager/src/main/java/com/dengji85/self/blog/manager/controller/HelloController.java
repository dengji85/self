package com.dengji85.self.blog.manager.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dengji85.self.blog.entity.TUser;
import com.dengji85.self.blog.service.Hello;
import com.dengji85.self.blog.service.TUserService;

@Controller
public class HelloController {
	@Autowired
	private Hello h;
	@Autowired
	private TUserService s;

	@RequestMapping("/say")
	@ResponseBody
	public String say() {
		String s = "";
		return "manager" + h.sayHello(new Date().toString());
	}
	@RequestMapping("/a")
	@ResponseBody
	public List<TUser> a() {
		return this.s.getAll();
	}
}
