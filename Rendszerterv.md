# Rendszerterv

## A rendszer célja
A rendszer célja , hogy a felhasználók könnyedén találhassanak az alkalmazás segítségével zenei társaka akkikel akár késöbb zenei bandákat is létrehozhatnak. A felhasználóknak lehetőségük lessz profilképet feltölteni, hangfelvételeket feltölteni amiket ők csináltak ahogy éppen éenekelnek vagy valamilyen hangszeren játsznak, és rövid személyes leírást adni magukról. Az adminoknak lesz lehetőségük a spam fiókokat törölni . A program windows asztali körülmények között fog működni .A rendszer az adatokat egy Web Service segítségével kapja az adatbázisból. Mivel a programot csak windowsra szeretnénk elérhetővé tenni, nem célunk hogy más, például android operációs rendszerrel rendelkező eszközön fusson.

## Követelmények
|   Funkciónális követelmények   | Nem Funkciónális Követemények | 
|--------------------------------|-------------------------------|
|Felhasználók adatainak tárolása|Egymás adatain ne tudják módosítani a felhasználók|
|Felhasználók üzeneteinek elküldése||
|Alkalmazás megfelelő működése||
|GDPR-nek való megfelelés||

## Projektterv
|   Funkció   | Feladat |  Prioritás   |  Becslés  |
|-----------|----|--------|----------|
|Követelmény specifikáció||0|40|
|Funkcionális specifikáció||0|40|
|Rendszerterv||0|40|
|Projekt elnevezése||3|5|
|Adatbázis|Terv elkészítése|1|5|
||Adatbázis felépítése|1|1|
||Adatfeltöltés|1|3|
|UI létrehozása|Logo|9|5|
||Login felület|2|4|
||Regisztrációs felület|2|4|
||Profil felület|2|4|
||Elfelejtett jelszó felület|2|4|
||Keresés felület|2|4|
||Üzenet felület|2|4|
||Toplista felület|2|4|
||Jelszóváltoztatás felület|2|4|
|Backend|Kapcsolat létrehozása|3|4|
||Regisztráció implementálása|3|5|
||Bejelentkezés implementálása|3|5|
||Elfejeltett jelszó implementálása|3|5|
||Demó feltöltés implementálása|3|5|
||Profil kitöltés/módosítás implementálása|3|5|
||Jelszó változtatás implementálása|3|5|
||Keresés funkció implementálása|3|5|
||Üzenet funkció implementálása|3|5|
||Lájk funkció implementálása|3|5|

## Üzleti folyamatok modellje

	Felhasználó: Bejelentkezés, Kijelentkezés, Regisztráció, Saját adatok megtekintése, Toplista megtekintése, Jelszó változtatása, Felhasználónév változtatása, Fénykép/promó anyag feltöltése.

	Admin: Bejelentkezés, Kijelentkezés, Regisztráció, Saját adatok megtekintése, Toplista megtekintése, Jelszó változtatása, Felhasználónév változtatása, Fénykép/promó anyag feltöltése, Saját felhasználók adatainak megtekintése-módosítása, Adatbázis hozzáférés.


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

## Absztrakt domain modell
A rendszert a felhasználó egy Windowsos alkalmazáson keresztül érheti majd el, aminek az elkészítését Java nyelven tervezzük. A felület lehetővé teszi majd a felhasznéló számára a regisztrációt, illetve késöbbieken a bejelentkezést a rendszerbe. A rendszeren belül lehetőséget nyújtunk a felhasználónak saját profilját elérni, illetve változtatni, akövetkező módokon: saját szűrési kritériumok beállítása (név, lakhely, műfaj(ok), hangszer(ek)), demo feltöltés, profilkép feltöltés, jelszóváltoztatás, láthatósági beállítások. Továbbá a felhasználó képes keresni a többi felhasználó között az alábbi szűrők segítségével: név, relatív távolság a felhasználók lakhelye között, játszott műfajok, játszott hangszerek. A szűrés alapján megjelenő felhasználók közül választhat az ő általuk feltöltött zenék segítségével, és felveheti a kapcsolatot a kiválasztott felhasználótársakkar, akár e-mail, akár egy beépített chat funkció segítségével. A felhasználól, azok adatai, valamint demói egy központi szerveren MySQL adatbázisban lesznek eltárolva.

