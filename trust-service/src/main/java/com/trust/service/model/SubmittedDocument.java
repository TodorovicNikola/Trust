package com.trust.service.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "submitted_document", indexes = {@Index(name = "fk_oivo_idx", columnList = "org_in_virt_org_id", unique = false),  @Index(name = "uq_name", columnList = "name", unique = true)})
public class SubmittedDocument {

	public SubmittedDocument(OrgInVirtOrg orgInVirtOrg, String name, String encodedContent) {
		this.orgInVirtOrg = orgInVirtOrg;
		this.name = name;
		this.encodedContent = encodedContent;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "org_in_virt_org_id")
	private OrgInVirtOrg orgInVirtOrg;

	@Column(name = "name")
	private String name;

	@Lob
	@Column(name = "encoded_content")
	private String encodedContent;

}
