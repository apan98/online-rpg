package com.template.domain.pojo;

import com.template.domain.model.User;
import lombok.Data;

import java.util.List;

@Data
public class UserSearch extends BasicSearch {
    /**
     * {@link User#getRole()}
     */
    private List<String> roles;
}