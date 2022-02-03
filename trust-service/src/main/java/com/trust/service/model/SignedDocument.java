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
@Table(name = "signed_document", indexes = @Index(name = "fk_osd_idx", columnList = "org_in_virt_org_id, submitted_document_id", unique = true))
public class SignedDocument {
	
	public SignedDocument(OrgInVirtOrg orgInVirtOrg, SubmittedDocument submittedDocument) {
		this.orgInVirtOrg = orgInVirtOrg;
		this.submittedDocument = submittedDocument;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "org_in_virt_org_id")
	private OrgInVirtOrg orgInVirtOrg;
	
	@ManyToOne
	@JoinColumn(name = "submitted_document_id")
	private SubmittedDocument submittedDocument;
}
