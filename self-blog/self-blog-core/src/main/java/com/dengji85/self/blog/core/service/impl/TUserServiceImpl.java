package com.dengji85.self.blog.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dengji85.self.blog.core.repository.UserRepository;
import com.dengji85.self.blog.entity.TUser;
import com.dengji85.self.blog.service.TUserService;
@Service("tUserService")
public class TUserServiceImpl implements TUserService {
@Autowired
private UserRepository dao;
	@Override
	public List<TUser> getAll() {
		// TODO Auto-generated method stub
		List<TUser> r = new ArrayList<>();
		List<com.dengji85.self.blog.core.entity.TUser> list= dao.findAll();
		for (com.dengji85.self.blog.core.entity.TUser tUser : list) {
			r.add(new TUser(tUser.getUserName()));
		}
		return r;
	}

}
