package com.example.analyticsdashboard.service;

import com.example.analyticsdashboard.model.Event;
import com.example.analyticsdashboard.repository.EventRepository;
import com.example.analyticsdashboard.service.analytics.EventAnalyticsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;

class EventAnalyticsServiceTest {

    @Mock
    private EventRepository eventRepository;

    @InjectMocks
    private EventAnalyticsService eventAnalyticsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void processEvent_shouldSaveEvent() {
        Event event = new Event();
        event.setType("test");
        event.setData("test data");
        event.setTimestamp(System.currentTimeMillis());

        eventAnalyticsService.processEvent(event);

        verify(eventRepository).save(event);
    }
}
