package com.swang;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by swang on 2/22/2016.
 */
//@Component
public class CustomJdbcUserDetailsService /*extends JdbcDaoImpl*/ {

    //@Override
    public List<GrantedAuthority> loadUserAuthorities(String username) {
        //return super.loadUserAuthorities(username);
        return null;
    }
}
