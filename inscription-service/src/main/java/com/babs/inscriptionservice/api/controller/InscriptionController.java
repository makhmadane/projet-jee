package com.babs.inscriptionservice.api.controller;

import com.babs.inscriptionservice.api.entity.Eleve;
import com.babs.inscriptionservice.api.entity.Inscription;
import com.babs.inscriptionservice.api.service.EleveService;
import com.babs.inscriptionservice.api.service.InscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscription")
public class InscriptionController {

    @Autowired
    private InscriptionService inscriptionService;

    @PostMapping(value = "/save")
    public Inscription save(@RequestBody Inscription inscription){

        return inscriptionService.saveInsc(inscription);
    }

    @PostMapping(value = "/addInscription")
    public Inscription saveDocument(@RequestBody Inscription transactionRequest){

        return inscriptionService.saveInscription(transactionRequest);
    }
}
