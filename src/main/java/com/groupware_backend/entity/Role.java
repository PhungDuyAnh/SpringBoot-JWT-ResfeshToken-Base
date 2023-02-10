package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleID;

//    @Column(name = "role_name", length = 55)
//    private String roleName;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole roleName;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    private List<UserRoleDept> userRoleDepts;

}