## Implementációs terv
### Windows Desktop Application
Az alkalmazás felhasználói oldalát asztali alkazznak tervezzük, főleg mert a csapat nagy része sújos tapasztalt hiányban szenved mind mobil, mind webes alkalmazások implementáció terén. A terv a JAVA nyelv használatát írja elő, főleg mert ismerős és könnyen használható.
### Adatbázis
A tervezett szolgáltatás jellegét tekintve egy központi adatbázis használata elengedhetetlen. A felhasználók, és azok adatainak rögzítése, tásrolása és rendszerezése céljából, továbbá hogy lehetővé tegyük a felhasználóknak az egymás közötti könnyű keresést a modern adatbáziskezelés konvenciói a leg célravezetőbbek. Arra, hogy ezeket implementálhassuk, a MySQL rendszerét választottuk, ismételten az ismerettségeink tudatában, és a megbízhatóság fényében.

## Karbantartási terv
Az alkalmazás folyamatos üzemeltetése és karbantartása, mely magában foglalja a programhibák elhárítását, a belső igények változása miatti módosításokat, valamint a környezeti feltételek változása miatt megfogalmazott program-, illetve állomány módosítási igényeket. Ellenőrizni kell, hogy a jövőben kiadott Microsoft Windows verziókkal kompatibilis-e az alkalmazás. A jövőben szükség lehet új hardware implementációra igénynövekedés esetén.
**Karbantartás**
Corrective Maintenance: A felhasználók által felfedezett és "user reportban" elküldött hibák kijavítása.
Adaptive Maintenance: A program naprakészen tartása és finomhangolása.
Perfective Maintenance: A szoftver hosszútávú használata érdekében végzett módosítások, új funkciók, a szoftver teljesítményének és működési megbízhatóságának javítása.
Preventive Maintenance: Olyan problémák elhárítása, amelyek még nem tűnnek fontosnak, de később komoly problémákat okozhatnak.

## Fizikai környezet

Az alkalmazás Android és web platformra, hordozható eszközökre(okostelefonok,táblagépek) készül.

Van tűzfal a hálózaton és minden portot is engedélyez.

Nincsenek megvásárolt komponenseink.

Fejlesztői eszközök:

	- Sublime Text
	- MYSQL Workbench
	- Tortoise Git
	- Wamp
	- IntelliJ

## Tesztterv

A tesztelések célja a rendszer és komponensei funkcionalitásának teljes vizsgálata, ellenőrzése, a rendszer által megvalósított üzleti szolgáltatások verifikálása.

### Tesztelési eljárások

	- Unit teszt: A teszt elsődleges célja: az eddig meglévő funkcióknak a különböző böngészőkkel való kompatibilitásának tesztelése. A tesztet a fejlesztők végzik. 
	Az eljárás sikeres, ha különböző böngészőkben megfelelően működnek a különböző funkciók. A teszt időtartama egy hét.

	- Beta teszt: Ezt a tesztet nem a fejlesztők végzik.
	Tesztelendő böngészők: Opera, Firefox, Google Chrome, Safari
	Tesztelendő android rendszerek:6.0.0(minimum), vagy újabbak
	Tesztelendő kijelző méretek: 1280x720 (minimum), 1366x768, 1920x1080
	A teszt időtartama egy hét. 
	A tesztelés alatt a tesztelő felhasználók visszajelzéseket küldhetnek a fejlesztőknek, probléma/hiba felmerülése esetén. 
	Ha hiba lép fel, a fejlesztők kijavítják a lehető leghamarabb. Sok hiba esetén a tesztelés ideje elhúzódhat plusz egy héttel.

	- Tesztelendő funkciók, Backend Service: Képesnek kell lennie csatlakozni webes klienshez.
	Képesnek kell lennie egy időben kiszolgálni több klienst is.
	Fel kell tudnia tölteni, és le kell tudnia kérdezni az adatbázis adatait.
	Képesnek kell lennie minden felületen elérhető funkciók biztosítására.

	- Login felület: A login/regisztrációs felület elrendezésének ellenőrzése: Elvárt működés: a funkcionális specifikációban szereplő képernyőtervnek megfelelően kell kinéznie, a képernyő méretétől függetlenül.

	- Regisztrációs felület: A regisztrációs felületnek elérhetőnek a kezdőképernyőn a bejelentkezési lehetőség mellett. Amennyiben a felhasználó még nincs regisztrálva, az itt található gombra kattintva kell átirányítani a regisztrációs felületre. Ezen felületen a megfelelő adatok megadása mellett a megerősítés gombra kattintva a felhasználó regisztrációjának a funkcionális specifikációban leírtak szerint végbe kell mennie, majd elérhetővé kell tenni a bejelentkezést a felhasználó számára. Hibás regisztrációs adatok megadásakor hibaüzenetet kell kapjon a felhasználó.”
