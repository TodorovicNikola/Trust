package com.trust.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trust.service.model.VirtualOrganization;

@Repository
public interface VirtualOrganizationRepository extends JpaRepository<VirtualOrganization, Long> {

}