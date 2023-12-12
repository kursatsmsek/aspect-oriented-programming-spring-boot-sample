package com.kursatdev.springbootaopsample.service;

import com.kursatdev.springbootaopsample.model.SampleData;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getMessage(SampleData sampleData) {
        System.out.println("Hello " + sampleData.getName() + ". It's message from service.");
        return "Here is the sample result message";
    }
}
