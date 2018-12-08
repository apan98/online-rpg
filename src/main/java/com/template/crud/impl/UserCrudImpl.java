package com.template.crud.impl;

import com.template.crud.UserCrud;
import com.template.crud.jpa.UsersRepository;
import com.template.crud.mapper.UserMapper;
import com.template.domain.model.Users;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@AllArgsConstructor
public class UserCrudImpl implements UserCrud {

    private UsersRepository usersRepository;
    private UserMapper userMapper;

    @Override
    public Users getByUsername(String username) {
        return usersRepository.getByUsername(username);
    }

    @Override
    public List<Users> getAll(HashMap map) {
        return userMapper.getAll(map);
    }

    @Override
    public Long getCount(HashMap map) {
        return userMapper.getCount(map);
    }
}
