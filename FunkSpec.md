# Placeholder(project neve) - FunkSpec

## Áttekintés
Az alkalmazásunk lényege hogy közösségbe boronáljon olyan félénk fiatalabb zenészeket, akik valamilyen oknál kifolyólag eddig nem találták a helyüket a zenei világban. Nekik kínálunk, társakat barátokat , Jam-session-t .
Ez a rendszer ingyenes lesz, ezért bárki bárhonnan le tudja majd tölteni számítógépére vagy esetleg interneten keresztül beregisztrál és máris hozzájut a legfrissebb újdonságokhoz és az alkalmazásunk nyújtotta előnyökkel.
Az alkalmazásban a zenész regisztrálhatja a nevét, életkorát, és hogy milyen fajta zenei stílus iránt érdeklődik, és hogy mit keres épp a partnerében. Van lehetőség fényképet is feltölteni, megkönnyítve ezzel a felhasználók dolgát, ha épp specifikus hangszert használó személlyel szeretne találkozni.

## Jelenlegi helyzet
Szeretnénk nyújtani egy egyszerűen használható, könnyen hozzáférhető lehetőséget amatőr zenészeknek saját bandájuk összehozására, más zenészekkel kapcsolatteremtésre. Azoknak biztosítanánk hozzáférést a zenészközösséghez, akik idő- vagy akarathiány okán nem tudnak maguktól, a szokásos konvenciók segítségével. A zenekaralkotás folyamatát szeretnék a XXI. század trendjei és technológiái segítségével traszcendálni.

## Jelenlegi üzleti folyamatok modellje
A mai világban ahol már mindent összeköt az internet és sokkal könnyebben tarthatjuk a kapcsolatot meglévő ismerősökkel , és nagyon könnyen találhatunk újjat nagyon furcsa jelenség hogy zenei eggyütesek létrehozása közeli ismerősök segítségével jön létre és csak pár kilóméteres körzetre terjednek ki. Mi ezt a nagyon nehézkes és lassan haladó folyamatot szeretnék meg gyorsítani, illetve sokkal könnyebbé tenni egy egyszerű program segítségével. Az program segítségével olyan személyekről tudhatjuk meg hogy zenélnek vagy éppen énekelnek akikről nem gondolhattuk volna. Ha egy nagyon szűk zenei réteget képviselünk akkor akár meg találhatjuk az országban az eggyetlen másik személyt is aki ugyan azt képviseli. 

## Igényelt üzleti folyamatok modellje
Azért hogy egyszerűbbé tegyük a zenészek társasági összefogását  létrehozunk egy programot ami a mai kornak megfelelően helyt tud állni az elektronikai világban. Felhasználóinknak így egyszerűbb lesz magukról információt megosztani, valamint bemutatni tudásukat. A zeneileg nyitottak akár új, számukra eddig ismeretlen stílusokkal is ismerkedhetnek, hiszen a felhasználók egyedisége , személyisége teszi még színesebbé programunk. Ha egy óriás megapoliszban élünk, pl: Tokió, New York, Sanghaj, Delhi, Los Angeles, kizárt hogy mind a kb 30 millió emberről tudjuk, hogy milyen zenei beállítottságúak, és abban a stílusban hogyan teljesítenek

## Használati esetek
**Admin**: Az Admin elérheti az összes, minden más felhasználó álltal elérhető funkiót, hogy azok hibamentes működését ellenőrizhesse. Az Admin(ok) feladata a rendszer problémamentes működtetése. Ez egyben jár azzal, hogy az egész rendszerhez van hozzáférésük. Az Admin(ok)nak hozzá kell tudni férniük a felhasználók listájához, ahol mindent láthatnak és módosíthatnak egy felhasználó profilján. Tudniuk kell a felhasználók jogosultságait, szerepkörét, jelszavát, és felhasználónevét módosítani. Továbbá képesnek kell lenniük arra, hogy felhasználókat vegyenek fel rendszerbe és, amennyiben a felhasználó nem tartja be a felhasználási feltételeket, hogy eltávolítsák őket.
**User**: A User eléri saját profilját, és azok profiljának publikus részét, akiket kiválasztott potenciáls bandatagnak. Továbbá képes belépni a kiválasztó képernyőbe, amin egyesével tudja megnézni, meghallgatni, majd ha tetszésének megfelel, kiválasztani az általik beállított szűrők alapján megjelenő felhasználókat. A User(ek)nek hozzá kell férniük saját profiljukhoz, amin módosítani kell tudniuk saját személyes adataikat (Név, Lakhely, Műfaj(ok), e-mail), és meg kell tudni jelölniük azokat privátnak vagy publikusnak. Meg kell tudniuk változtatni jelszavukat biztonsági okokból. Fel kell tudniuk tölteni demókat, ami alapján más felhasználók kiválaszthatják őket.

## Követelménylista

