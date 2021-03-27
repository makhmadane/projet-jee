package com.babs.inscriptionservice.api.service;

import com.babs.inscriptionservice.api.entity.Eleve;
import com.babs.inscriptionservice.api.repository.EleveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EleveService  {
    @Autowired
    private EleveRepository eleveRepository;

    public List<Eleve> getEleves(){
        return  eleveRepository.findAll();
    }
    public Eleve saveEleve(Eleve eleve){
        return eleveRepository.save(eleve);
    }
}
