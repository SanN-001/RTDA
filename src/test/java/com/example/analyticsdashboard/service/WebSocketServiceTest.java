package com.example.analyticsdashboard.service;

import com.example.analyticsdashboard.service.websocket.WebSocketService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

import static org.mockito.Mockito.verify;

class WebSocketServiceTest {

    @Mock
    private SimpMessagingTemplate messagingTemplate;

    @InjectMocks
    private WebSocketService webSocketService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void sendEventToClients_shouldSendMessage() {
        String destination = "/topic/events";
        String message = "Test Message";

        webSocketService.sendEventToClients(destination, message);

        verify(messagingTemplate).convertAndSend(destination, message);
    }
}
