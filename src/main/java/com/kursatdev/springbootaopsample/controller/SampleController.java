package com.kursatdev.springbootaopsample.controller;

import com.kursatdev.springbootaopsample.model.SampleData;
import com.kursatdev.springbootaopsample.service.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @PostMapping("/sample")
    public ResponseEntity<?> getSampleMessage(@RequestBody SampleData sampleData) {
        String result = sampleService.getMessage(sampleData);
        return ResponseEntity.ok().body(result);
    }
}
