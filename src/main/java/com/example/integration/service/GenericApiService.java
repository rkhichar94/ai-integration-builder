package com.example.integration.service;

import com.example.integration.model.ApiConfig;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GenericApiService {

    private final RestTemplate restTemplate = new RestTemplate();

    public String execute(ApiConfig config, String token) {
        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(token);
        headers.set("Accept", "application/json");

        HttpEntity<Void> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response =
                restTemplate.exchange(config.getUrl(),
                        HttpMethod.valueOf(config.getHttpMethod()),
                        entity,
                        String.class);

        return response.getBody();
    }
}