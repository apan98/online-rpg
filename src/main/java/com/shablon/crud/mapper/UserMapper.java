package com.shablon.crud.mapper;

import com.shablon.domain.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    
    List<Users> getAll(@Param("map") HashMap map);
    
    Long getCount(@Param("map") HashMap map);

}
