package com.babs.inscriptionservice.api.controller;

import com.babs.inscriptionservice.api.entity.Classe;
import com.babs.inscriptionservice.api.entity.Eleve;
import com.babs.inscriptionservice.api.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping(value ="/findClasse")
    public List<Classe> findAll(){
        return classeService.getClasses();
    }

    @PostMapping(value = "/addClasse")
    public Classe save(@RequestBody Classe c){
        return classeService.saveClasse(c);
    }
}
