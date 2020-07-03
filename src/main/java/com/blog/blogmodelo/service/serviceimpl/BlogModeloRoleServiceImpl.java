package com.blog.blogmodelo.service.serviceimpl;

import com.blog.blogmodelo.model.Role;
import com.blog.blogmodelo.repository.BlogModeloRoleRepository;
import com.blog.blogmodelo.service.BlogModeloRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogModeloRoleServiceImpl implements BlogModeloRoleService {

    @Autowired
    BlogModeloRoleRepository bmrr;


    @Override
    public List<Role> findAll() {
        return bmrr.findAll();
    }

    @Override
    public Role findById(long id) {
        return bmrr.findById(id).get();
    }

}
