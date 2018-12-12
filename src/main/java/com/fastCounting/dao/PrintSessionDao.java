package com.fastCounting.dao;

import com.fastCounting.domain.model.PrintSession;
import com.fastCounting.domain.pojo.search.PrintSessionSearch;

public interface PrintSessionDao extends Pagination<PrintSession, PrintSessionSearch>{

    void create(PrintSession printSession);

}
