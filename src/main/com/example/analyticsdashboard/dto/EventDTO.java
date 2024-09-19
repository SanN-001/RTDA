package com.example.analyticsdashboard.dto;

import lombok.Data;

@Data
public class EventDTO {
    private String type;
    private String data;
    private long timestamp;
}
