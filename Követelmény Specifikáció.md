﻿# Placeholder(project neve) - Követelmény Specifikáció

## Áttekintés
Mindannyian ismerjük a mai társkereső alkalmazásokat, webhelyeket. Legtöbbjük csak átlagos felhasználásra alkotja meg ezeket a randi oldalakat, összeeresztve sokféle ízléssel rendelkező egyént. Viszont sokan vannak, akik csak a saját érdeklődési körükben lévő személyekkel szeretnének ismerkedni, barátkozni, művelje azt hobbi vagy munka szinten. Erre a problémára építve szeretnénk egy ismerkedő oldalt létrehozni, csak esetünkben ez csak a zenészekre összpontosul, főleg őket szólítja meg. Nem kell rengeteg emberrel fölösleges köröket futni mire megtalálod a személyt akivel találsz egy közös nevezőt. Az alkalmazásban a zenész személy regisztrálhatja a nevét, életkorát, és hogy milyen fajta zenei stílus iránt érdeklődik, és hogy mit keres épp a partnerében. Van lehetőség fényképet is feltölteni, megkönnyítve ezzel a felhasználók dolgát, ha épp specifikus eszközt használó személlyel szeretne találkozni.

## Jelenlegi üzleti folyamatok
A zenészek elmennek találkozókra, jam-sessionökre találkozni más zenészekkel, és (nauseous) személyesen beszélni velük. (dry-heaving) Esetleg szerencsésebb, társasági érzékkel rendelkező egyének a "barátaik"-kal alkotnak bandát. Sokan a zeneiskolában szerzett kapcsolataikat használják fel erre a célra. Nagyon kétségbeesett egyedek akár hirdetéseket is adhatnak fel helyi újságokba, illetve közösségi média használatához folyamodhatnak-ők a célközönségünk.

## Igényelt üzleti folyamatok
Tervezünk egy kezdőfelületet, amin a felhasználó regisztrálhat vagy bejelentkezhet. Ezt követően a felhasználó átkerül a képernyőtervben látható a központi felületre, ahol válogathat a többi felhasználó közül, egyesével, feltöltött minta zenéik, énekeik alapján. A menüsávban látható lehetőségek: értesítések, beállítások és profil. Az értesítésekben láthatóak azok a felhasználók, akik jelezték tetszésüket a jelenlegi felhasználó felé. Rájuk kattintva a felhasználó meghallgathatja a másik feltöltött mintaanyagát, és ha visszajelzi tetszését, mind két fél megkapja a másik elérési adatait. A beállításokban lehet szűrőket beállítani, pl.: műfaj, hangszer, lakhely, továbbá lehet grafikus témát választani, illetve kijelentkezni. A profilban képes a felhasználó beállítani saját elérési adatait, feltölteni minta anyagot, beállítani a műfajt/műfajokat, hangszereket (éneket beleértve), amit tud játszani, és lakhelyét.

## Vágyálom rendszer
A projekt célja egy olyan zenei társ illetve bandakereső létrehozása, ahol zenészek illetve bandák könnyedén tudnak új társakat keresni. Cél egy könnyen átlátható és felhasználó barát program létrehozása , ahol a felhasználok regisztráció után pár alapvető szűrés segítségével tudjanak keresni társakat. Saját zenéket tudjanak feltölteni ahol éppen például egy hangszeren játszanak . A profil fülben képesek legyenek hangszereket megjelölni amiken tudnak játszani, vagy éppen tudnak e énekelni , ezzel is könnyítve a keresést .
Ha mind a kettő fél lájkolta a másik profilját, akkor képesek lesznek a másik fél elérhetőségeit látni és értékelést írni a másikról, amik majd megjelennek a profil kártyán. Ha egy felhasználó eléri a 9.9-es értékelést vagy 10-es értékelést akkor kapjon egy profil matricát, minek célja a hozzáértés jelölését. Ha jelzik a tetszést, akkor a másik felhasználó kap egy értesítést.

