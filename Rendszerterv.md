# Rendszerterv

## A rendszer célja
A rendszer célja , hogy a felhasználók könnyedén találhassanak az alkalmazás segítségével zenei társaka akkikel akár késöbb zenei bandákat is létrehozhatnak. A felhasználóknak lehetőségük lessz profilképet feltölteni, hangfelvételeket feltölteni amiket ők csináltak ahogy éppen éenekelnek vagy valamilyen hangszeren játsznak, és rövid személyes leírást adni magukról. Az adminoknak lesz lehetőségük a spam fiókokat törölni . A program windows asztali körülmények között fog működni .A rendszer az adatokat egy Web Service segítségével kapja az adatbázisból. Mivel a programot csak windowsra szeretnénk elérhetővé tenni, nem célunk hogy más, például android operációs rendszerrel rendelkező eszközön fusson.

## Architekturális terv
A rendszerhez szükség van egy adatbázis szerverre, ebben az esetben MySql-t használunk. A kliens oldali programokat egy Java alapú REST api szolgálja ki, ez csatlakozik az adatbázis szerverhez. Az asztali program JavaFX keretrendszer használatával készül el. A rest api-hoz a user belépését követően egyedi api-key segítségével lehet hozzáférni, ez biztosítja, hogy illetéktelen felhasználók ne módosíthassák az adatokat.

## Funkcionális terv
### Rendszerszereplők:
- Admin
- Diák

### Rendszerhasználati esetek és lefutásaik:

ADMIN: 
- Beléphet bármilyen szereplőként teljes hozzáférése van a rendszerhez
- A felhasználói adatokat látják, változtathatják
- Felhasználó hozzáadására, törlésére van lehetőségük

USER:
- Zenék képek feltöltése 
- Saját profil szerkesztése 
- Szűrők használata 
- Kapcsolatfelvétel más felhasználókkal
- Lájk dislájk funkció használata 
- Más felhasználók profiljának megtekintése 

### Menü-hierarchiák:

BEJELENTKEZÉS
- Bejelentkezés
- Regisztráció

MAIN MENÜ
- Beállítások/Profil szerkesztés 

PROFIL
- Profil kép feltöltése
- Zene kép feltöltése




## Karbantartási terv
Az alkalmazás folyamatos üzemeltetése és karbantartása, mely magában foglalja a programhibák elhárítását, a belső igények változása miatti módosításokat, valamint a környezeti feltételek változása miatt megfogalmazott program-, illetve állomány módosítási igényeket. Ellenőrizni kell, hogy a jövőben kiadott Microsoft Windows verziókkal kompatibilis-e az alkalmazás. A jövőben szükség lehet új hardware implementációra igénynövekedés esetén.
**Karbantartás**
Corrective Maintenance: A felhasználók által felfedezett és "user reportban" elküldött hibák kijavítása.
Adaptive Maintenance: A program naprakészen tartása és finomhangolása.
Perfective Maintenance: A szoftver hosszútávú használata érdekében végzett módosítások, új funkciók, a szoftver teljesítményének és működési megbízhatóságának javítása.
Preventive Maintenance: Olyan problémák elhárítása, amelyek még nem tűnnek fontosnak, de később komoly problémákat okozhatnak.