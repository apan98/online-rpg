package com.shablon.crud.impl;

import com.shablon.crud.UserCrud;
import com.shablon.crud.jpa.UserRepository;
import com.shablon.domain.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserCrudImpl implements UserCrud {

    private UserRepository userRepository;

    @Override
    public Users getByUsername(String username) {
        return userRepository.getByUsername(username);
    }
}