## Funkcionális követelmények
A felhasználó a program elindítása után a bejelentkező illetve regisztrációs felület fogadja, ahol ki tudja választani, hogy mit csinál. Regisztrációkor meg kell adni pár alapvető adatot (Név, email, jelszó). Ha a bejelentkezés gombra kattint akkor be kell írni a email címet és a jelszót. Ha sikeresen regisztrált vagy bejelentkezett, akkor máris elérhető neki minden funkció, középen megjelennek a többi felhasználó, akiket lehet lájkolni vagy elutasítani, vagy előtte meghallgatni pár saját zenét a felhasználótól, ha valaki lájkolja a profilod te kapsz egy értesítést, hogy XY szereti a munkásságod. Ha a beállítások gombra kattintunk, akkor elérhetővé válik a profilkép feltöltési lehetőség, zenék feltöltése és a szűrök kiválasztása (zenei stílusok, tudjon énekelni akit keresünk vagy milyen hangszeren játsszon), itt lehetősége lesz egy rövid bemutatkozót írni és itt állíthatja be hogy Ő tud e énekelni vagy éppen milyen hangszereken játszik egyszerű switch kapcsoló balra vagy jobbra húzásával.

## Jelenlegi helyzet
Jelenleg, ha valaki a bandájába keres valamilyen zenészt, illetve ha ő maga akar valahova csatlakozni, azt csak sok keresgélés árán és főképp emberi kapcsolatokon keresztül tudja megoldani. Az újságban való hirdetéséket elavultságukat tekintve a fiatalság nem fogja árgus szemekkel vizslatni zenei karrierjük beindítására ezért sok zenészt gátolnak ezek a problémák abban, hogy a számukra megfelelő zenekarba tartozzanak. Egy újságos hirdetés az applikációnkkal ellentétben nem zenészekkel van tele, nem lehet belőle promó anyagot hallgatni, nem lehet további információkhoz hozzájutni az adott zenekarról / egyéni zenészről, így eléggé csekély az esély, hogy valaki így találjon rá a neki megfelelő emberek társaságára. A XXI. század fiatalsága számára új megoldás kell az ilyesfajta társasági szerveződések megszervezésére.

## Fogalomtár
Reszponzív felület - PC-n igazodik a képernyőhöz a felület mérete, azaz különböző méretarányú és felbontású kijelzőkön is probléma nélkül megjeleníthető.

 Lájk - mikor a felhasználó egy másik profilját látva az alatta megjelenő zöld jelzésre kattintva egy automatikus üzenetet küld a másik félnek az érdeklődése felől, erre kettő féleképpen válaszolhat a másik fél, vissza lájkol, vagy rákattint a piros x-re.
 
 Szűrők - ezek beállításával kereshet a felhasználó (például ha egy gitáros énekest keresünk, akkor ezt a kettő lehetőséget be aktiválva a kereső algoritmus már csak ezeknek a paramétereknek megfelelő személyeket ajánl fel).

Profil - Ide tölthetünk fel profilképet, olyan hangfájlokat amikben éppen egy hangszeren játszunk vagy éppen éneklünk, itt adhatunk meg egy rövidke leírást magunkról, itt adhatjuk meg hogy milyen hangszereken tudunk játszani vagy éppen tudunk-e énekelni (ezeket az adatokat fontos megadni regisztráció után mert a kereső motor ez alapján ajánlhat fel mások számára !).

Értesítő sáv - Itt láthatjuk az értesítéseket, hogy ki lájkolta a profilunkat. Ha itt rákattintunk egyik értesítésre, rögtön az adott személy profilját látjuk.

## Rendszerre vonatkozó törvények


### Általános Információk

Az Alkalmazáshoz való hozzáférést és annak használatát az alkalmazandó jogszabályok és a jelen Felhasználási Feltételek és Adatkezelési tájékoztató (a továbbiakban Felhasználási Feltételek) szabályozzák. Az Alkalmazást letöltők és használók (a továbbiakban: a Felhasználók) elfogadják a jelen Felhasználási Feltételeket. Amennyiben ezen Felhasználási Feltételeket és Adatkezelési Tájékoztatót nem fogadják el, nem jogosultak a regisztrációra és az Alkalmazás használatára.

A jelen Felhasználási Feltételekre a magyar jog az irányadó, tekintet nélkül a nemzetközi magánjog előírásaira. Az Alkalmazás Felhasználói kifejezetten hozzájárulnak ahhoz, hogy a jogvitákra a magyar hatóságoknak és bíróságoknak legyen kizárólagos joghatóságuk a magyar jog alapján.


