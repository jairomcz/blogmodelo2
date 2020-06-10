package com.blog.blogmodelo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blogmodelo.model.Post;
import com.blog.blogmodelo.service.BlogModeloPostService;

import com.blog.blogmodelo.repository.BlogModeloPostRepository;

@Service
public class BlogModeloPostServiceImpl implements BlogModeloPostService {

	@Autowired
    BlogModeloPostRepository blogmodelopostrepository;


	@Override
	public List<Post> findAll() {
		return blogmodelopostrepository.findAll();
	}

	@Override
	public Post findById(long id) {

		return blogmodelopostrepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogmodelopostrepository.save(post);
	}
}