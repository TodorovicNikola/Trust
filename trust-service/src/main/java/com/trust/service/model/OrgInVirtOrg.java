package com.trust.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.trust.service.model.enums.OrganizationRoleEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "org_in_virt_org", indexes = {
		@Index(name = "fk_ovo_idx", columnList = "virtual_organization_id, organization_id", unique = true),
		@Index(name = "api_key_idx", columnList = "api_key", unique = true) })
public class OrgInVirtOrg {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "virtual_organization_id")
	private VirtualOrganization virtualOrganization;

	@ManyToOne
	@JoinColumn(name = "organization_id")
	private Organization organization;

	@Column(name = "organization_role")
	@Enumerated(EnumType.STRING)
	private OrganizationRoleEnum organizationRole;

	@Column(name = "api_key")
	private String apiKey;

}
