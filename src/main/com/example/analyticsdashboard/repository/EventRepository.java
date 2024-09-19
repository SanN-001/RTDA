package com.example.analyticsdashboard.repository;

import com.example.analyticsdashboard.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
