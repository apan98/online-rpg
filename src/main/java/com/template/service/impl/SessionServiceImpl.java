package com.template.service.impl;

import com.template.dao.jpa.UsersRepository;
import com.template.domain.model.User;
import com.template.service.SessionService;
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