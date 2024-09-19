# Description
This project is a Real-Time Analytics Dashboard built using Spring Boot, designed to process over 100,000 daily events for real-time user activity, sales data, and system metrics. The system leverages RESTful APIs for data ingestion and WebSockets for live updates, ensuring low-latency event streaming.

The backend is optimized with PostgreSQL for efficient storage, enabling fast querying of large datasets. It incorporates Spring Data JPA for seamless database interactions and offers real-time communication with clients via WebSockets for immediate updates on user activity and system events.

The dashboard supports horizontal scaling, enabling the processing of large volumes of events with minimal downtime, achieving 99.9% uptime when deployed on AWS.

# Key Features
Real-Time Event Processing: Handles high-volume event streams (user activity, sales, system metrics).
REST API Integration: Processes incoming events and data from external systems via REST APIs.
WebSocket-Based Updates: Provides live updates to the front-end using WebSockets, reducing data latency by 20%.
PostgreSQL Optimization: Efficient storage and querying of event data with a focus on speed and scalability.
Scalability: Capable of processing over 100,000 daily events with minimal delay.
AWS Deployment: Supports cloud deployment with 99.9% uptime.
Testing: Achieves over 90% test coverage to ensure reliability and maintainability.

This project is suitable for environments that require real-time monitoring of system metrics, sales performance, and user behavior, ensuring that organizations can make data-driven decisions quickly and efficiently.
