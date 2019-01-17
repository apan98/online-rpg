package com.template.dao.impl;

import com.template.dao.UserDao;
import com.template.dao.jpa.UsersRepository;
import com.template.dao.mapper.UserMapper;
import com.template.domain.model.User;
import com.template.domain.pojo.search.UserSearch;
import com.template.validation.UserValidation;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;

import java.util.List;

@Service
@AllArgsConstructor
public class UserDaoImpl implements UserDao {

    private UserMapper userMapper;
    private UsersRepository usersRepository;
    private UserValidation userValidation;

    @Override
    public User getById(Long id) {
        return usersRepository.getOne(id);
    }

    @Override
    public User getByUsername(String username) {
        return usersRepository.getByUsername(username);
    }

    @Override
    public List<User> getAll(UserSearch userSearch) {
        return userMapper.getAll(userSearch);
    }

    @Override
    public Long getCount(UserSearch userSearch) {
        return userMapper.getCount(userSearch);
    }

    @Override
    public void update(User user) {
        userValidation.validate(user, new BeanPropertyBindingResult(user, user.getClass().getName()), UserValidation.Code.UPDATE.name());
        user.setPassword(usersRepository.getOne(user.getId()).getPassword());
        usersRepository.save(user);
    }

    @Override
    public void create(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));
        userValidation.validate(user, new BeanPropertyBindingResult(user, user.getClass().getName()), UserValidation.Code.CREATE.name());
        usersRepository.save(user);
    }

}
