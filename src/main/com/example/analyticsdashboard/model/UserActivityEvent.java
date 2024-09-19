package com.example.analyticsdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class UserActivityEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;
    private String action;
    private long timestamp;
}
