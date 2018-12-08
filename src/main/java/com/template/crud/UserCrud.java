package com.template.crud;

import com.template.domain.model.Users;

import java.util.HashMap;
import java.util.List;

public interface UserCrud {

    Users getByUsername(String username);
    
    List<Users> getAll(HashMap map);
    
    Long getCount(HashMap map);

}