### Szellemi tulajdon

Az Alkalmazás és valamennyi kapcsolódó védjegy, szerzői jogi alkotás és egyéb – akár bejegyzett, akár be nem jegyzett – szellemi tulajdon (a továbbiakban együttesen: Szellemi Tulajdon) tulajdonosa az EKE és/vagy EKE Szolgáltató, valamint az alkalmazáshoz kedvezményt nyújtó partnerek. A Felhasználók az Alkalmazást a Szellemi Tulajdon maximális tiszteletben tartásával jogosultak használni. A Szellemi Tulajdon kiterjed különösen, de nem kizárólagosan valamennyi szoftverre, logóra, márkajelre, márkanévre, fényképre, szövegre, grafikára, adatbázisra. A Szellemi Tulajdonnak tilos bárminemű megsértése, bitorlása, másolása, átdolgozása és tilos azt bármilyen egyéb módon megsérteni, azt jogosulatlanul felhasználni, továbbadni, megterhelni, azzal bármilyen módon rendelkezni, visszaélni. Ezen szabályok megsértése az Alkalmazás használati lehetőségeinek azonnali hatályú megszüntetése mellett a megfelelő jogi lépések megtételét – beleértve esetleges büntetőjogi lépések megtételét is – vonja maga után a Felhasználóval, más jogsértő személlyel szemben a Tulajdonos és/vagy a Szellemi Tulajdon egyéb jogosultjai által.


### Használat

Az Alkalmazás Felhasználói 16 éven felüli természetes személyek lehetnek. Az Alkalmazás díjmentesen vehető igénybe, kizárólag privát, azaz nem üzletszerű módon és célra, kizárólag a jelen Felhasználási Feltételek szerint. Az Alkalmazás letöltéséért és használatáért az adatforgalmat biztosító szolgáltató külön díjat számíthat fel. Az ezzel kapcsolatos esetlegesen felmerülő költségek a Felhasználót terhelik.

A Felhasználási Feltételek és az Alkalmazás működésének a módosítására, az Alkalmazás működésének a megszüntetésére a Tulajdonos bármikor jogosult, a Felhasználó előzetes értesítése nélkül. Az Alkalmazáshoz való hozzáférést a Tulajdonos bármikor visszavonhatja akár az adott Felhasználóra nézve, akár szélesebb körben vagy teljes körűen előzetes értesítés, figyelmeztetés nélkül.


### Felelősségi szabályok

A Tulajdonos fenntartja magának a jogot arra, hogy amennyiben valamely Felhasználó részéről bármilyen manipulációt, tömegesen generált letöltést, illetve az Alkalmazás szellemével bármilyen módon összeférhetetlen vagy azt sértő magatartást tapasztal, vagy ennek megalapozott gyanúja felmerül, úgy a Felhasználót azonnali hatállyal kizárja az Alkalmazás felhasználói köréből.

Az Alkalmazáshoz kapcsolódó adatbázis módosítása kizárólag az Üzemeltető által, illetve az Alkalmazást üzemeltető webkiszolgálón keresztül lehetséges. Bármilyen külső, nem az Alkalmazás részeként elérhető eszközzel történő beavatkozás a Felhasználó azonnali kizárását eredményezi.

Ha a Felhasználó az Alkalmazást használat közben bezárja, vagy ha a kapcsolat (bármely okból) megszakad a kiszolgáló webhelyével, abban az esetben az adatok elvesztéséért a Tulajdonos semmilyen felelősséget nem vállal. A Tulajdonos és az Üzemeltető a rendelkezésére álló eszközökkel biztosítja, hogy az Alkalmazás használata technikai szempontból biztonságosnak minősüljön. Az Alkalmazáshoz való csatlakozás miatt bekövetkező károkért, az internetes hálózat esetleges üzemkimaradásából, az elérési út hibájából, bármely nem várt technikai hibából eredő adatvesztésért, vírusból, vagy más károkért a Tulajdonos nem felelős. A Felhasználóknak minden esetben fel kell mérniük, hogy rendelkeznek-e az Alkalmazás használatához szükséges ismeretekkel, technikai követelményekkel és teljesítményekkel.


