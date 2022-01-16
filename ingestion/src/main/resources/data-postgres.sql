--ROL
INSERT INTO ROL (id, name) values (1,'Rol1');
INSERT INTO ROL (id, name) values (2,'Rol2');
INSERT INTO ROL (id, name) values (3,'Rol3');

--CATEGORY
INSERT INTO CATEGORY (id, name, description,threshold) values (1,'Category 1', 'Desc Category 1', 1.1);
INSERT INTO CATEGORY (id, name, description,threshold) values (2,'Category 2', 'Desc Category 2', 1.2);
INSERT INTO CATEGORY (id, name, description,threshold) values (3,'Category 3', 'Desc Category 3', 2.2);

--PERMISSSION
INSERT INTO PERMISSION (id, name) values (1,'Permission 1');
INSERT INTO PERMISSION (id, name) values (2,'Permission 2');
INSERT INTO PERMISSION (id, name) values (3,'Permission 3');

--USERS
INSERT INTO USERS (id, user_name, user_surname,user_status, rol_id, permission_id, client) values (1,'User 1', 'Usuario', 'Active', 1, 1, 'Cliente');
INSERT INTO USERS (id, user_name, user_surname,user_status, rol_id, permission_id, client) values (2,'User 2', 'Usuario', 'Active', 2, 1, 'Cliente');
INSERT INTO USERS (id, user_name, user_surname,user_status, rol_id, permission_id, client) values (3,'User 3', 'Usuario', 'Active', 3, 2, 'Cliente');
