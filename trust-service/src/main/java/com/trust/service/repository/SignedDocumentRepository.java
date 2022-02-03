package com.trust.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trust.service.model.SignedDocument;

@Repository
public interface SignedDocumentRepository extends JpaRepository<SignedDocument, Long> {

}