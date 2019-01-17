package com.template.dao.mapper;

import com.template.domain.model.User;
import com.template.domain.pojo.search.UserSearch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    
    List<User> getAll(@Param("searchRequest") UserSearch searchRequest);
    
    Long getCount(@Param("searchRequest") UserSearch searchRequest);

}
