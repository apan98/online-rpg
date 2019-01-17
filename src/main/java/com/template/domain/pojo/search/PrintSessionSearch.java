package com.template.domain.pojo.search;

import com.template.domain.model.PrintSession;
import lombok.Data;

@Data
public class PrintSessionSearch extends BasicSearch {
    /**
     * {@link PrintSession#getUserId()}
     */
    private Long userId;
}
