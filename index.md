./ Willkomen zu unserem Java Tutorial

### In diesen Tutorial, werden wir euch die Grundlagen für Java, inklusive Beispiele erklären.

 **Java**, was für "*Just Another Vogue Acronym*" in deutsch "*Nur ein weiteres unbestimmtes Akronym*" steht, ist eine Programmiersprache, die nach **20 Jahren** von rund **9 Milionen Software Entwicklern** verwendet wird. Sie ist dank ihrer zahlreichen Bibliotheken, und als rubste Objektorientierte Programmiersprache Konkurenzloser Marktführer im Bereich, Plattform unabhängige Programiersprache. Rund **3 Milliarden Geräte füren Java Programme aus**.

---
## Geschichte

**Bill Joy** hatte die Vorstellung, eine neue, bessere Programmiersprache auf der Basis von **C++** zu kreiren, da er mit den bis dahin existierenden, unzufrieden war. Später wusste er das C++ ungeeignet für einen langen Code sei.

**James Gosling** hatte die Programmiersprache **Oak** (**Object Aplication Kernel**) entwickelt. Folgend daraus entwickelten er und die anderen Mitglieder eines damaligen Projektes Namens **Green**, das Gerät **Star Seven** (*7) aus den Überresten des Gescheiterten Projekts **Green OS**. Das Team Gründete die Firma **First Person Inc.**. 

Nach eienigen Richtungswechseln, wie zum Beispiel einen gescheiterten Versuch, Star Seven im **Set Top Boxen** Markt zu vermarkten, konzentrierten sie sich auf das **World Wide Web** (WWW / Web).

Die Programmiersprache sollte Programmcode aus dem Web empfangen können, ohne das beschädigter Code Schaden anrichten konnte. Damit wären die meißten C++ Konzepte schon übertrumpft. 

Aus Copyright Gründen bekam Oak, den Namen **Java**.

Am 23. Januar 1996 wurde **JDk 1.0** veröffentlicht, was Programierern erlaubte, mit Java ihre eigenen Minigames zu programmieren. 

Die verbliebenden Mitglieder von First Person Inc., gründeten JavaSoft.
---
## ./ Einführung

Java funktioniert immer nach dem selben Prinzip.Zuerst gibt man die **Main Methode** an. alles in dieser Methode, gibt den Ablauf des Programmes an. Die Methode läuft von oben nach unten ab.
Man gibt dem Programm einen **Command**

---

## ./ Allgemeiner Teil
---
<br>

### EVA-Prinzip 

Dass EVA-Prinzip ist ein Begriff aus der Datenverarbeitung. Die Abkürzung steht für **E** Eingabe, **V** Verarbeitung, **A** Ausgabe.


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

---
### Algorithmus 
<br>
   
Ein **Algorithmus** ist die eine vorgegebene Vorgehensweise zur Lösung eines Probelemes. Der Vorgang verläuft Schrittweise und er benötigt immer einen Eingabewert um diesen zur Verarbeiten und einen Ausgabewert auszugeben.

Ein Beispiel für einen **Algorithmus** ist der Google Algorithmus. Er ist dafür zuständig,dass Websiten nach Relevanz und anderen Faktoren wie Schlüsselwörter, gerankt werden. Das bedeutet, dass es ein Ranking gibt, auf welchen Platz eine Website steht.

Ein **Algorithmus** besitzt verschiedene Eigenschaften: 

1. Determiniert 
   - Er liefert bei gleicher Eingabe immer die gleiche Ausgabe.
  
2. **Deterministisch** 
   - Jeder einzelne Schritt ist vorgegeben und führt zum Ende.  
  
3. **Finit**
   - Der Algorithmus besteht aus einer bregenzten Anzahl an Zeichen im Quelltext. 
  
4. **Terminiert**
   - Der Alogorithmus kommt nach einer bestimmten Zeit zu einen Ergebnis. 

5. **Effektive** 
   - jeder einzelne Schritt ist sinvoll und führt schritt für schritt zur ausgabe.

<br>

---

### Wie funktioniert ein Java Programm 

<br>

Um zu verstehen wie ein Java Programm ausgeführt wird müssen wir erstmal ein paar Begriffe erklären.

Der Computer kann nämlich nur Programme in **binärer form** ausführen. Das heißt der code besitzt **einsen** (1) und **nullen** (0). Wenn also ein Programm in **Maschinencode** umgewandelt wird, dann kann der Computer dieses ausführen, weil dieses in binärer form geschrieben ist.

Ein **Compiler** ist dafür zuständig, dass ein Programm welches Quellcode geschrieben ist, in Maschinencode umwandelt wird.

