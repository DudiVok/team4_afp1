# Rendszerterv

## A rendszer célja
A rendszer célja , hogy a felhasználók könnyedén találhassanak az alkalmazás segítségével zenei társaka akkikel akár késöbb zenei bandákat is létrehozhatnak. A felhasználóknak lehetőségük lessz profilképet feltölteni, hangfelvételeket feltölteni amiket ők csináltak ahogy éppen éenekelnek vagy valamilyen hangszeren játsznak, és rövid személyes leírást adni magukról. Az adminoknak lesz lehetőségük a spam fiókokat törölni . A program windows asztali körülmények között fog működni .A rendszer az adatokat egy Web Service segítségével kapja az adatbázisból. Mivel a programot csak windowsra szeretnénk elérhetővé tenni, nem célunk hogy más, például android operációs rendszerrel rendelkező eszközön fusson.

## Architekturális terv
A rendszerhez szükség van egy adatbázis szerverre, ebben az esetben MySql-t használunk. A kliens oldali programokat egy Java alapú REST api szolgálja ki, ez csatlakozik az adatbázis szerverhez. Az asztali program JavaFX keretrendszer használatával készül el. A rest api-hoz a user belépését követően egyedi api-key segítségével lehet hozzáférni, ez biztosítja, hogy illetéktelen felhasználók ne módosíthassák az adatokat.