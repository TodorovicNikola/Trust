package com.trust.dltagen.repository;

import com.trust.dltagen.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, String> {
    List<Organization> findByName(String name);
}
