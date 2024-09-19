package com.example.analyticsdashboard.service.analytics;

import com.example.analyticsdashboard.model.UserActivityEvent;
import com.example.analyticsdashboard.repository.UserActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserActivityAnalyticsService {

    @Autowired
    private UserActivityRepository userActivityRepository;

    public void processUserActivity(UserActivityEvent event) {
        userActivityRepository.save(event);
        // Add additional user activity analytics logic here
    }
}
