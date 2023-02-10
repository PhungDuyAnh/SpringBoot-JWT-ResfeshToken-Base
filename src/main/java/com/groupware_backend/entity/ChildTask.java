package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "child_task")
public class ChildTask implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chld_task_id")
    private Long chldTaskID;

    @Column(name = "chld_task_name", length = 55)
    private String chldTaskName;

    @Column(name = "status_chld_task")
    private int statusChldTask;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

}
