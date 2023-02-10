package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
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
    @Size(max = 120)
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
    @JoinTable(  name = "user_role_dept",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<StatusTimeOff> statusTimeOffs;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MtgUser> mtgUsers;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Report> reports;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<WorkContract> workContracts;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<UserTask> userTasks;

    public Users() {
    }

    public Users(String username, String email, String password) {
        this.userName = username;
        this.email = email;
        this.password = password;
    }

//    public Set<Role> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<Role> roles) {
//        this.roles = roles;
//    }

}
