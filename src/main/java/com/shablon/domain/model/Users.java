package com.shablon.domain.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id private Long id;
    @NotNull private String username;
    @NotNull private String password;

    @ManyToOne
    @JoinColumn(name = "roles_id")
    @NotNull private Role role;


}
