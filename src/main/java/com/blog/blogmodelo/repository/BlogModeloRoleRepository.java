package com.blog.blogmodelo.repository;

import com.blog.blogmodelo.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogModeloRoleRepository extends JpaRepository<Role, Long> {

}
