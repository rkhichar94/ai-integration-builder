package com.example.integration.config;

import com.example.integration.model.ApiConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApiConfigRepository extends JpaRepository<ApiConfig, Long> {
    Optional<ApiConfig> findByAppNameAndOperation(String appName, String operation);
}