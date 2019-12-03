Create table user_instrument(
user_id int ,
instrument_id int,
proficiency int
);

alter table user_instrument add constraint FK_u_i_User foreign key(user_id) references users(user_id);

alter table user_instrument add constraint FK_u_i_Instrument foreign key(instrument_id) references instrument(instrument_id);
