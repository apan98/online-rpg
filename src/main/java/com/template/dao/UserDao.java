package com.template.dao;

import com.template.domain.model.User;
import com.template.domain.pojo.search.UserSearch;

public interface UserDao extends Pagination<User, UserSearch>{

    User getById(Long id);

    User getByUsername(String username);

    void update(User user);

    void create(User user);

}