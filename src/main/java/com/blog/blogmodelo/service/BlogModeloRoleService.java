package com.blog.blogmodelo.service;


import com.blog.blogmodelo.model.Role;

import java.util.List;

public interface BlogModeloRoleService {

   List<Role> findAll();
   Role findById(long id);

}
