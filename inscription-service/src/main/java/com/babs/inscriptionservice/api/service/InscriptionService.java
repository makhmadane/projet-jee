package com.babs.inscriptionservice.api.service;

import com.babs.inscriptionservice.api.DTO.DocumentDTO;

import com.babs.inscriptionservice.api.entity.Classe;
import com.babs.inscriptionservice.api.entity.Eleve;
import com.babs.inscriptionservice.api.entity.Inscription;
import com.babs.inscriptionservice.api.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class InscriptionService {
    @Autowired
    private InscriptionRepository inscriptionRepository;
    @Autowired
    private EleveService eleveService;
    @Autowired
    private ClasseService classeService;
    @Autowired
    private RestTemplate template;

    public Inscription saveInsc(Inscription inscription){
        Eleve eleve = eleveService.saveEleve(inscription.getEleve());
        Optional<Classe> cl = classeService.getClasseById(inscription.getClasseId());
        inscription.setEleve(eleve);
        inscription.setClasseId(cl.get().getId());
        return inscriptionRepository.save(inscription);
    }

    public Inscription saveInscription(Inscription inscription){
        String response ="";
       // Inscription inscription = transactionRequest.getInscription();
        Eleve eleve = eleveService.saveEleve(inscription.getEleve());
        Optional<Classe> cl = classeService.getClasseById(inscription.getClasseId());
        inscription.setEleve(eleve);
        inscription.setClasseId(cl.get().getId());
        inscriptionRepository.save(inscription);

        DocumentDTO paiementDTO = new DocumentDTO();
        paiementDTO.setInscriptionId(inscription.getId());
        paiementDTO.setTypeDocument("bulletin");
        //rest call
        DocumentDTO paiementResponse = template.postForObject("http://DOCUMENT-SERVICE/document/saveDocument", paiementDTO, DocumentDTO.class);


       return inscription;
    }
}
