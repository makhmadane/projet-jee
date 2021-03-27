package com.babs.inscriptionservice.api.repository;

import com.babs.inscriptionservice.api.entity.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveRepository extends JpaRepository<Eleve, Long> {
}
