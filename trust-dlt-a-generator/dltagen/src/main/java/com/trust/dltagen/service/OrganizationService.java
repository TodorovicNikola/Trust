package com.trust.dltagen.service;

import com.trust.dltagen.model.Organization;
import com.trust.dltagen.repository.OrganizationRepository;
import org.springframework.stereotype.Service;

@Service
public class OrganizationService {

    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    public Organization getById(String id) {
        return repository.getById(id);
    }
}
