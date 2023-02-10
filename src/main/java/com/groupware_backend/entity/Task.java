package com.groupware_backend.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "task")
public class Task implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id")
    private Long taskID;

    @Column(name = "task_name", length = 55)
    private String taskName;

    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    private String ratio;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<ChildTask> childTasks;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    private List<UserTask> userTasks;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;



}
