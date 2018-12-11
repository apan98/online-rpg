package com.template.service;

import com.template.domain.model.User;

public interface SessionService {

    /**
     * @return get current user
     */
    User current();

}