package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "report", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "dept_id"})
})
public class Report implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rpt_id")
    private Long rptID;

    @Column(name = "rpt_name", length = 55)
    private String rptName;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "reveicer_user_id")
    private Long revUserId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;

}
