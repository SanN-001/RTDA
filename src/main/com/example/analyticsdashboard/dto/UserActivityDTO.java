package com.example.analyticsdashboard.dto;

import lombok.Data;

@Data
public class UserActivityDTO {
    private String username;
    private String action;
    private long timestamp;
}
