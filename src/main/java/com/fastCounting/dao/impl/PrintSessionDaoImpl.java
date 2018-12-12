package com.fastCounting.dao.impl;

import com.fastCounting.dao.PrintSessionDao;
import com.fastCounting.dao.jpa.PrintSessionRepository;
import com.fastCounting.dao.mapper.PrintSessionMapper;
import com.fastCounting.domain.model.PrintSession;
import com.fastCounting.domain.pojo.search.PrintSessionSearch;
import com.fastCounting.service.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PrintSessionDaoImpl implements PrintSessionDao {
    private SessionService sessionService;
    private PrintSessionMapper printSessionMapper;
    private PrintSessionRepository printSessionRepository;

    @Override
    public void create(PrintSession printSession) {
        printSession.setUserId(sessionService.current().getId());
        printSessionRepository.save(printSession);
    }

    @Override
    public Long getCount(PrintSessionSearch printSessionSearch) {
        return printSessionMapper.getCount(printSessionSearch);
    }

    @Override
    public List<PrintSession> getAll(PrintSessionSearch printSessionSearch) {
        List<PrintSession> printSessions = printSessionMapper.getAll(printSessionSearch);
        System.out.println(printSessions);
        return printSessions;

    }
}
