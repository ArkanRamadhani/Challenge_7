package com.CH7.Transactional7.controller;

import com.CH7.Transactional7.dto.TransferRequest;
import com.CH7.Transactional7.entity.Rekening;
import com.CH7.Transactional7.service.RekeningService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rekening")
public class RekeningController {

    @Autowired
    private RekeningService service;

    @PostMapping
    public Rekening create(@RequestBody Rekening rekening){
        return service.create(rekening);
    }

    @GetMapping
    public Iterable<Rekening> findAll(){
        return service.findAll();
    }

    @PostMapping("/transfer")
    public void transfer(@RequestBody TransferRequest transfer){
        service.transfer(transfer.getNorek1(), transfer.getNorek2(), transfer.getAmount());
    }
}