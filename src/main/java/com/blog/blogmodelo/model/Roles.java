package com.blog.blogmodelo.model;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

public class Roles implements GrantedAuthority {

    @Id
    private String nomeRole;

    @ManyToMany(mappedBy = "roles")
    private List<Users> users;

    public String getNomeRole() {
        return nomeRole;
    }

    public void setNomeRole(String nomeRole) {
        this.nomeRole = nomeRole;
    }

    public List<Users> getUsuarios() {
        return users;
    }

    public void setUsuarios(List<Users> usuarios) {
        this.users = users;
    }

    @Override
    public String getAuthority() {
        // TODO Auto-generated method stub
        return this.nomeRole;
    }
}
