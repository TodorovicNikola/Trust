package com.trust.service.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "signature")
public class Signature {

    public Signature(OrgInVirtOrg orgInVirtOrg, SignedDocument signedDocument, String encodedSignature) {
        this.orgInVirtOrg = orgInVirtOrg;
        this.signedDocument = signedDocument;
        this.encodedSignature = encodedSignature;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "org_in_virt_org_id")
    private OrgInVirtOrg orgInVirtOrg;

    @ManyToOne
    @JoinColumn(name = "signed_document_id")
    private SignedDocument signedDocument;

    @Lob
    @Column(name = "encoded_signature")
    private String encodedSignature;
}
