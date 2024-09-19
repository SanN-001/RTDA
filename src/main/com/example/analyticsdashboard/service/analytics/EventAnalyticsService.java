package com.example.analyticsdashboard.service.analytics;

import com.example.analyticsdashboard.model.Event;
import com.example.analyticsdashboard.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventAnalyticsService {

    @Autowired
    private EventRepository eventRepository;

    public void processEvent(Event event) {
        eventRepository.save(event);
        // Add analytics processing logic here
    }
}
