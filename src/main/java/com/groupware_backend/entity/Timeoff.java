package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "timeoff")
public class Timeoff implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toff_id")
    private Long toffID;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(length = 30)
    private String type;

    @Column(length = 250)
    private String reason;

    @OneToMany(mappedBy = "timeoff", cascade = CascadeType.ALL)
    private List<StatusTimeOff> statusTimeOffs;

}
