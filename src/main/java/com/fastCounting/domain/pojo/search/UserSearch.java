package com.fastCounting.domain.pojo.search;

import com.fastCounting.domain.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserSearch extends BasicSearch {
    /**
     * {@link User#getRole()}
     */
    private List<String> roles;
}