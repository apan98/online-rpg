package com.fastCounting.service;

import com.fastCounting.domain.model.User;

public interface SessionService {

    /**
     * @return get current user
     */
    User current();

}