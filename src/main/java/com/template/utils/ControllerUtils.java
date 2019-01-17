package com.template.utils;

import com.template.controller.RestConstant;
import com.template.dao.Pagination;
import com.template.domain.pojo.search.BasicSearch;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

@Service
public class ControllerUtils<SearchRequest extends BasicSearch> {

    public HttpHeaders getTotalSize(Pagination pagination, SearchRequest searchRequest) {
        HttpHeaders headers = new HttpHeaders();
        if (searchRequest != null) {
            if (searchRequest.getPage() != null && searchRequest.getPage() > 0
                    && searchRequest.getSize() != null && searchRequest.getSize() > 0) {
                headers.add(RestConstant.TOTAL_COUNT, pagination.getCount(searchRequest).toString());
                return headers;
            } else return headers;
        } else return headers;
    }
}
