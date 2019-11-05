# Placeholder(project neve) - Követelmény Specifikáció
## Áttekintés :

Mindannyian ismerjük a mai társkereső alkalmazásokat, webhelyeket. Legtöbbjük csak átlagos felhasználásra alkotja meg ezeket a randi oldalakat, összeeresztve sokféle ízléssel rendelkező egyént. Viszont sokan vannak akik csak a saját érdeklődési körükben lévő személyekkel szeretnének ismerkedni, barátkozni, művelje azt hobbi vagy munka szinten. Erre a problémára építve szeretnénk egy ismerkedős oldalt létrehozni,csak esetünkben ez csak a zenészekre összpontosul,főleg őket szólítja meg. Nem kell rengeteg emberrel fölösleges köröket futni mire megtalálod a személyt akivel találsz egy közös nevezőt. Az alkalmazásban a zenész személy regisztrálhatja a nevét, életkorát, és hogy milyen fajta zenei stílus iránt érdeklődik, és hogy mit keres épp a partnerében. Van lehetőség fényképet is feltölteni, megkönnyítve ezzel a felhasználók dolgát, ha épp specifikus eszközt használó személlyel szeretne találkozni.

## Igényelt üzleti folyamatok
Tervezünk egy kezdőfelületet, amin a felhasználó regisztrálhat vagy bejelentkezhet. Ezt követően a felhasználó átkerül a képernyőtervben látható a központi felületre, ahol válogathat a többi felhasználó közül, egyesével, feltöltött minta zenéik, énekeik alapján. A menüsávban látható lehetőségek: értesítések, beállítások és profil. Az értesítésekben láthatóak azok a felhasználók, akik jelezték tetszésüket a jelenlegi felhasználó felé. Rájuk kattintva a felhasználó meghallgathatja a másik feltöltött mintaanyagát, és ha visszon jelzi tetszését, mind két fél megkapja a másik elérési adatait. A beállításokban lehet szűrőket beállítani, pl.: műfaj, hangszer, lakhely, továbbá lehet grafikus témát választani, illetve kijelentkezni. A profilban képes a felhasználó beállítani saját elérési adatait, feltölteni minta anyagot, beállítani a műfajt/műfajokat, hangszereket (éneket beleértve), amit tud játszani, és lakhelyét.

## Vágyálom rendszer
A projekt célja egy olyan zenei társ illetve banda kereső létrehozása , ahol zenészek illetve bandák könnyedén tudnak új társakat keresni . Cél egy könnyen átlátható és felhasználó barát program létrehozása , ahol a felhasználok regisztráció után pár alapvető szűrés segítségével tudjanak keresni társakat . Saját zenéket tudjanak feltölteni ahol éppen például egy hangszeren játszanak . A profil fülben képesek legyenek hangszereket megjelölni amiken tudnak játszani , vagy éppen tudnak e énekelni , ezzel is könnyítve a keresést .
Ha mind a kettő fel lájkolta a másik profilját akkor ,képesek lesznek a másik fél elérhetőségeit látni és értékelést írni a másikról amik majd megjelennek a profil kártyán. Ha egy felhasználó eléri a 9.9-es értékelést vagy 10-es értékelést akkor kapjon egy profil matricát, minek célja a hozzáértés jelölését . Ha jelzik a tetszést akkor a másik felhasználó kap egy értesítést .


## Funkcionális követelmények
A felhasználó a program elindítása után a bejelentkező illetve regisztrációs felület fogadja ahol ki tudja választani hogy mit csinál. Regisztrációkor meg kell adni pár alapvető adatot (Név,email,jelszó). Ha a bejelentkezés gombra kattint akkor be kell írni a email címet és a jelszót. Ha sikeresen regisztrált vagy bejelentkezett, akkor máris elérhető neki minden funkció, középen megjelennek a többi felhasználó akiket lehet lájkolni vagy elutasítani, vagy előtte meghallgatni pár saját zenét a felhasználótól, ha valaki lájkolja a profilod te kapsz egy értesítést hogy XY szereti a munkásságod . Ha a beállítások gombra kattintunk, akkor elérhetővé válik a profilkép feltöltési lehetőség, zenék feltöltése és a szűrök kiválasztása (zenei stílusok, tudjon énekelni akit keresünk vagy milyen hangszeren játsszon ), itt lehetősége lesz egy rövid bemutatkozót írni és itt állíthatja be hogy Ő tud e énekelni vagy éppen milyen hangszereken játszik egyszerű switch kapcsoló balra vagy jobbra húzásával .

## Jelenlegi helyzet
Jelenleg, ha valaki a bandájába keres valamilyen zenészt illetve ha ő maga akar valahova csatlakozni, azt csak sok keresgélés árán és főképp emberi kapcsolatokon keresztül tudja megoldani. Az újságban való hirdetéséket elavultságukat tekintve a fiatalság nem fogja árgus szemekkel vizslatni zenei karrierjük beindítására ezért sok zenészt gátolnak ezek a problémák abban hogy a számukra megfelelő zenekarba tartozzanak. Egy újságos hirdetés az applikációnkkal ellentétben nem zenészekkel van tele, nem lehet belőle promó anyagot hallgatni, nem lehet további információkhoz hozzájutni az adott zenekarról / egyéni zenészről, így eléggé csekély az esély hogy valaki így találjon rá a neki megfelelő emberek társaságára. A XXI. század fiatalsága számára új megoldás kell az ilyesfajta társasági szerveződések megszervezésére.

