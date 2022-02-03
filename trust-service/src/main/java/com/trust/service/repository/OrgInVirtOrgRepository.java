package com.trust.service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trust.service.model.OrgInVirtOrg;

@Repository
public interface OrgInVirtOrgRepository extends JpaRepository<OrgInVirtOrg, Long> {
	Optional<OrgInVirtOrg> findByApiKey(String apiKey);
	
	
}