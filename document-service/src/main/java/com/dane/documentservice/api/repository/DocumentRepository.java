package com.dane.documentservice.api.repository;

import com.dane.documentservice.api.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    Document findByInscriptionId(Long id);
}
