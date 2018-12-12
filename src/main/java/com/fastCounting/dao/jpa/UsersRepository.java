package com.fastCounting.dao.jpa;

import com.fastCounting.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Long> {

    User getByUsername(String username);

}