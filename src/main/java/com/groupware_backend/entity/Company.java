package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "company")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "compn_id")
    private Long compnID;

    @Column(name = "compn_name", length = 55)
    private String compnName;

    @OneToMany(mappedBy = "compn", cascade = CascadeType.ALL)
    private List<Department> department;

}
