package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "meeting")
public class Meeting implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mtg_id")
    private Long mtgID;

    @Column(name = "date_mtg")
    private LocalDateTime dateMtg;

    @Column(length = 155)
    private String address;

    @Column(name = "priority_level")
    private int priorityLevel;

    @Column(name = "status_mtg")
    private int statusMtg;

    @OneToMany(mappedBy = "meet", cascade = CascadeType.ALL)
    private List<MtgUser> mtgUsers;

}