### Technikai követelmények

Az Alkalmazás használatához szükséges technikai feltételek: Android operációs rendszer 4.0.3 vagy későbbi verziójával ellátott mobiltelefon vagy iOS operációs rendszer 9.0 vagy későbbi verziójával ellátott mobiltelefon, valamint minimum 100 MB szabad tárhely és a használathoz megfelelő sávszélességű internetelérés. A technikai feltételeket az Alkalmazás letöltéséhez és használatához a Felhasználónak kell teljesítenie. A technikai feltételek nem teljesüléséért a Tulajdonos nem vonható felelősségre. Ugyanígy nem vonható felelősségre a Tulajdonos az Alkalmazás használatából a készüléken bekövetkező adatvesztésért, meghibásodásért. A Tulajdonos kizár minden kártérítési felelősséget az Alkalmazáshoz csatlakozó minden külső szerver által nyújtott (kiemelten Facebook adatok átvétele) vagy megjelenített adattal, információval kapcsolatban is.

Az Alkalmazás telepítéssel, bizonyos funkciói pedig regisztrációt követően vehetők használatba. A telepítés kizárólag a Google Play vagy az Apple App Store felületén keresztül engedélyezett.

Az Alkalmazás verziózott, a mobiltelefonon futó operációs rendszer – beállításoktól függően – rendszeresen keres frissítéseket. Amennyiben az Apple App Store, illetve a Google Play-en elérhető frissítés, az operációs rendszer felajánlja a frissítés lehetőségét. Az Apple App Store, illetve a Google Play és az operációs rendszer működéséért a Tulajdonos semmilyen felelősséggel nem tartozik.

Mobilkészülék cseréje során az Alkalmazás ismételt letöltése szükséges. Az új letöltés azonban nem igényel újabb regisztrációt és a korábbi, Alkalmazásban tárolt információk is elérhetőek maradnak bejelentkezést követően. Mobiltelefonszám cseréjekor a Felhasználónak nincs teendője az Alkalmazással kapcsolatban.


### Regisztráció és tárolt adatok

A regisztráció két módon lehetséges: Facebook azonosító segítségével vagy email cím és jelszó megadásával. A regisztráció során megadott adatok helyességéért a Tulajdonos, illetve az Üzemeltető semminemű felelősséget nem vállal.

A regisztrációt követően Üzemeltető és/vagy Tulajdonos a Felhasználó részére az Alkalmazás működésével kapcsolatosan, különösen versenyjelentkezéssel kapcsolatos tájékoztatást, visszaigazolást, alkalmazás frissítésével kapcsolatos tájékoztató leveleket küldhet a Felhasználó e-mail címére.

Az Alkalmazás adatbázisából előzetes értesítés nélkül törlésre kerülhet az a Felhasználó, aki az általa megosztott tartalmakkal megsérti harmadik fél személyiségi vagy egyéb jogait, valamint a szerzői jogot, bármilyen Szellemi Tulajdonnal kapcsolatos jogot vagy bármilyen egyéb jogszabály rendelkezéseit, kereskedelmi, üzleti célú hirdetéseket jelenít meg (ún. spam) formájában akár saját profiljával, akár a közösségi felületeken megosztott üzenetekkel, más Felhasználókat zaklat, megfélemlít, rágalmaz saját profiljával. Az Alkalmazás adatbázisából előzetes értesítés nélkül törlésre kerülhet az a Felhasználó is, aki az Alkalmazást saját nevében terjeszti, részben vagy egészben másolja, átdolgozza, a Szellemi Tulajdont bármilyen egyéb módon bitorolja, másolja, azzal visszaél, jogosulatlanul használja az Alkalmazás és a Tulajdonos védjegyeit, kárt tesz az Alkalmazásban bármilyen módon, pl. szoftverek és távközlési berendezések segítségével a jelen Felhasználási Feltételekben foglaltakat bármilyen egyéb módon megszegi.

A Felhasználó bármikor kérheti regisztrációjának törlését írásban a tinderformusic@gmail.hu email címre küldött levélben.


### Értesítések

