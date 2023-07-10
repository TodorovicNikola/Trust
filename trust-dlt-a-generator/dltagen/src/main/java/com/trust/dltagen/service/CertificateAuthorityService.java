package com.trust.dltagen.service;

import com.trust.dltagen.model.CertificateAuthority;
import com.trust.dltagen.repository.CertificateAuthorityRepository;
import org.springframework.stereotype.Service;

@Service
public class CertificateAuthorityService {

    private final CertificateAuthorityRepository repository;

    public CertificateAuthorityService(CertificateAuthorityRepository repository) {
        this.repository = repository;
    }

    public CertificateAuthority save(CertificateAuthority ca) {
        return repository.save(ca);
    }
}
