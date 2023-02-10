package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "department")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private Long deptID;

    @Column(name = "dept_name", length = 55)
    private String deptName;

    @ManyToOne
    @JoinColumn(name = "compn_id")
    private Company compn;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<UserRoleDept> userRoleDepts;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Task> tasks;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Report> reports;

}
