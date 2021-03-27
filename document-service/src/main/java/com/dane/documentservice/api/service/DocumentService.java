package com.dane.documentservice.api.service;


import com.dane.documentservice.api.entity.Document;
import com.dane.documentservice.api.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;


@Service
public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    public List<Document> getDocuments(){
        return  documentRepository.findAll();
    }

    public Document doDocument(Document document){

        return documentRepository.save(document);
    }

    public Document findByDocumentId(Long id) {
        return documentRepository.findByInscriptionId(id);
    }
}
