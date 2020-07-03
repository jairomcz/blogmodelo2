package com.blog.blogmodelo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ImplUserDetailsServices userDetailsService;

    private static final String[] AUTH_LIST = {
            "/",
            "/posts",
            "/posts/{id}",
            "/admin/users"//metodo admin
    };
    private static final String[] ADMIN_LIST = {
            "/admin/newuser"
    };
    private static final String[] USER_LIST = {
            "/newpost"
    };

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests()
                .antMatchers(AUTH_LIST).permitAll()
                .antMatchers(HttpMethod.GET,ADMIN_LIST).hasRole("ADMIN")
                .antMatchers(HttpMethod.POST,ADMIN_LIST).hasRole("ADMIN")
                .antMatchers(HttpMethod.GET,USER_LIST).hasRole("USER")
                .antMatchers(HttpMethod.POST,USER_LIST).hasRole("USER")
                .anyRequest().authenticated()
                .and().formLogin().permitAll()
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailsService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception{
        web.ignoring().antMatchers("/bootstrap/**");
//        web.ignoring().antMatchers("/bootstrap/**", "/style/**");
    }
}