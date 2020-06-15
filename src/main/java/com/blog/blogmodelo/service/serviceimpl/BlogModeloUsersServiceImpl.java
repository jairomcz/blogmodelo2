//package com.blog.blogmodelo.service.serviceimpl;
//
//import com.blog.blogmodelo.model.Users;
//import com.blog.blogmodelo.repository.BlogModeloUsersRepository;
//import com.blog.blogmodelo.service.BlogModeloUsersService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class BlogModeloUsersServiceImpl implements BlogModeloUsersService {
//
//    @Autowired
//    BlogModeloUsersRepository blogmodelousersrepository;
//
//    @Override
//    public List<Users> findAll() {
//        return blogmodelousersrepository.findAll();
//    }
//
//    @Override
//    public Users findById(long id) {
//        return blogmodelousersrepository.findById(id).get();
//    }
//
//    @Override
//    public Users save(Users users) {
//        return blogmodelousersrepository.save(users);
//    }
//}
