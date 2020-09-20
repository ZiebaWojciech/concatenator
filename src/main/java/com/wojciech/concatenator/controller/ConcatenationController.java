package com.wojciech.concatenator.controller;

import com.wojciech.concatenator.repository.DataRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {
    private DataRepository dataRepository;

    @GetMapping("/concatenate")
    public Object concatenate(){
        Object[] values = dataRepository.getValuesFromEachSource();
        return null;
    }
}
