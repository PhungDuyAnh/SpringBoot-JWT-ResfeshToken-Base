package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userID;

    @Column(name = "user_name", length = 55)
    private String userName;

    @Column(name = "full_name", length = 55)
    private String fullName;

    @NotBlank
    @Column(name = "password",length = 300)
    private String password;

    @Column(length = 55)
    private String email;

    @Column(length = 250)
    private String address;

    @Column(length = 55)
    private String position;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<UserRoleDept> userRoleDepts;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(  name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Users() {
    }

    public Users(String userName, String fullName, @NotBlank String password, String email, String address, String position) {
        this.userName = userName;
        this.fullName = fullName;
        this.password = password;
        this.email = email;
        this.address = address;
        this.position = position;
    }

//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

}