Az Alkalmazás használata során, a beépített üzenetküldő szolgáltatás segítségével értesítéseket kaphat a Felhasználó az Alkalmazással kapcsolatosan. A telepítést követően az első lépésként az Alkalmazás engedélyt kér a rendszerszintű értesítésekhez ezeket lemondani a telefon operációs rendszerének Beállításaiban lehetséges.


### Garancia és kártérítés

Az Alkalmazás használatához a felhasználói oldalon szükséges – fent meghatározott vagy bármely egyéb - technikai feltételeket a Felhasználónak kell biztosítania, teljesítenie. Ezen technikai feltételek nem teljesüléséért a Tulajdonos nem vonható felelősségre. Ugyanígy nem vonható felelősségre a Tulajdonos az Alkalmazás használatából adódóan, a készüléken bekövetkező adatvesztésért, meghibásodásért. A Tulajdonos kizár minden kártérítési felelősséget az Alkalmazáshoz csatlakozó minden külső szoftver által nyújtott (így kiemelten Facebook adatok átvétele) vagy megjelenített adattal, információval kapcsolatban. A Tulajdonos nem vállal garanciát az Alkalmazás megszakításmentes működéséért, valamint vis major hibákért. Az ebből eredő adatvesztésért, tartalom vesztésért a Tulajdonos szintén nem tartozik kártérítési felelősséggel.


### Egyéb rendelkezések

Jelen Felhasználási Feltételekben nem szabályozott kérdésekben a hatályos jogszabályok – különösen, de nem kizárólagosan a Polgári Törvénykönyvről szóló 2013. évi V. törvény, az Európai Parlament és Tanács 2016. április 27-i (EU) 2016/679 Rendelete a természetes személyeknek a személyes adatok kezelése tekintetében történő védelméről és az ilyen adatok szabad áramlásáról, valamint a 95/46/EK irányelv hatályon kívül helyezéséről, az információs önrendelkezési jogról és az információ szabadságról szóló 2011. évi CXII. törvény, a szerzői jogról szóló 1999. évi LXXVI. törvény, valamint az elektronikus kereskedelmi szolgáltatások, valamint az információs társadalommal összefüggő szolgáltatások egyes kérdéseiről szóló 2001. évi CVIII. törvény – rendelkezései az irányadóak.


### Kapcsolat

Az Alkalmazás támogatását az Üzemeltető végzi munkanapokon, 9:00 és 17:00 között. Az Alkalmazás működésével kapcsolatban a Felhasználó tinderformusic@gmail.com e-mail címre küldheti kérdéseit, amelyre az Üzemeltető a fenti időszakban válaszol.


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
- K1  A felhasználó az email címe és a jelszava segítségével bejelentkezhet.
Ha a megadott email cím vagy jelszó nem megfelelő, akkor a felhasználó hibaüzenetet kap.

- K2  A felhasználó a felhasználói nevének, email címének és jelszavának megadásával regisztrálja magát.
A jelszó tárolása kódolva történik az adatbázisban. Ha valamelyik adat ezek közül hiányzik vagy nem felel meg a követelményeknek,
akkor a rendszer értesíti erről a felhasználót. 

- K3   Admin-Rendszerhozzáférés, feladatok feltöltése, felhasználók / szerepkörök módosítása.
Zenész-átlag felhasználó, üzenetek, likeok 

- K4 A felhasználó módosítani tudja saját Felhasználónevét. Ehhez szükséges a régi és az új felhasználók megadása, az új megerősítése,
valamint a felhasználó jelszojának megadása. 

- K5 A felhasználó módosítani tudja saját jelszavát. Ehhez szükséges a régi és az új jelszojának megadása, valamint az új megerősítése.

- K6 Ha a felhasználó elfelejtette a felhasználónevét, vagy jelszavát akkor ezzel az opcióval egy Adminhoz tud fordulni.

- K7 A felhasználó regisztráció után feltölthet magáról egy promó anyagot bizonyítva, hogy zenész, megmutatva tehetségét.

- K8 Egy lista a Zenészek Like-számairól, és pontjairól, a lista elején a legtöbb pontot elért felhasználó található.

- K9 A felhasználók egymást között tudnak küldeni üzeneteket, jogosultságuktól függően.

- K10 A felhasználónak lehetősége van a profilján található bemutatkozó szöveg módosítására.
