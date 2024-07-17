package com.analytics.social.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.analytics.social.entity.Analytics;
import com.analytics.social.entity.User;
import com.analytics.social.repository.AnalyticsRepository;
import com.analytics.social.repository.UserRepository;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Override
    public void run(String... args) throws Exception {
        // Adding dummy Indian users
        userRepository.save(new User("Rahul Sharma", "Food Blogger", "Loves sharing recipes.", "rahul@gmail.com", "https://rahulfoodblog.com"));
        userRepository.save(new User("Priya Singh", "Tech Enthusiast", "Passionate about technology.", "priya@gmail.com", "https://priyatechblog.com"));
        userRepository.save(new User("Amit Patel", "Travel Vlogger", "Exploring the beauty of India.", "amit@gmail.com", "https://amittravelblog.com"));
        userRepository.save(new User("Neha Gupta", "Fitness Coach", "Helping others stay fit.", "neha@gmail.com", "https://nehafitness.com"));
        
        // Adding dummy analytics data for the users
        analyticsRepository.save(new Analytics(1200, 180, 250, 6000, 350, 150, 15, 60, 120, 250, 600, 400));
        analyticsRepository.save(new Analytics(800, 120, 300, 3000, 200, 90, 5, 30, 80, 150, 300, 200));
        analyticsRepository.save(new Analytics(950, 130, 280, 4000, 250, 120, 10, 45, 110, 200, 400, 300));
        analyticsRepository.save(new Analytics(1100, 170, 220, 5000, 300, 130, 20, 55, 130, 250, 550, 350));
    }
}
