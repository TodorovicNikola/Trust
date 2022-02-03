package com.trust.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trust.service.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}
