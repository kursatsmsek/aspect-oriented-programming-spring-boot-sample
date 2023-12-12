package com.kursatdev.springbootaopsample.controller;

import com.kursatdev.springbootaopsample.service.SampleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SampleController {

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping
    public ResponseEntity<?> getSampleMessage() {
        String result = sampleService.getMessage();
        return ResponseEntity.ok().body(result);
    }
}
