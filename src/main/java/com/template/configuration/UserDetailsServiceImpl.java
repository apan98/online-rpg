package com.template.configuration;

import java.util.ArrayList;
import java.util.List;

import com.template.crud.UserCrud;
import com.template.domain.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserCrud userCrud;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Users user = userCrud.getByUsername(userName);
        List<Users.Role> roles = new ArrayList<>();
        roles.add(user.getRole());
        return new User(user.getUsername(), user.getPassword(), roles);
    }
}