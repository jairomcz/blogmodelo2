package com.blog.blogmodelo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.blogmodelo.model.Post;
import com.blog.blogmodelo.service.BlogModeloService;

import com.blog.blogmodelo.repository.BlogModeloRepository;

@Service
public class BlogModeloServiceImpl implements BlogModeloService {

	@Autowired
	BlogModeloRepository blogmodelorepository;


	@Override
	public List<Post> findAll() {
		return blogmodelorepository.findAll();
	}

	@Override
	public Post findById(long id) {

		return blogmodelorepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return blogmodelorepository.save(post);
	}
}