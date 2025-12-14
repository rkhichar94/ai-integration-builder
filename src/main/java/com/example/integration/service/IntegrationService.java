package com.example.integration.service;

import com.example.integration.config.ApiConfigRepository;
import com.example.integration.model.ApiConfig;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {

    private final ApiConfigRepository repo;
    private final GenericApiService apiService;

    public IntegrationService(ApiConfigRepository repo, GenericApiService apiService) {
        this.repo = repo;
        this.apiService = apiService;
    }

    public String fetchUsers(String app, String token) {
        ApiConfig cfg = repo.findByAppNameAndOperation(app, "FETCH_USERS")
                .orElseThrow(() -> new RuntimeException("Config not found"));
        return apiService.execute(cfg, token);
    }
}