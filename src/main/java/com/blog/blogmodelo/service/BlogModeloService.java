package com.blog.blogmodelo.service;

import java.util.List;

import com.blog.blogmodelo.model.Post;

public interface BlogModeloService {

	List<Post> findAll();
	Post findById(long id);
	Post save(Post post);
}
