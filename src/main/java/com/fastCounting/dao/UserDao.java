package com.fastCounting.dao;

import com.fastCounting.domain.model.User;
import com.fastCounting.domain.pojo.UserSearch;

import java.util.List;

public interface UserDao {

    User getById(Long id);

    User getByUsername(String username);

    List<User> getAll(UserSearch userSearch);
    
    Long getCount(UserSearch userSearch);

    void update(User user);

    void create(User user);

}
