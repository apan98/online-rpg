package com.template.configuration;

import com.template.dao.UserDao;
import com.template.domain.model.Role;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        com.template.domain.model.User user = userDao.getByUsername(userName);
        List<Role> roles = new ArrayList<>();
        roles.add(user.getRole());
        return new User(user.getUsername(), user.getPassword(), roles);
    }
}