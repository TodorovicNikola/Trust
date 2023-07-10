insert into client(id, name, password) values (1, 'admin', 'adminpw');
insert into client(id, name, password) values (2, 'orderer', 'ordererpw');
insert into client(id, name, password) values (3, 'user1', 'user1pw');

insert into certificate_authority(id, name, host, port, op_port, admin_name, admin_password) values (1, 'orderer_ca', 'localhost', '9000', '9999', 'admin', 'adminpw');

insert into organization(id, name, host, port, op_port, role, msp_id, user_id, admin_id, peer_id, certificate_authority_id, status) values
('orderer123456789', 'orderer', 'localhost', '9001', '9998', 'BROKER', 'ordererMSP', 3, 1, 2, 1, 1);