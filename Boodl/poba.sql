create or replace
    definer = root@localhost procedure Insert_User(IN v_username varchar(250), IN v_password varchar(250),
                                                   IN v_email varchar(250), IN v_role_id int)
BEGIN
	INSERT INTO users VALUES(NULL,v_username,v_password,v_email,v_role_id);
END;

