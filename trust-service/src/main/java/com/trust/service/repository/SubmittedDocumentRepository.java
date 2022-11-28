package com.trust.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trust.service.model.OrgInVirtOrg;
import com.trust.service.model.SubmittedDocument;

@Repository
public interface SubmittedDocumentRepository extends JpaRepository<SubmittedDocument, Long> {

    Optional<SubmittedDocument> findByName(String name);
}