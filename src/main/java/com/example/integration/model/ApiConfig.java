package com.example.integration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "api_config")
public class ApiConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "app_name")
    private String appName;

    @Column(name = "operation")
    private String operation;

    @Column(name = "url")
    private String url;

    @Column(name = "http_method")
    private String httpMethod;
    public Long getId() {
        return id;
    }

    public String getAppName() {
        return appName;
    }

    public String getOperation() {
        return operation;
    }

    public String getUrl() {
        return url;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }
}
