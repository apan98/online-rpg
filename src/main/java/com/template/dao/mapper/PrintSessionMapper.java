package com.template.dao.mapper;

import com.template.domain.model.PrintSession;
import com.template.domain.pojo.search.PrintSessionSearch;
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
