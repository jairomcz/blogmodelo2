package com.blog.blogmodelo.service.serviceimpl;

import com.blog.blogmodelo.model.Role;
import com.blog.blogmodelo.model.Users;
import com.blog.blogmodelo.repository.BlogModeloUsersRepository;
import com.blog.blogmodelo.service.BlogModeloUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogModeloUsersServiceImpl implements BlogModeloUsersService {

    @Autowired
    BlogModeloUsersRepository bmur;


    @Override
    public List<Users> findAll() {
        return bmur.findAll();
    }

    @Override
    public Users findById(long Id) {
        return bmur.findById(Id);
    }

    @Override
    public Users save(Users users) {
        return bmur.save(users);
    }

}
