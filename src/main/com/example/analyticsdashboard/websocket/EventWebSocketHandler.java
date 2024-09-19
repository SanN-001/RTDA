package com.example.analyticsdashboard.websocket;

import com.example.analyticsdashboard.model.Event;
import com.example.analyticsdashboard.service.analytics.EventAnalyticsService;
import com.example.analyticsdashboard.service.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class EventWebSocketHandler extends TextWebSocketHandler {

    @Autowired
    private EventAnalyticsService eventAnalyticsService;

    @Autowired
    private WebSocketService webSocketService;

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // Parse the incoming message and map it to an Event
        Event event = new Event();
        event.setData(message.getPayload());
        event.setTimestamp(System.currentTimeMillis());

        // Process the event
        eventAnalyticsService.processEvent(event);

        // Send event back to WebSocket clients for real-time updates
        webSocketService.sendEventToClients("/topic/events", event);
    }
}
