package com.fastCounting.dao;

import com.fastCounting.domain.model.User;
import com.fastCounting.domain.pojo.search.UserSearch;

public interface UserDao extends Pagination<User, UserSearch>{

    User getById(Long id);

    User getByUsername(String username);

    void update(User user);

    void create(User user);

}