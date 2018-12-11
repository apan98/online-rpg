package com.template.dao;

import com.template.domain.model.User;
import com.template.domain.pojo.UserSearch;

import java.util.List;

public interface UserDao {

    User getById(Long id);

    User getByUsername(String username);

    List<User> getAll(UserSearch userSearch);
    
    Long getCount(UserSearch userSearch);

    void update(User user);

    void create(User user);

}
