package com.analytics.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.analytics.social.entity.Analytics;
import com.analytics.social.repository.AnalyticsRepository;

@Service
public class AnalyticsService {
    @Autowired
    private AnalyticsRepository analyticsRepository;

    public List<Analytics> getAllAnalytics() {
        return analyticsRepository.findAll();
    }
}
