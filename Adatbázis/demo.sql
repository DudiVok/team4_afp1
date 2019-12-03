Create table promo(
promo_id int primary key,
score int,
user_id int,
genre_id int
);

alter table promo add constraint FK_Promo_User foreign key(user_id) references users(user_id);

alter table promo add constraint FK_Promo_Genre foreign key(genre_id) references genre(genreid_id);
