package com.babs.inscriptionservice.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "document")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentDTO {
    @Id
    @GeneratedValue
    private Long documentId;
    private String codeDocument;
    private String annee;
    private String typeDocument;
    private Long inscriptionId;
}
