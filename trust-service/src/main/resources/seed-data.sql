INSERT INTO ORGANIZATION (name) values ('Winery');
INSERT INTO ORGANIZATION (name) values ('Woodworking Company');
INSERT INTO ORGANIZATION (name) values ('Acrylic Engraving Company');

INSERT INTO virtual_organization(name) values ('ACME Wine Inc.');

insert into org_in_virt_org(organization_id, virtual_organization_id, organization_role, api_key) values (1, 1, 'BROKER', '-FRyeiY1aaMyAo0BF61K9A');
insert into org_in_virt_org(organization_id, virtual_organization_id, organization_role, api_key) values (2, 1, 'CORE_PARTNER', 'AiVzGnDzW9vriMZMztaWXw');
insert into org_in_virt_org(organization_id, virtual_organization_id, organization_role, api_key) values (3, 1, 'ADDITIONAL_PARTNER', 'Zfam9dJxHsVijWjzL61ptQ');