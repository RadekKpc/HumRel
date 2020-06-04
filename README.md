# HumRel

<b>Przedmiot</b> Bazy Danych</br>
<b>Temat:</b> Wykorzystanie bazy grafowej Neo4j do reprezentacji struktury powiazań pomiędzy ludźmi<br>
<b>Twórcy:</b> Radosław Kopeć, Paweł Pławecki<br/>
<b>Data Rozpoczęcia:</b> 22.05.2020

### Contributors

- [Radosław Kopeć](https://github.com/radekkpc)

- [Paweł Pławeck](https://github.com/rzabolbabol)

## Harmonogram projektu

### TECHNOLOGIE

* node.js
* express.js
* neo4j

### INSTRUKCJA URUCHOMIENIA

Przygotowanie bazy:
* W pliku server/app.js znajdują się dane do połaczenia z bazą Neo4j

* Nalezy stworzyc nową bazę danych i uruchomić w niej skrypt server/db_script.txt (metodą kopiuj wklej) jest to baza testowa

* Nastepnie dodac do niej użytkownika o nazwie "project" i haśle "1234",

Uruchomienie serwera aplikacji:

* cd server
* npm install
* node app.js