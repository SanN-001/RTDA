package com.example.analyticsdashboard.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String type;
    private String data;
    private long timestamp;
}
