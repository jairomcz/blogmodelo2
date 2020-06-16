package com.blog.blogmodelo.configuration;

import com.blog.blogmodelo.model.Users;
import com.blog.blogmodelo.repository.BlogModeloUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class ImplUserDetailsServices implements UserDetailsService {

  @Autowired
    BlogModeloUsersRepository ur;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = ur.findByUserName(username);
        if(users == null){
            throw new UsernameNotFoundException("Usuário não encontrado");

        }
    return users;
    }

}