package com.trust.service.repository;

import com.trust.service.model.Signature;
import com.trust.service.model.SubmittedDocument;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SignatureRepository extends JpaRepository<Signature, Long> {
    List<Signature> findAllBySubmittedDocument(SubmittedDocument submittedDocument);
}
