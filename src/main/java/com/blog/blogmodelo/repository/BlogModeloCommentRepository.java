package com.blog.blogmodelo.repository;

import com.blog.blogmodelo.model.Comment;
import com.blog.blogmodelo.model.Post;
import com.blog.blogmodelo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogModeloCommentRepository extends JpaRepository<Comment, Long> {

    Iterable<Comment> findByUsers(Users users);
    //Iterable<Comment> findByPosts(Post post);
}
