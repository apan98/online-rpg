package com.fastCounting.dao.mapper;

import com.fastCounting.domain.model.PrintSession;
import com.fastCounting.domain.pojo.search.PrintSessionSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PrintSessionMapper {

    List<PrintSession> getAll(@Param("searchRequest") PrintSessionSearch searchRequest);

    Long getCount(@Param("searchRequest") PrintSessionSearch searchRequest);

}
