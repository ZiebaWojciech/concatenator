package com.wojciech.concatenator.controller;

import com.wojciech.concatenator.dto.ConcatenationResult;
import com.wojciech.concatenator.repository.DataRepository;
import com.wojciech.concatenator.service.ConcatenationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcatenationController {
    private DataRepository dataRepository;
    private ConcatenationService concatenationService;

    @Autowired
    public ConcatenationController(DataRepository dataRepository,
            ConcatenationService concatenationService) {
        this.dataRepository = dataRepository;
        this.concatenationService = concatenationService;
    }

    @GetMapping("/concatenate")
    public ConcatenationResult concatenate(){
        Object[] values = dataRepository.getValuesFromEachSource();
        return concatenationService.concatenate(values);
    }
}
