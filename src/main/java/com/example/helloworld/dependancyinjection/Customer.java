package com.example.helloworld.dependancyinjection;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Customer {
    private String custId;
    private String custName;
    private String custAdd;
}
