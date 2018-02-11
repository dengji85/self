package com.dengji85.self.blog.core.service.impl;

import org.springframework.stereotype.Service;

import com.dengji85.self.blog.service.Hello;
@Service("helloService")
public class HelloServiceImpl implements Hello {

	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "core:"+str;
	}

}
