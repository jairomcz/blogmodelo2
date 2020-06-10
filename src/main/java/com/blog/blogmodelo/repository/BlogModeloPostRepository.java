package com.blog.blogmodelo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.blogmodelo.model.Post;



@Repository
public interface BlogModeloPostRepository extends JpaRepository<Post, Long>{
Post findBy(long id);
}
