package com.fastCounting.dao.jpa;

import com.fastCounting.domain.model.PrintSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintSessionRepository extends JpaRepository<PrintSession, Long> {
}
