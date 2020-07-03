package com.blog.blogmodelo.service;

import com.blog.blogmodelo.model.Users;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BlogModeloUsersService {

    List<Users> findAll();
    Users findById(long Id);
    Users save(Users users);

}
