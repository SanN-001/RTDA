package com.example.analyticsdashboard.controller;

import com.example.analyticsdashboard.service.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketEventController {

    @Autowired
    private WebSocketService webSocketService;

    @MessageMapping("/events")
    @SendTo("/topic/events")
    public String broadcastEvent(String message) {
        // Send message to clients via WebSocket
        webSocketService.sendEventToClients("/topic/events", message);
        return message;
    }
}
