package com.fastCounting.service.impl;

import com.fastCounting.dao.jpa.UsersRepository;
import com.fastCounting.domain.model.User;
import com.fastCounting.service.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SessionServiceImpl implements SessionService {

    private UsersRepository usersRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public User current() {
        return usersRepository.getByUsername(SecurityContextHolder.getContext().getAuthentication().getName());
    }

}