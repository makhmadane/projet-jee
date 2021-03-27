package com.babs.inscriptionservice.api.service;

import com.babs.inscriptionservice.api.entity.Classe;
import com.babs.inscriptionservice.api.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {
    @Autowired
    private ClasseRepository classeRepository;

    public List<Classe> getClasses(){
        return  classeRepository.findAll();
    }
    public Classe saveClasse (Classe classe){
        return classeRepository.save(classe);
    }

    public Optional<Classe> getClasseById(Long id){
        return classeRepository.findById(id);
    }
}
