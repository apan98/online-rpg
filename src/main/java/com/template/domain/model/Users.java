package com.template.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class Users {

    @Id private Long id;
    @NotNull private String username;
    @NotNull private String password;

    @Enumerated(value = EnumType.STRING)
    @NotNull private Role role;

    public enum Role implements GrantedAuthority{
        ADMIN, USER;

        @Override
        public String getAuthority() {
            return name();
        }
    }
}


