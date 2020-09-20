package com.wojciech.concatenator.controller;

import com.wojciech.concatenator.repository.DataRepository;
import com.wojciech.concatenator.service.ConcatenationService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {
    private DataRepository dataRepository;
    private ConcatenationService concatenationService;

    @GetMapping("/concatenate")
    public Object concatenate(){
        Object[] values = dataRepository.getValuesFromEachSource();
        concatenationService.concatenate(values);
        return null;
    }
}