## Fogalomtár
Reszponzív felület - PC-n igazodik a képernyőhöz a felület mérete, azaz különböző méretarányú és felbontású kijelzőkön is probléma nélkül megjeleníthető.

 Lájk - mikor a felhasználó egy másik profilját látva az alatta megjelenő zöld jelzésre kattintva egy automatikus üzenetet küld a másik félnek az érdeklődése felől, erre kettő féleképpen válaszolhat a másik fél, vissza lájkol, vagy rákattint a piros x-re .
 
 Szűrők - ezek beállításával kereshet a felhasználó (például ha egy gitáros énekest keresünk akkor, ezt a kettő lehetőséget be aktiválva a kereső algoritmus már csak ezeknek a paramétereknek megfelelő személyeket ajánl fel ).

Profil - Ide tölthetünk fel profilképet ,olyan hangfájlokat amikben éppen egy hangszeren játszunk vagy éppen éneklünk , itt adhatunk meg egy rövidke leírást magunkról , itt adhatjuk meg hogy milyen hangszereken tudunk játszani vagy éppen tudunk-e énekelni (ezeket az adatokat fontos megadni regisztráció után mert a kereső motor ez alapján ajánlhat fel mások számára !) .

Értesítő sáv - Itt láthatjuk az értesítéseket hogy ki lájkolta a profilunkat. Ha itt rákattintunk egyik értesítésre, rögtön az adott személy profilját látjuk .

## Rendszerre vonatkozó törvények
### Általános Információk
Az Alkalmazáshoz való hozzáférést és annak használatát az alkalmazandó jogszabályok és a jelen Felhasználási Feltételek és Adatkezelési tájékoztató (a továbbiakban Felhasználási Feltételek) szabályozzák. Az Alkalmazást letöltők és használók (a továbbiakban: a Felhasználók) elfogadják a jelen Felhasználási Feltételeket. Amennyiben ezen Felhasználási Feltételeket és Adatkezelési Tájékoztatót nem fogadják el, nem jogosultak a regisztrációra és az Alkalmazás használatára.

A jelen Felhasználási Feltételekre a magyar jog az irányadó, tekintet nélkül a nemzetközi magánjog előírásaira. Az Alkalmazás Felhasználói kifejezetten hozzájárulnak ahhoz, hogy a jogvitákra a magyar hatóságoknak és bíróságoknak legyen kizárólagos joghatóságuk a magyar jog alapján.

### Szellemi tulajdon
Az Alkalmazás és valamennyi kapcsolódó védjegy, szerzői jogi alkotás és egyéb – akár bejegyzett, akár be nem jegyzett – szellemi tulajdon (a továbbiakban együttesen: Szellemi Tulajdon) tulajdonosa az EKE és/vagy EKE Szolgáltató, valamint az alkalmazáshoz kedvezményt nyújtó partnerek. A Felhasználók az Alkalmazást a Szellemi Tulajdon maximális tiszteletben tartásával jogosultak használni. A Szellemi Tulajdon kiterjed különösen, de nem kizárólagosan valamennyi szoftverre, logóra, márkajelre, márkanévre, fényképre, szövegre, grafikára, adatbázisra. A Szellemi Tulajdonnak tilos bárminemű megsértése, bitorlása, másolása, átdolgozása és tilos azt bármilyen egyéb módon megsérteni, azt jogosulatlanul felhasználni, továbbadni, megterhelni, azzal bármilyen módon rendelkezni, visszaélni. Ezen szabályok megsértése az Alkalmazás használati lehetőségeinek azonnali hatályú megszüntetése mellett a megfelelő jogi lépések megtételét – beleértve esetleges büntetőjogi lépések megtételét is – vonja maga után a Felhasználóval, más jogsértő személlyel szemben a Tulajdonos és/vagy a Szellemi Tulajdon egyéb jogosultjai által.

### Használat
Az Alkalmazás Felhasználói 13 éven felüli természetes személyek lehetnek. Az Alkalmazás díjmentesen vehető igénybe, kizárólag privát, azaz nem üzletszerű módon és célra, kizárólag a jelen Felhasználási Feltételek szerint. Az Alkalmazás letöltéséért és használatáért az adatforgalmat biztosító szolgáltató külön díjat számíthat fel. Az ezzel kapcsolatos esetlegesen felmerülő költségek a Felhasználót terhelik.

A Felhasználási Feltételek és az Alkalmazás működésének a módosítására, az Alkalmazás működésének a megszüntetésére a Tulajdonos bármikor jogosult, a Felhasználó előzetes értesítése nélkül. Az Alkalmazáshoz való hozzáférést a Tulajdonos bármikor visszavonhatja akár az adott Felhasználóra nézve, akár szélesebb körben vagy teljes körűen előzetes értesítés, figyelmeztetés nélkül.

<!--stackedit_data:
eyJoaXN0b3J5IjpbLTkwMzU0MDU3Ml19
-->