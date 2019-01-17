package com.template.dao;

import com.template.domain.pojo.search.BasicSearch;

import java.util.List;

public interface Pagination<Entity, SearchRequest extends BasicSearch> {

    List<Entity> getAll(SearchRequest searchRequest);

    Long getCount(SearchRequest searchRequest);

}