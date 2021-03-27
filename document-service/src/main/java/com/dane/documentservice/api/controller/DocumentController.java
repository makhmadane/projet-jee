package com.dane.documentservice.api.controller;


import com.dane.documentservice.api.entity.Document;
import com.dane.documentservice.api.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping(value ="/findAllDocuments")
    public List<Document> findAll(){
        return documentService.getDocuments();
    }

    @PostMapping(value = "/saveDocument")
    public Document save(@RequestBody Document p){
        return documentService.doDocument(p);
    }

    @GetMapping(value ="/{id}")
    public Document findByDocumentId(@PathVariable Long id){
        return documentService.findByDocumentId(id);
    }
}
