package com.analytics.social.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.analytics.social.entity.Analytics;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    // Custom query methods can be defined here if needed
	// Find by number of followers greater than a specified number
    List<Analytics> findByFollowersGreaterThan(int followers);
    
    // Find by number of posts less than a specified number
    List<Analytics> findByPostsLessThan(int posts);
    
    // Find by account reach greater than a specified number
    List<Analytics> findByAccountReachGreaterThan(int reach);
    
   
}
