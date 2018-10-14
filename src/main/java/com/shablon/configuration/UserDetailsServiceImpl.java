package com.shablon.configuration;

import java.util.ArrayList;

import com.shablon.crud.UserCrud;
import com.shablon.domain.model.Role;
import com.shablon.domain.model.Users;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
        return new User(user.getUsername(), user.getPassword(), new ArrayList<Role>(){{add(user.getRole());}});
    }
}