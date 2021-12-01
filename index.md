# ./ Willkomen zu unserem Java Tutorial

### In diesen Tutorial, werden wir euch die Grundlagen für Java, inklusive Beispiele erklären.

 **Java**, was für "*Just Another Vogue Acronym*" in deutsch "*Nur ein weiteres unbestimmtes Akronym*" steht, ist eine Programmiersprache, die nach **20 Jahren** von rund **9 Milionen Software Entwicklern** verwendet wird. Sie ist dank ihrer zahlreichen Bibliotheken, und als rubste Objektorientierte Programmiersprache Konkurenzloser Marktführer im Bereich, Plattform unabhängige Programiersprache. Rund **3 Milliarden Geräte füren Java Programme aus**.

---
## ./ Geschichte

**Bill Joy** hatte die Vorstellung, eine neue, bessere Programmiersprache auf der Basis von **C++** zu kreiren, da er mit den bis dahin existierenden, unzufrieden war. Später wusste er das C++ ungeeignet für einen langen Code sei.
<br>
*James Gosling** hatte die Programmiersprache **Oak** (**Object Aplication Kernel**) entwickelt. Folgend daraus entwickelten er und die anderen Mitglieder eines damaligen Projekt Namens **Green** das Gerät **Star Seven** (*7) aus den Überresten des Gescheiterten Projekts **Green OS**. Das Team Gründete die Firma **First Person Inc.**. 
<br>
Nach einigen Richtungswechseln, wie zum Beispiel einen gescheiterten Versuch, *7 im Set Top Boxen Markt zu vermarkten, konzentrierten sie sich auf das **World Wide Web** (WWW / Web).
<br>
Die Programmiersprache sollte Programmcode aus dem Web empfangen können, ohne das beschädigter Code Schaden anrichten konnte. Damit wären die meißten C++ Konzepte schon übertrumpft. 
<br>
Aus Copyright Gründen bekam Oak, den Namen **Java**
<br>
Am 23. Januar 1996 wurde **JDk 1.0** veröffentlicht, was Programiierern erlaubte, mit Java, ihre eigenen Minigames zu programmieren. 
<br>
Die verbliebenden Mitglieder von First Person Inc. gründeten die Firma **JavaSoft**.

---




## ./ Allgemeiner Teil

<br>
<br>

### EVA-Prinzip 
<br>

Dass EVA-Prinzip ist ein Begriff aus der Datenverarbeitung. Die Abkürzung steht für **E** Eingabe **V** Verarbeitung **A** Ausgabe.
<br>

Bei der **Eingabe** werden Daten eingeben mithilfen von Eingabegeräten wie z.B der Tastatur.
<br>

Die **Verarbeitung** ist der wichtigste Teil. Hier werden die eingegebenen Daten nach vorgaben durch Programm bearbeitet.
<br>

Der letze Schritt ist die **Ausgabe**. bei der Ausgabe werden die verarbeiteten Daten ausgegeben durch beispielsweise Monitore oder Kopfhörer.
<br>

Im Allgemeinen kann man sagen,dass das **EVA Prinzip** ist die Reihenfolge wie der Computer Daten verarbeitet.

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

### Algorithmus 
<br>

Ein **Algorithmus** ist die eine vorgegebene Vorgehensweise zur Lösung eines Probelemes. Der Vorgang verläuft Schrittweise und er benötigt immer einen Eingabewert um diesen zur Verarbeiten und einen Ausgabewert auszugeben. 

 

 ### Variablen

Variablen sind **Datenbehälter**, die Zahlen oder Buhstaben beinhalten können. Man kann eine Variable an mehreren Stellen in einem Programm verwenden, wenn man möchte, dass es immer der gleiche Wert ist und sich dieser auch gleich ändert. Um eine Variable zu iniziieren, muss man ihr einen **Datentyp** und einen **Bezeichner** zuweisen. Ein Beispiel für eine Variable wäre: 
int number = 20;
Durch diesen Befehl hat man eine Variable, mit dem Wert 20 erstellt, ihr den Bezeichner "number" gegeben und ihr den Datentyp der zur 20 passend ist: int (integer) zugewiesen.
Dass der Datentyp stimmt, ist essenziell, damit die Variable richtig funktioniert, denn je nach Datentyp kann nur ein bestimmter Zahlenbereich ausgegeben werden. Wenn man versucht, die Variable wie folgt zu iniziieren, wird sie nicht die gewünschte Zahl, sondern nur die höchst mögliche Zahl in ihrem Bereich (in diesem Fall 127) ausgeben.
byte number = 128; Der byte Datentyp umfasst nur die Zahlen von -128 - 127, weshalb die 128 nicht ausgegeben werden kann. *Tabelle*

### Schleifen

#### While Schleife

Eine While Schleife besagt im Groben nur, dass etwas getan, beziehungsweise ausgegeben werden soll, **während ein bestimmtes Ereigeigniss** zutrifft. Bedeutet, dass man zum Beispiel eine Geschwindigkeit erhöhen kann, solange man eine Bedingung erfüllt. 
Ein Beispiel für eine While Schleife, die dauerhaft eine Variable ausgibt, die kleiner oder gleich 10 ist, wäre:
int number = 9
while(number <= 10){
    System.out.println(number);
}

### Bedingungen 


