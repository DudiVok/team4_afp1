Create table Permissions_Role(
Permission_Id INT,
Role_Id INT
);

ALTER TABLE Permissions_Role ADD CONSTRAINT FK_PP FOREIGN KEY(Permission_Id) REFERENCES Permissions(Permissions_Id);
ALTER TABLE Permissions_Role ADD CONSTRAINT FK_PR FOREIGN KEY(Role_Id) REFERENCES Role_s(Role_Id);