Das heißt, dass der Compiler die Befehle einer Programmiersprache so umwandelt, dass der Computer mit ihnen arbeiten kann. Man nennt diesen Vorgang auch kompilieren.

<br>

Der **Executor** ist dafür zuständig, dass der Kompilierter Code ausgeführt wird.

<br>

Der Gegenteil von einen Compiler ist der **Interpreter**

Dieses ist auch ein Programm für die Verarbeitung von Befehlen. Hierbei liegt aber der Unterschied, dass dieser direkt die Befehle ausführen kann ohne sie in Maschinencode umzuwandeln. <br>
Er liest einen Befehl, wandelt ihn Maschinencode um und führt in dann aus. Danach fängt er mit dem nächsten Befehl an. 

Der Vorteil ist, dass die Befehle unmittelbar ausgeführt werden. Das Bedeutet, dass jeder einzelne Befehl interpretiert wird. Das führt zur einer besseren Fehleranalyse.

Der Nachteil ist, dass es im Vergleich zum Compiler deutlich länger dauert die Befehle auszuführen.

<br>
<br>

### Wir wird aus Java Quellcode Maschinencode

Zuerst wird der **Java Quellcode** (Endung: .java) mit dem Java Compiler in **Java bytecode** (Endung: .class) umgewandelt. Im nächsten Schritt wird der Java bytecode von der **Java Virtual Machine(JVM)** bearbeitet. Die Java Virtual Machine ist ein interpreter und wie wir uns zurück erinnern übersetzt er jeden Befehl einzeln, führt ihn dann aus und fängt beim nächsten Befehl an. Zum Ende hat man ein ausgeführtes Java Programm.

Der Vorteil an die JVM ist, dass das Java Programm auf jeden Betriebssystem gleich läuft. Es muss nämlich nur die JVM für das Betriebssystem angepasst sein.

<br>
<br>
<br>

---

## Einführung in die Programmierung 

### Variablen

Variablen sind **Datenbehälter**, die Zahlen oder Buhstaben beinhalten können. Man kann eine Variable an mehreren Stellen in einem Programm verwenden, wenn man möchte, dass es immer der gleiche Wert ist und sich dieser auch gleich ändert. Um eine Variable zu iniziieren, muss man ihr einen **Datentyp** und einen **Bezeichner** zuweisen. Ein Beispiel für eine Variable wäre: 
int number = 20;
Durch diesen Befehl hat man eine Variable, mit dem Wert 20 erstellt, ihr den Bezeichner "number" gegeben undFalls die Var ihr den Datentyp der zur 20 passend ist: int (integer) zugewiesen.
Dass der Datentyp stimmt, ist essenziell, damit die Variable richtig funktioniert, denn je nach Datentwkrdann nur ein bestimmter Zahlenbereich ausgegeben werden. Wenn man versucht, die Variable wie folgt zu iniziieren, wird sie nicht die gewünschte Zahl, sondern nur die höchst mögliche Zahl in ihrem Bereich (in diesem Fall 127) ausgeben.
byte number = 128; Der byte Datentyp umfasst nur die Zahlen von -128 - 127, weshalb die 128 nicht ausgegeben werden kann. *Tabelle*

### Schleifen

#### While Schleife

Eine While Schleife besagt im Groben nur, dass etwas getan, beziehungsweise ausgegeben werden soll, **während ein bestimmtes Ereigeigniss** zutrifft. Bedeutet, dass man zum Beispiel eine Geschwindigkeit erhöhen kann, solange man eine Bedingung erfüllt. 
Ein Beispiel für eine While Schleife, die dauerhaft eine Variable ausgibt, die kleiner oder gleich 10 ist, wäre:
int number = 9
while(number <= 10){
iaBedingung nicht erfüllt wird    System.out.println(number);
}
,
1 ausgibt, wenn die Bedingung erfüllt ist, aber  ### Bedingungen 
nd andernfalls 
 #### if"Trifft nicht zu" ausgibt, ist:
if -Bedingung
falls ***
* Mit einer if -Bedingung drückt man aus, was getan werden soll, während eine Bedingung erfüllt ist.
so
 
wir
 d entweder nicht, oder eins,  Ausgegeben, ausgegeben, oder es wird dem wurde in der Bedingung angegebnen, was
 so(number = 1)n{
    System
ist koWW"}
elst gemac .ohür e
korrek    Ein Beispielut"t.println("Das ist )se {}
    
t falsSystem.out.pTrifft nicht zus is

<br>
<br>
<br>

---
## Einführung in die objektorientierte Programmierung

---
### Klasse








---
### Objekte






---
### Klassendiagramme







---
### Objektdiagramme





---
### Konnstrukturen 






---
### Objektmethoden





