package com.trust.dltagen.model;

import com.trust40.multi_pro_lan.parser.model.VirtualOrganization;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Channel {
    @Id
    private String id;
    private String name;
    @ManyToOne
    private Orderer orderer;
    private ChannelStatus status;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Channel_Organization",
            joinColumns = {@JoinColumn(name = "channel_id")},
            inverseJoinColumns = {@JoinColumn(name = "organization_id")}
    )
    private List<Organization> organizations = new ArrayList<>();
    private String endorsementPolicy;

    public Channel() {

    }

    public Channel(String id, String name, Orderer orderer, String endorsementPolicy, List<Organization> organizations) {
        this.id = id;
        this.name = name;
        this.orderer = orderer;
        this.endorsementPolicy = endorsementPolicy;
        this.organizations = organizations;
    }

    public Channel(String id, String name, String endorsementPolicy) {
        this.id = id;
        this.name = name;
        this.endorsementPolicy = endorsementPolicy;
    }

    public Channel(VirtualOrganization vo) {
        this.id = vo.getId();
        this.name = vo.getName();
        this.endorsementPolicy = vo.getEndorsementPolicy();
        this.status = ChannelStatus.NOT_CREATED;

        vo.getOrganizations().forEach(this::addOrganization);
    }

    private void addOrganization(com.trust40.multi_pro_lan.parser.model.Organization organization) {
        Organization org = new Organization(organization);
        this.organizations.add(org);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Orderer getOrderer() {
        return orderer;
    }

    public ChannelStatus getStatus() {
        return status;
    }

    public void setStatus(ChannelStatus status) {
        this.status = status;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    public String getEndorsementPolicy() {
        return endorsementPolicy;
    }

    public void setOrganizations(List<Organization> organizations) {
        this.organizations = organizations;
    }


    @Override
    public String toString() {
        return "Channel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                //", orderer=" + orderer +
                ", status=" + status +
                ", organizations=" + organizations +
                ", endorsementPolicy='" + endorsementPolicy + '\'' +
                '}';
    }
}
