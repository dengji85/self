package com.dengji85.self.blog.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dengji85.self.blog.core.entity.TUser;

public interface UserRepository extends JpaRepository<TUser, Long> {

}
