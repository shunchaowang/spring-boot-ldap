package com.swang;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.DirContextOperations;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by swang on 2/22/2016.
 */
//@Component
public class CustomLdapAuthoritiesPopulator /*implements LdapAuthoritiesPopulator*/ {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomLdapAuthoritiesPopulator.class);

//    @Autowired
//    private CustomJdbcUserDetailsService service;

    //@Override
    public Collection<? extends GrantedAuthority> getGrantedAuthorities(DirContextOperations dirContextOperations,
                                                                        String s) {
        return null;
    }
}
