package com.example.demo.dto;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ApiResponse {

    private Map<String, Object> data = new HashMap<>();
    private Map<String, Object> error = new HashMap<>();

    public ApiResponse() {

    }

    public ApiResponse addError(String key, Object value) {
        this.error.put(key, value);
        return this;
    }

    public ApiResponse addData(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
