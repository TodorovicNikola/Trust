package com.trust.dltagen.repository;

import com.trust.dltagen.model.CertificateAuthority;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateAuthorityRepository extends JpaRepository<CertificateAuthority, Long> {
}
