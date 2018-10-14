package com.shablon.domain.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Data
@Entity
@Table(name = "roles")
public class  Role implements GrantedAuthority{

    @Id private Long id;
    @NotNull private String authority;

}
