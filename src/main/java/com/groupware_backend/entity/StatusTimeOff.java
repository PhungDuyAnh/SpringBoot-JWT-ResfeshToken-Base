package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "status_toff", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "toff_id"})
})
public class StatusTimeOff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stus_toff_id")
    private Long stusToffID;

    @Column(name = "create_date")
    private LocalDateTime createDate;

    @Column(name = "last_date")
    private LocalDateTime lastDate;

    @Column(name = "reveicer_user_id")
    private Long revUserId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "toff_id")
    private Timeoff timeoff;

}
