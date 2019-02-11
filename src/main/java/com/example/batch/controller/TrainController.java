package com.example.batch.controller;

import com.example.batch.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TrainController {

    @Autowired
    private TrainService service;

    @GetMapping("/read")
    public HttpStatus readFile() {
        long start = System.nanoTime();
        System.out.println(LocalDateTime.now());
        service.saveTrain();
        long finish = System.nanoTime();
        System.out.println(LocalDateTime.now());
        System.out.println(start + " : " + finish);
        System.out.println((finish - start)/(1000000000));
        return HttpStatus.OK;
    }
}
