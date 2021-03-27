package com.babs.inscriptionservice.api.controller;

import com.babs.inscriptionservice.api.entity.Eleve;
import com.babs.inscriptionservice.api.service.EleveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eleve")
public class EleveController {

    @Autowired
    private EleveService eleveService;

    @GetMapping(value ="/findEleve")
    public List<Eleve> findAll(){
        return eleveService.getEleves();
    }

    @PostMapping(value = "/addEleve")
    public Eleve save(@RequestBody Eleve e){
        return eleveService.saveEleve(e);
    }
}
