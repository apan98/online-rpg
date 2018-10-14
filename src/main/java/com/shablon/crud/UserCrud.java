package com.shablon.crud;

import com.shablon.domain.model.Users;

public interface UserCrud {

    Users getByUsername(String username);

}
