package com.analytics.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analytics.social.entity.Analytics;
import com.analytics.social.service.AnalyticsService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {
    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping
    public List<Analytics> getAllAnalytics() {
        return analyticsService.getAllAnalytics();
    }
}
