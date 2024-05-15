package com.example.helloworld;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class ApiResponse<T> {
    private String code;
    private boolean status;
    private String message;
    private T data;
}
