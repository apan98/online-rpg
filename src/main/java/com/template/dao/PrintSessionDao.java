package com.template.dao;

import com.template.domain.model.PrintSession;
import com.template.domain.pojo.search.PrintSessionSearch;

public interface PrintSessionDao extends Pagination<PrintSession, PrintSessionSearch>{

    void create(PrintSession printSession);

}
