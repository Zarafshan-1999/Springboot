package com.example.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloService {
    @Autowired
    private  ApiResponse apiResponse;
    public ApiResponse hello(){
//        Object obj = "zarafshan";
        // Create an ArrayList of Strings
        List<String> stringList = new ArrayList<>();

        // Add elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        if(stringList instanceof ArrayList<String>){
            apiResponse.setCode("200");
            apiResponse.setStatus(true);
            apiResponse.setMessage("String input");
            apiResponse.setData(stringList);
        }
        return apiResponse;
    }
}


