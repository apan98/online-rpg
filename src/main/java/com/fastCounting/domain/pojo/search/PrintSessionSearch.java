package com.fastCounting.domain.pojo.search;

import com.fastCounting.domain.model.PrintSession;
import lombok.Data;

@Data
public class PrintSessionSearch extends BasicSearch {
    /**
     * {@link PrintSession#getUserId()}
     */
    private Long userId;
}
