package com.blog.blogmodelo.repository;


import com.blog.blogmodelo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BlogModeloUsersRepository extends JpaRepository<Users, String> {

 //Users findByLogin(String userName);
}
