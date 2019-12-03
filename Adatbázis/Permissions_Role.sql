Create table Premissions_Role(
Permission_Id INT,
Role_Id INT
)

ALTER TABLE Permissions_Role ADD CONSTRAINT FK_Q FOREIGN KEY(Permission_Id) REFERENCES Permissions(Permissions_Id);
