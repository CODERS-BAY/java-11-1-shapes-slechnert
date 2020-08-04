

# Java 

​

## Comic Analysis 

​

Schreibe ein Programm, dass die folgenden Dateien einliest und 

in eine Sinnvolle Datenstruktur `Comic` und und `ComicCharacter` speicherst. 

Ein `ComicCharacter` sollte eine Liste von `Comic`s besitzen in denen dieser Charakter vorkommt, 

diese Infos bekommst du aus dem CSV, welches eine Verbindungstabelle darstellt `charactersToComics.csv`.

In dem sind allerdings nur IDs verknüpft, d.h. du solltest zuvor das CSV `comic_characters.csv` und `comics.csv` einlesen.

Zusätzlich gibt es über den Namen, nicht die ID verschiedene Eigenschaften zu einem Comic Charakter, diese Infos kannst du aus `character_properties.csv` lesen.

​

Schreibe dann einzelne Funktionen welche: 

* die TOP 10 der Charaktere, die in den meisten Comics vorkommen, zurückgibt. 

* die je die TOP 5 der klügsten, stärksten, ausdauerndsten und schnellsten Charaktere zurückgibt

* die durchschnittliche Intelligenz, Stärke, Ausdauer und Schnelligkeit für gute und für schlechte Charaktere zurückgibt

​

Für diese Funktionen kannst und solltest du auch gerne Unit Tests schreiben! Um das schön testen zu können musst du die möglichkeit haben die Character Liste zu ändern (um im Test mit einem kleineren hardcodierten Set zu arbeiten z.B.)

