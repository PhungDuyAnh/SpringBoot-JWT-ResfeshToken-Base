package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "mtg_user", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"user_id", "mtg_id"})
})
public class MtgUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mtg_user_id")
    private Long mtgUserID;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    @ManyToOne
    @JoinColumn(name = "mtg_id")
    private Meeting meet;

}