|   Modul   | ID |  Név   |  Verzió  |
|-----------|----|--------|----------|
|Jogosultság| K1 | Bejelentkezés|1.0|
|Jogosultság|K2|Regisztráció|1.0|
|Jogosultság|K3|Jogosultsági szintek|1.0|
|Modifikáció|K4|Felhasználó módosítása|1.0|
|Modifikáció|K5|Jelszó módosítása|1.0|
|Modifikáció|K6|Elfelejtett felhasználónév/jelszó|1.0|
|Feladattípus|K7|Promó anyag|1.0|
|Statisztika|K8|Toplista|1.0|
|Felület|K9|Üzenetek|1.0|
|Felület|K10|Profil|1.0|

### Kifejtés    
#### ID
- K1  A felhasználó a "Bejelentkezés" gombbal be tud jelentkezni a megadott felhasználónév és jelszó párossal. Ha bármelyik mező hiányzik, vagy hibásan van kitöltve, az aktuális mező fölött piros betűkkel tudatja velünk.

- K2  A "Regisztráció gombra kattintva a felhasználó megadhatja az oldal használatához szükséges adatokat: "felhasználó" mezőbe egy egyedi felhasználónevet; "email" mezőbe a saját érvényes email címét; "jelszó" mezőbe egy egyedi kulcsszót, amit harmadik személynek semmiféleképpen nem adhatunk ki.
Ha bármelyik mező hiányzik, vagy hibásan van kitöltve, az aktuális mező fölött piros betűkkel tudatja velünk.

- K3  Felhasználói-Rendszerhozzáférés, like-olhat, küldhet üzenetet, tölthet fel profilképet és zenei hanganyagot, bemutatkozó szöveget.

- K4 A felhasználó módosítani tudja saját Felhasználónevét a saját profil beállításain belül. Ehhez szükséges a régi és az új felhasználók megadása, az új megerősítése, valamint a felhasználó jelszavának megadása. 

- K5 A felhasználó módosítani tudja saját jelszavát a saját profil beállításain belül. Ehhez szükséges a régi és az új jelszavának megadása, valamint az új megerősítése.

- K6 Ha a felhasználó elfelejtette a felhasználónevét vagy jelszavát, akkor ezzel az opcióval egy Adminhoz tud fordulni email címen keresztül.

- K7 A felhasználó regisztráció után feltölthet magáról egy promó anyagot bizonyítva, hogy zenész, megmutatva tehetségét.

- K8 Egy lista a Zenészek Like-számairól, és pontjairól, a lista elején a legtöbb pontot elért felhasználó található.

- K9 A felhasználók egymást között tudnak küldeni üzeneteket, jogosultságuktól függően.

- K10 A felhasználónak lehetősége van a profilján található bemutatkozó szöveg módosítására.

## Fogalomszótár
	- Lájk: A felhasználók like-olhatják (zöld like) vagy passzolhatják (piros x) egymás profilját miután megtekintették a promó anyagot és a bemutatkozó szöveget annak fényében, hogy tetszett-e a feltöltött tartalom.

	- Szűrők: A felhasználó szűkebb körben kereshet zenei társat. Csak azokat a felhasználókat adja ki a kereső mező, ami megfelel a beállított feltételeknek.

	- Profil: A felhasználó itt testreszabhatja saját profilképét, promó hanganyagát. Készythet rövid leírást magáról hogy jobban megismerjék.

	- Értesítő sáv: A felhasználót értesíti az oldal (?) sarkában lévő ikon ha valaki más like-olta a profilját, vagy üzenetet küldött neki.

	- Reszponzív felület: Az oldal méretei automatikusan igazodnak az aktuális eszközön.

## Forgatókönyv

## Funkció-Követelmény megfeleltetés
- **Jogosultság:** *-registráció:* a szolgáltatás használatához felhasználoi fiók szükséges, ennek lérehozásoz szükség van egy regisztrációs felülethez. *-bejelentkezés:* Ahhoz, hogy a felhasználó elérhesse fiókját és a szolgáltatás által nyújtott lehetőségeket, továbbá hogy a szerver az ő, és nem más fiókjához kötött adatokat küldje át bejelenkezés szükséges. *-jogszintek:* Míg az egyszerű felhasználó csak a saját profiljáoz fér hozzá, addig a rendszergazdák másokét is képes módosítani, közösségi menedzsmenti okokból.
- **Modifikáció:** *-név:* A felhasználó saját profiljába belépve képes lesz módosítani nevét. *-jelszó:* A felhasználó profilján keresztül képes lesz elérni a jelszó módosítás képernyőt, amin az eddigi jelszava megadásával képes lesz újat beállítani magának. *-elfelejtett jelszó:* A belépési képernyő része, amin képes lesz a felhasználó külső jelszóváltoztatást kérni regisztrált e-mail címére az autómata rendszertől.
- **Feladattípus:** *-demó:* A felhasználó képes lesz egy, vagy több demó feltöltésére, amiket majd felruházhat stílus és hangszer jelölőkkel, és amiket a központi adatbázisban fogunk tárolni.
- **Statisztika:** *-toplista:* Külön felület, amin a felhasználók láthatják az aktuális, felhasználók által pontozott ranglétrát.
- **Felület:** *-üzenet:* Chatszobák, amiken keresztül a felhasználók képesek felvenni a kapcsolatot az általuk kiválasztott felhasználótársakkal. *-profil:* A felhasználó saját felülete, ahol képes saját adatait (pl.: műfjok, hangszerek) módosítani.