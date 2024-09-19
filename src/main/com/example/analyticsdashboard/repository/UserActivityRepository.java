package com.example.analyticsdashboard.repository;

import com.example.analyticsdashboard.model.UserActivityEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserActivityRepository extends JpaRepository<UserActivityEvent, Long> {
}
