Create table Permissions(
Pemissions_Id INT PRIMARY key,
name VARCHAR2(250) NOT NULL
)

Create table Premissions_Role(
Permission_Id INT,
Role_Id INT
)
ALTER TABLE Permissions_Role ADD CONSTRAINT FK_Q FOREIGN KEY(Permission_Id) REFERENCES Permissions(Permissions_Id);

Create table Role_s(
Role_Id INT Primary Key,
name VARCHAR2(250) NOT NULL
)


