package com.example.analyticsdashboard.controller;

import com.example.analyticsdashboard.model.Event;
import com.example.analyticsdashboard.service.analytics.EventAnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private EventAnalyticsService eventAnalyticsService;

    @PostMapping("/events")
    public void handleEvent(@RequestBody Event event) {
        eventAnalyticsService.processEvent(event);
    }
}
