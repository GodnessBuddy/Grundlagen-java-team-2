
import java.time.chrono.HijrahEra;
import java.util.Scanner;

import javax.lang.model.util.ElementKindVisitor7;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
        
    public static void main(String[] args) throws Exception {

        // System objects
        Scanner in = new Scanner(System.in);

        // Objekte erzeugen
        Team team = new Team();
            team.teamname = "";
            team.teammitglieder = "";
            team.disadvantage = "";
            team.advantage = "";
 
        //Game 
        Game game = new Game(new Player("", 100));
            game.setHilfe("In dem Story Spiel THE REVENGE kannst du selber entscheiden, wie die Story weiter geht.\n" +
                        "Für jede Entscheidung können dir Karmapunkte abgezogen oder draufgerechnet werden. \n" +
                        "Wähle weise, denn je weniger Karmapunkte du hast, desto schwerer wird es für dich zu überleben.");     // setzt die Hilfe
                        
                                                        // game.showhilfe();   zeigt die Hilfe
            game.spieler1.karmapunkte = 0;
            game.setfalsecommand("Falsche Eingabe!");   // setzt die Falsche Eingabe 
                                                        // game.showfalsecommand();    Zeigt an, dass die Eingabe Falsch wahr
            System.out.print(game.spieler1.name); 
            game.setstrich("--------------------------------------"); // Command für den Trennstrich
                                                                      // game.showstrich();   zeigt den Strich

        // Player

        // int a für Anfang des Spiels 
        int a = 0;

            // Hier wird gefragt ob das Spiel gespielt werden will :
           while (a <= 1) {
                a++;

                System.out.println("Willkommen zu THE REVENGE");

                game.showstrich();
                System.out.println("Möchtest du das Spiel spielen?");
                System.out.println("\t" + "Schreibe --1-- um das Spiel zu beginnen");
                System.out.println("\t" + "Schreibe --2-- um das Spiel nicht zu beginnen");
                game.showstrich();

                // String input der als Scanner die nächste Zahl ließt
                String input = in.nextLine();

                if (input.equals("1")) {
                    break;

                } else if (input.equals("2")) {
                    System.exit(0);  
                
                } else
                    game.showfalsecommand();
                    System.exit(0);
            }
            
            // player Name der in der nächsten Zeile gelesen wird 
            game.showstrich();;
            System.out.println("Wie willst du heißen?:");

    
                game.spieler1.name = in.nextLine();
                
            // Variable e für Einführung
            int e = 0;

            // Einführung
            while(e <1) {
                
                game.showstrich();
                System.out.println("Dein Name ist:" + " " +  game.spieler1.name);
                System.out.println(" ");
                System.out.println("\t" + "Wenn du Hilfe benötigst dann schreibe --hilfe--");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du dir deine Karma Punkte anzeigen lassen willst dannn schreibe --karmapunkte--");
                System.out.println(" ");
                System.out.println("\t" + "Wenn du die Geschichte anfangen willst dann schreibe --weiter--");
                game.showstrich();
                    String input = in.nextLine();

                    // Fehler der noch behoben werden muss (weiter muss 2 mal eingabe Taste)
                    if (input.equals("weiter")) {
                        e++;  

                    }else if (input.equals("hilfe")) {
                        continue;
                    

                    } else if (input.equals("karmapunkte")) {
                        game.spieler1.showkarmapunkte();
                        continue;
                    } 

                    else {
                        game.showfalsecommand();
                        continue;  
                    }
                 
            }


        // Story Start

        // Einleitung in das Spiel
            game.showstrich();
            System.out.println("Einleitung");
            System.out.println("Es ist 2088 in Deutschland. Deutschland ist ein Land in dem nur Krieg herscht.\n"+
                                "Frau + 2 Söhne erschossen von Soldaten."); //geht noch weiter
            game.showstrich();

            System.out.println("Du kannst dich nun zwischen 2 Teams entscheiden");
            System.out.println("");
            System.out.println("Team Bravo 6:");
            System.out.println("\t" + "Der Truppleiter, welcher dir direkt unterstellt wäre, heißt Vladimir Gorbatschow und gibt deine Befehle an das Team weiter.");
            System.out.println("\t" + "Die Namen der Teammitglieder lauten: Jimmy, Riger, Jessica, Eugene, Anastasia, Norman, Stephen und Bernd."); 
            System.out.println("\t" + "Dieses Team ist sehr gut in Stealth Angriffen und hat einen starken Kampfgeist."); 
            System.out.println("");
            System.out.println("Team Delta 5:");
            System.out.println("\t" + "Der Truppleiter, welcher dir direkt unterstellt wäre, heißt heißt Jenz Frust und gibt deine Befehle an das Team weiter.");
            System.out.println("\t" + "Die Namen der Teammitglieder lauten: Tina, Charlotte, Peter, Vlad, Dimitri, Achmed, Klaus und Hanz.");
            System.out.println("\t" + "Dieses Team ist sehr taktisch und sehr fokusiert.");
            System.out.println("");

            // Teamauswahl
            int t = 0;

            while (t < 1 ) {

                game.showstrich();
                System.out.println("Wenn du dich für das Team Bravo 6 entscheidest dann schreibe " + "--1--");
                System.out.println("Wenn du dich für das Team Delta 5 entscheidest dann schreibe " + "--2--");
                game.showstrich();

                String teamauswahl = in.nextLine();
        
                    if(teamauswahl.equals ("1")) { 
                        team.teamname = "Bravo-6";
                        break;
                    }
                
                    else if (teamauswahl.equals("2")) {
                        team.teamname = "Delta-5";
                        break;
                    }
                
                    else {
                        game.showfalsecommand();
                        continue;
                    }               
            }
            

            // Story Bravo-6
            if(team.teamname.equals ("Bravo-6")) {

                team.teammitglieder = "Jimmy, Riger, Jessica, Eugene, Anastasia, Norman, Stephen und Bernd";
                team.advantage = "stealth Möglichkeit";
                team.disadvantage = "Differenzen mit dem Truppleiter"; 

                game.showstrich();
                System.out.println("Du hast das Team Bravo-6 gewählt.");
                game.showstrich();

                // int m für den loop für die andvantages usw
                int m = 0;

                while(m < 1){  

                    System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                    System.out.println("schreibe --teammitglieder-- um die Namen deines Teammitglieder zu sehen");
                    System.out.println("schreibe --advantage-- um die Vorteile dieses Teams zu sehen");
                    System.out.println("schreibe --disadvantage-- um die Nachteile dieses Teams zu sehen");
                    game.showstrich();

                    // Abfrage nach Teammitglieder, advantages, disadvantages
                    String inputteam = in.nextLine();
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                        continue;
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                        continue;
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                        continue;
                    }
    
                    else if (inputteam.equals("weiter")){
                        m++;  
                    }
                    else {
                        game.showfalsecommand();
                        continue;
                    }
                }

                game.showstrich();  
                System.out.println("Du startest direkt in das Geschehen hinein. \nDein Team diskutiert gerade, welches euer nächstes Angriffsziel wird"); // Diskussion mit dem Team, was man angreift 
                game.showstrich();  

                // ao = Angriffsortabfrage für Bravo 6   
                int ao = 0;
                while (ao < 1) {

                    game.showstrich(); 
                    System.out.println("Du kannst dich nun zwischen 2 verschiedenen Orten entscheiden, die du angreifen möchtest.");
                    System.out.println("Die erste möglichkeit währe die Satellittenbasis nähe Leipzig, welche schwerer, dafür strategisch wichtiger wäre einzunehmen.");
                    System.out.println("\t" + "Schreibe --1-- um diesen Angriff zu starten.");   
                    System.out.println("");  
                    System.out.println("Die zweite Möglichkeit ist das Munitionslager nähe Osnabrück, welche leichter, dafür weniger strategisch wichtig wäre einzunehmen.");
                    System.out.println("\t"+ "Schreibe --2-- um diesen Angriff zu starten.");        
                    game.showstrich(); 

                    // Abfrage für den Angriffsort
                    String angriffsort = in.nextLine();

                    if (angriffsort.equals("1")) {

                        game.spieler1.karmapunkte = -10; // Karmapunkte werden auf -10 gesetzt 
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden das Satelitenbasis in der nähe von Leipzig anzugreifen. ");
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte); 
                        game.showstrich(); 
                        ao++;
                    }

                    else if (angriffsort.equals("2")) {

                        game.spieler1.karmapunkte = 10; // Karmapunkte werden auf 10 gesetzt.
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden das Munitionslager in der nähe von Osnabrück anzugreifen."); 
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte);
                        game.showstrich(); 
                        ao++;
                    }

                    else {

                        game.showfalsecommand();
                        continue;
                    }
                }

                

                // Entscheidung Munitionslager (Karmapunkte = 10)
                if (game.spieler1.karmapunkte==10) {
                   
                    game.showstrich(); 
                    System.out.println("Ihr überfallt das Munitionslager, doch als ihr dort ankommt fällt euch auf, dass es gänzlich verlassen wurde.");
                    System.out.println("Ihr nehmt es ein, doch es bringt euch nicht wirklich viel");
                    game.showstrich(); 
                    

                }
                
                // Entscheidung für Satelitenbasis (Karmapunkte = -10)
                if (game.spieler1.karmapunkte==-10) {

                    
                    game.showstrich(); 
                    System.out.println("Wie du ja bereits weißt, birgt diese Entscheidung viele Risiken.");
                        game.showstrich();
                        System.out.println("Trotz des Risikos vertraut dein Team voll und ganz auf dich und dein Urteil \nDoch euer Angriff verläuft nicht wie geplant... \nGerade als ihr dort ankommt fliegt eine Handgranate auf euch zu, die euch alle töten wird.");
                        System.out.println("Doch aufeinmal hörst du etwas");
                        
                        System.out.println("Eugene: LAUFT ALLE WEG! \nEugene stürzt sich auf die Granate und fängt die Explosion ab");
                        System.out.println("Eugene hat sich für euch alle geopfert");
                        game.showstrich();
                        
                        System.out.println("Ihr alle seid geschockt");
                        game.showstrich();
                        System.out.println("Jessica: Wie konnte es nur soweit kommen?");
                        System.out.println("Norman: Er war doch unser Kamerad, wieso musste er sterben?");
                        System.out.println("Stephan: Das ist alles nur die Schuld von " +game.spieler1.name);
                        System.out.println("Anastasia: Stimmt, wir hätten lieber Osnabrück angreifen sollen");
                        System.out.println("Roger: Wie konntest du nur so eine dumme Entscheidung treffen?"); // Text der Story für Satellitenbasis 
                    game.showstrich();  

                    int se  = 0; // se = Schuldentscheidung
                    while (se < 1) {
                     
                        game.showstrich(); 
                        System.out.println("\t" + "Schreibe --1-- um zu sagen, dass es deine Schuld war"  );
                        System.out.println("\t" + "Schreibe --2-- um die Schuld auf den Truppenleiter zu schieben");   
                        System.out.println("");
                        System.out.println("Wenn du --karmapunkte-- schreibst, siehst du deine Karmapunkte");  
                        System.out.println("Wenn du --hilfe-- schreibst, siehst du die hilfe ");
                        game.showstrich(); 

                        String schuldentscheidung = in.nextLine(); // Scanner für Schuldentscheidung

                        if (schuldentscheidung.equals("1")) {

                            game.showstrich(); 
                            System.out.println("Du hast dich entschieden, dass du die Schuld trägst"); 
                            game.showstrich(); 
                            game.spieler1.karmapunkte = -20; // Karmapunkte auf -20
                            se++;
                        }

                        else if (schuldentscheidung.equals("2")) {

                            game.showstrich(); 
                            System.out.println("Du schiebst die Schuld auf den Truppleiter"); 
                            game.showstrich(); 
                            game.spieler1.karmapunkte = -10; // Karmapunkte auf -10
                            se++;
                        }

                        else if (schuldentscheidung.equals("karmapunkte")) {

                            game.spieler1.showkarmapunkte(); // zeigt Karmapunkte
                            continue;
                        }

                        else if (schuldentscheidung.equals("hilfe")) {

                            game.showhilfe(); // zeigt Hilfe
                            continue;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }   

                 // Abfrage der Karmapunkte, für den Verlauf des Spieles.

                 //Entscheidung Line 242 - 250 
                 if (game.spieler1.karmapunkte == 10) {
                    game.showstrich();
                    System.out.println("Da Osnabrück euch nicht viel gebracht hat, kommt die Diskussion auf, ob Leipzig nicht vielleicht doch besser gewesen wäre: \n");
                    System.out.println("Eugene: Wir hätten Leipzig angreifen sollen, das wäre vielleicht schwieriger gewesen, aber ist doch egal \nwenigstens hätte es uns etwas gebracht.");
                    System.out.println(game.spieler1.name + ": Red nicht so einen Blödsinn. Leipzig wäre viel zu gefährlich gewesen. \nBesser so, als wenn wir einen Mann verlieren oder Sonstiges.");
                    System.out.println("Anastasia: Ich sehe das genauso wie Eugene, Leipzig wäre besser gewesen.");
                    System.out.println("Riger: Regt euch ab, wir haben uns jetzt so entschieden und das wars. \nDann hat es uns halt nicht so viel gebracht, wenigstens leben wir alle noch");
                    game.showstrich();
                    System.out.println("Ihr fart fort mit der Planung eurer nächsten Mission");
                    
                }
                
                   else if (game.spieler1.karmapunkte == -10) {
                    int karma1 = 0;
                    while (karma1 < 1){
                           game.showstrich();
                    System.out.println("Du redest mit dem Truppleiter, dieser ist jedoch sehr sauer auf dich und rastet aus \nDas Gespräch eskaliert und du musst eine Entscheidung treffen: \n");
                    System.out.println("\nOption 1: Du verteidigst dich (mit Worten)");
                    System.out.println("\nOption 2: Du ignorierst ihn");
                    System.out.println("\nOption 3: Du bringst ihn um");
                    String schuldentscheidung = in.nextLine();
                    if (schuldentscheidung.equals("1")) {
                        game.showstrich();
                        System.out.println("Du entscheidest dich dazu, dich zu verteidigen \nNach einiger Zeit beruhigt sich dein Teamleiter");
                        System.out.println("Er sieht ein, dass das jetzt eh nichts mehr an der Lage ändert und entschuldigt sich für seinen Ausraster.");
                        System.out.println("Dein Team respektiert dich für deine Vorgehensweise");
                        game.spieler1.karmapunkte = game.spieler1.karmapunkte + 10;
                        game.showstrich();
                        System.out.println("Deine Karmapunkte:" + game.spieler1.karmapunkte);
                        game.showstrich();
                        System.out.println("Ihr fahrt mit der Planung eurer nächsten Mission fort");
                        karma1 = 1;
                    }
                    else if (schuldentscheidung.equals("2")) {
                        System.out.println("Du nimmst ihn nicht ernst und gehst weg, ohne ihm Beachtung zu schenken \nDas macht ihn jedoch nur noch saurer");
                        System.out.println("Dein Verhalten regt ihn so sehr auf, dass er sich nicht zusammenreißen kann \nEr bringt dich um...");
                        game.showstrich();
                        System.out.println("GAME OVER");
                        
                        System.exit(0);
                        
                    }
                    else if (schuldentscheidung.equals("3")) {
                        System.out.println("Weil du die unnötigen Anschuldigungen von deinem Teamleiter nicht mehr ertragen kannst \nrastest du aus und bringst ihn um");
                        System.out.println("Dieses Verhalten schockiert dein Team \nSie verlieren jeglichen Respekt vor dir");
                        game.spieler1.karmapunkte = game.spieler1.karmapunkte - 20;
                        game.showstrich();
                        System.out.println("Deine Karmapunkte:" + game.spieler1.karmapunkte);
                        game.showstrich();
                        System.out.println("Du fährst mir der Planung deiner nächsten Mission fort, bei dieser wird dich niemand unterstützen");
                        karma1 = 1;
                        
                    }
                    else {
                        game.showfalsecommand();
                    }
                    }
                   }
                    
                    
                else if (game.spieler1.karmapunkte == -20 ) {
                    int karma1 = 0;
                    while (karma1 < 1) {
                        System.out.println("Da Vieles schief gelaufen ist, hinterfragt dein Team deine Entscheidungen \nSie wollen den Grund dafür wissen, warum du dich für Leipzig entschieden hast");
                    game.showstrich();
                    System.out.println("Option 1: Du antwortest ihnen nicht");
                    System.out.println("Option 2: Du legst ihnen deine Gründe dar");
                    game.showstrich();
                    String antwort = in.nextLine();
                    if (antwort.equals("1")) {
                        System.out.println("Da du ihnen nicht geantwortet hast sind sie sauer auf dich \nSie wollen unbedingt Antworten, immerhin ist einer von euch gestorben");
                        System.out.println("Da sie alle an dir zweifeln, wirst du immer mehr aus deinem Team ausgeschlossen");
                        game.spieler1.karmapunkte = game.spieler1.karmapunkte - 10;
                        game.showstrich();
                        System.out.println("Deine Karmapunkte:" + game.spieler1.karmapunkte);
                        game.showstrich();
                        System.out.println("Du fährst mir der Planung deiner nächsten Mission fort, bei dieser wird dich niemand unterstützen");
                        karma1=1;
                    }
                    else if (antwort.equals("2")) {
                        System.out.println("Deine Teamkameraden werfen dir vor, dass du an dem Tod eures Mannes Schuld bist \nDu sagst ihnen, dass du nicht wolltest, dass es so weit kommt. \nDes Weiteren entschuldigst du dich dafür, wie du dich entschieden hat und zeigst Reue");
                        System.out.println("Du begründest dein Verhalten damit, dass du in Osnabrück keine Aussichten auf Erfolg gesehen hast und das es strategisch so gut wie nichts gebracht hätte \nDeine Teammitglieder verstehen dich und verzeihen dir");
                        game.spieler1.karmapunkte = game.spieler1.karmapunkte + 10;
                        game.showstrich();
                        System.out.println("Deine Karmapunkte:" + game.spieler1.karmapunkte);
                        game.showstrich();
                        System.out.println("Ihr fahrt mit der Planung eurer nächsten Mission fort");
                        karma1=1;
                    }
                    else {
                        game.showfalsecommand();
                    }
                    }
                    
                }
              
                



                
                //Nächste Mission (Bremen / Berlin)

                game.showstrich();
                System.out.println("Du kannst dich zwischen zwei verschiedenen Zwischenstützpunkten entscheiden.");
                System.out.println("");
                System.out.println("1. Der Zwischenstützpunkt in Bremen.");
                System.out.println("Dieser Zwischenstützpunkt ist verantwortlich für die Nahrungsversorgung und ist schwerer anzugreifen, da er von vielen Wachen beschützt wird");
                System.out.println("");
                System.out.println ("2. Der Zwischenstützpunkt in Berlin.");
                System.out.println("Dieser Zwischenstützpunkt ist ein Drogenlabor, wo mit sie Geld machen. Er ist etwas leichter anzugreifen, da dort weniger Wachen stehen. \n " +
                                   "Trotzdem ist ein sehr schwieriges Ziel.");
               

                int zsp = 0; //int zwischenstützpunkt für while schleife
                while (zsp < 1) {

                    System.out.println("");
                    System.out.println("Schreibe --1-- um dich für Bremen zu entscheiden.");
                    System.out.println("Schreibe --2-- um dich für Berlin zu entscheiden.");
                    game.showstrich();

                    String zwischenstützpunkt = in.nextLine();

                    //Abfrage der verschiedenen Möglichkeiten 

                    // Story Bremen Anfang
                    if (zwischenstützpunkt.equals("1")) { 

                        game.showstrich();
                        System.out.println("Du greifst mit" + team.teammitglieder + "Bremen an");


                            //Zwischenstützpunkt Story bei -30 Karmapunkten Anfang
                            if (game.spieler1.karmapunkte == -30) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                System.out.println("Nach der Mission bringt dich dein Team um, da sie dir nicht mehr vertrauen.");
                                System.out.println("Du bist Gestorben");
                                game.showstrich();

                                System.exit(0);
                            }//Zwischenstützpunkt Story bei -30 Karmapunkten ende



                                //Zwischenstützpunkt Story bei -20 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == -20) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Ihr greift den Stützpunkt in Bremen an, startet aber bereits mit einem schlechten Gefühl. \nVermutlich, weil ihr euch nicht voll und ganz vertrauen könnt nach allem was passiert ist.");
                                System.out.println("");
                                System.out.println("Das schlimmst mögliche Szenario tritt ein: \nIhr geratet in einen unerwarteten Kampf und wisst euch nicht zu helfen \nDer Kampf endet mit dem Tod all deiner Teammitglieder");
                                game.showstrich();
                                System.out.println("Du fährst mir der Planung deiner nächsten Mission fort, bei dieser wird dich niemand unterstützen");
                                zsp++;
                            }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                                //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == -10) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Der Angriff verläuft gut, doch nicht jeder von euch hat es überstanden");
                                System.out.println("Vier deiner Kameraden, die von rechts angriffen, wurden frühzeitig bemerkt und erschossen.");
                                System.out.println("Dein Team spricht dich zwar nicht explizit darauf an, doch sie sind extrem sauer auf dich.");
                                game.showstrich();
                                game.spieler1.karmapunkte = -30;
                                zsp++;
                            }//Zwischenstützpunkt Story bei -10 Karmapunkten ende



                             //Zwischenstützpunkt Story bei 0 Karmapunkten Anfang 
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Der Angriff auf Bremen verläuft perfekt. \nIhr wart in der Lage jeden Gegner auszuschalten und den Stützpunkt zu erobern \nDas Wichtigste ist jedoch, dass ihr dabei keinen einzigen Mann verloren habt \nDie Operation war ein voller Erfolg");
                                zsp++;
                            }//Zwischenstützpunkt Story bei 0 Karmapunkten ende



                            //Zwischenstützpunkt Story bei +10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == 10) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();

                                System.out.println("Der Truppleiter hinterfragt während deiner Mission deine Authorität");
                                System.out.println("Du kannst dich entscheiden, ob du ihn umbringst oder ob du eine Gespräch mit ihm führst.");
                                game.showstrich();

                                int b = 0; 

                                while (b < 0) {

                                    String input = in.nextLine();

                                    System.out.println("\n Wenn du --1-- schreibst, dann bringtst du den Truppleiter um.");
                                    System.out.println("\n Wenn du --2-- schreibst, dann führt ihr beide ein klärendes Gespräch");
                                    game.showstrich();

                                    if (input.equals("1")) {

                                        System.out.println("Du bringst deinen Truppleiter um \nWie dir im selben Moment wird, wird dein Team dich dafür hassen... ");
                                        game.spieler1.karmapunkte = -40;
                                        zsp++;

                                    }

                                    else if (input.equals("2")) {
                                        
                                        System.out.println("Du versuchst ganz offen mit ihm zu reden und erklärst ihm deine Sichtweise. \nAußerdem sagst du ihm ganz eindeutig, dass jede Entscheidung die du je getroffen hast nur zum Wohle des Teams war");
                                        System.out.println("Er sieht es ein und sichert dir seine uneingeschränkte Loyalität zu");
                                        game.spieler1.karmapunkte = 20;
                                        zsp++;
                                    }

                                    else {
                                        game.showfalsecommand();
                                    }

                                }

                            }//Zwischenstützpunkt Story bei +10 Karmapunkten ende

                        
                        }//Story Bremen ende

                    // Story Berlin Anfang
                    else if (zwischenstützpunkt.equals("2")) {

                        game.showstrich();
                        System.out.println("Du greifst mit" + team.teammitglieder + "Berlin an");
                        game.showstrich();


                            //Zwischenstützpunkt Story bei -30 Karmapunkten Anfang
                             if (game.spieler1.karmapunkte == -30) {

                                game.showstrich();
                                System.out.println("Du glaubst, dass du eine gute Entscheidung triffst, indem du dich für die sichere Variante entscheidest, \ndoch nach allem was ihr deinetwegen durchgemacht habt, hassen dich deine Teammitglieder.");
                                System.out.println("Ihr seid gerade auf dem Weg nach Berlin. \nDu willst dich umdrehen und deine Leute nach ihrem Gefühl bezüglich der Operation fragen \nDoch alles was du siehst, ist eine Pistole, die gegen dich gerichtet ist...");
                                game.showstrich();
                                System.out.println("Noch auf dem Hinweg bringen deine Leute dich um");
                                game.showstrich();
                                System.exit(0);
                            }//Zwischenstützpunkt Story bei -30 Karmapunkten ende



                            //Zwischenstützpunkt Story bei -20 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == -20) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Die Mission selber läuft gut, doch nach der Mission bemerkst du komische Spannungen deiner Teammitglieder gegenüber dir.");
                                System.out.println("Du weißt nicht, ob du ihnen noch vertrauen kannst...");
                                game.showstrich();
                                System.out.println("Du kannst dich entscheiden ob du die Mission alleine weiterführst oder ob du doch mit ihnen mitgehst");
                                game.showstrich();

                                int b = 0;

                                while (b < 1) {

                                    game.showstrich();
                                    System.out.println("Schreibe --1-- um mit deinen Team mitzugehen");
                                    System.out.println("Schreibe --2-- um die Mission alleine auszuführen.");
                                    game.showstrich();

                                    String input = in.nextLine();

                                    if (input.equals("1")) {

                                        System.out.println("Du gehst mit deinem Team mit, doch wie du es dir schon gedacht hattest, vertrauen sie dir nicht mehr.");
                                        System.out.println("Sie bringen dich um"); 
                                        System.exit(0);
                                    }
                                    
                                    else if (input.equals("2")) {

                                        System.out.println("Du führst die restliche Mission alleine aus");
                                        System.out.println("Du bist nun allerdings dazu gezwungen, deine letzte Mission alleine durchzuführen");
                                        game.showstrich();
                                        zsp++;
                                    }

                                    else {
                                        game.showfalsecommand();
                                    }
                                } 

                            }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                            //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == -10) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Die Mission verläuft perfekt");
                                System.out.println("Ihr wart in der Lage den Stützpunkt einzunehmen und die Gegner zu überwältigen, \naußerdem ist keiner von euch gestorben oder verletzt worden.");
                                game.showstrich();
                                System.out.println("Da du dein Team zu diesem Sieg geführt hast, vertrauen sie dir nun wieder \nund ihr seid bereit für die nächste Mission.");
                                game.showstrich();
                                game.spieler1.karmapunkte = 10;
                                zsp++;
                            }//Zwischenstützpunkt Story bei -10 Karmapunkten ende



                            //Zwischenstützpunkt Story bei 0 Karmapunkten Anfang 
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Der Angriff auf Berlin verläuft perfekt. \nIhr wart in der Lage jeden Gegner auszuschalten und den Stützpunkt zu erobern \nDas Wichtigste ist jedoch, dass ihr dabei keinen einzigen Mann verloren habt \nDie Operation war ein voller Erfolg");
                                zsp++;
                            }//Zwischenstützpunkt Story bei 0 Karmapunkten ende



                            //Zwischenstützpunkt Story bei +10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == 10) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();

                                System.out.println("Der Truppleiter hinterfragt während deiner Mission deine Authorität");
                                System.out.println("Du kannst dich entscheiden, ob du ihn umbringst oder ob du eine Gespräch mit ihm führst.");
                                game.showstrich();

                                int b = 0; 

                                while (b < 0) {

                                    String input = in.nextLine();

                                    System.out.println("\n Wenn du --1-- schreibst, dann bringtst du den Truppleiter um.");
                                    System.out.println("\n Wenn du --2-- schreibst, dann führt ihr beide ein klärendes gespräch");
                                    game.showstrich();

                                    if (input.equals("1")) {

                                        System.out.println("Du bringst deinen Truppleiter um \nWie dir im selben Moment wird, wird dein Team dich dafür hassen... ");
                                        game.spieler1.karmapunkte = -40;
                                        zsp++;
                                    }

                                    else if (input.equals("2")) {
                                        
                                        System.out.println("Du versuchst ganz offen mit ihm zu reden und erklärst ihm deine Sichtweise. \nAußerdem sagst du ihm ganz eindeutig, dass jede Entscheidung die du je getroffen hast nur zum Wohle des Teams war");
                                        System.out.println("Er sieht es ein und sichert dir seine uneingeschränkte Loyalität zu");
                                        game.spieler1.karmapunkte = 20;
                                        zsp++;
                                    }

                                    else {
                                        game.showfalsecommand();
                                    }

                                }
                                
                            }//Zwischenstützpunkt Story bei 10 Karmapunkten ende

                    }//Story Berlin ende


                        //bei Falscher eingabe der Zielortentscheidung
                        else {
                            game.showfalsecommand();
                            continue;
                        }
                    

                }//Zwischenstüztpunkt



                //Start der letzten Mission
                game.showstrich();
                System.out.println("Du und dein Team greifen Hamburg vom Haven aus an. Ihr fahrt auf leisen, elektrischen Schnellbooten, unbemerkt in den Haven.");
                System.out.println("Dadurch habt ihr den Überraschungsmoment auf eurer Seite, allerdings habt ihr nicht viel Schutz auf den Booten.");
                game.showstrich();

                // Karmaabfrage
                if(game.spieler1.karmapunkte == -20) { //Karmapunkte sind -20
                   
                    game.showstrich();
                    System.out.println("Du bist dabei die Mission zu planen und merkst wie schwer es wird. Du bekommst.");

                    int ae = 0;  // int für Loop für Entscheidung ob aufgeben

                    while (ae < 1) {

                        game.showstrich();
                        System.out.println("Du stehst vor der Entscheidung die Mission durchzuziehen, oder ob du aufgibst.");
                        System.out.println("Schreibe --1-- wenn du das Risiko eingehen willst.");
                        System.out.println("Schreibe --2-- wenn du aufgeben willst und ein normales Leben leben willst.");
                        game.showstrich();
                    
                        String entscheidung = in.nextLine();

                        if (entscheidung.equals("1")){

                            System.out.println("Du gehst das Risiko ein... und stirbst, beim Versuch den Anführer zu töten.");
                            System.exit(0);
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du gibst auf und lebst ein Leben. Allerdings hast du keine Rache für deine Familie bekommen.");
                           
                            ae++;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
                
                else if(game.spieler1.karmapunkte == -30) { //Karmapunkte sind -30

                    game.showstrich();
                    System.out.println("Dein Team ist stark demotiviert und eure Mitgliederzahl ist auch schon stark dezimiert.");
                    System.out.println("Ihr überlegt ob ihr weitermachen wollt, oder euch zurückzieht.");
                    
                    int zb = 0; //int für loop für es zu Ende bringen

                    while (zb < 1) {

                        game.showstrich();
                        System.out.println("Ihr habt Angst zu sterben.");
                        System.out.println("Du kannst dich entscheiden ob du das Risiko eingehen willst und die Mission zu ende bringen willst, oder das Team schützen  willst.");
                        System.out.println("Schreibe --1-- wenn du es zu Ende bringen willst.");
                        System.out.println("Schreibe --2-- wenn du die Mission abbrechen und dein Team schützen willst.");
                        game.showstrich();

                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Du willst die Mission zu Ende bringen. Ihr rafft euch zusammen und zieht es durch. Ihr schafft es und gewinnt.");
                            System.out.println("Allerdings habt ihr 2 weitere teammitglieder verloren.");
                            
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen. Ihr zieht euch zurück und führt ein normales Leben, allerdings konntest du deine Familie nicht rechnen.");
                          
                            zb++;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
            
                else if(game.spieler1.karmapunkte == 0) { //Karmapunkte sind 0

                    game.showstrich();
                    System.out.println("Der Teamleiter erzählt, dass du gelogen hast, und das Team verlangt eine Erklärung.");
                    
                    int zb = 0; // Int für den loop für die Enstscheidung

                    while (zb < 1){

                        game.showstrich();
                        System.out.println("Du kannst entscheiden ob du dem Team eine Erklärung gibst und hoffst, dass sie dir verzeihen.");
                        System.out.println("Schreibe --1-- wenn du eine Erklärung geben willst.");
                        System.out.println("Schreibe --2-- wenn du nichts erklären willst.");
                        game.showstrich();

                        String entscheidung = in.nextLine();

                        if (entscheidung.equals("1")){

                            System.out.println("Du erklärst dem Team, dass du sie nur angelogen hast, um ans Ziel zu kommen und entschuldigst dich.");
                            System.out.println("Das Team verzeiht dir. Ihr zieht die Mission durch und gewinnt.");
                          
                            System.exit(0);
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du erklärst nichts.");
                            System.out.println("Das Team verzeiht dir nicht, misstraut dir, und lässt dich in Stich.");

                            int zb2 = 0; // int für die verschachtelte while Schleife
                             
                            while (zb2 < 1){

                                game.showstrich();
                                System.out.println("Du kannst dich entscheiden ob du die Mission alleine versuchst.");
                                System.out.println("Schreibe --1-- wenn du die Mission alleine versuchen willst.");
                                System.out.println("Schreibe --2-- wenn du aufgeben willst.");
                                game.showstrich();

                                String entscheidung2 = in.nextLine();
    
                                if (entscheidung2.equals("1")){

                                    System.out.println("Du gehst das Risiko ein, probierst es, schaffst es allerdings nicht und stirbst.");
                                    System.exit(0);
                                }

                                else if (entscheidung2.equals("2")){

                                    System.out.println("Du gehst das Risiko nicht ein und ziehst dich zurück.");
                                    System.out.println("Du lebst ein normales Leben, allerdings konntest du deine Familie nicht rächen.");
                                    
                                    zb2++;
                                }

                                else {

                                    game.showfalsecommand();
                                    continue;
                                }
                            }
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
                
                else if(game.spieler1.karmapunkte == 20) { //Karmapunkte sind +20

                    game.showstrich();
                    System.out.println("Die Probleme sind geklärt und du hast die volle unterstützung deines Teams.");
                    System.out.println("Während des Angriffs geratet ihr in einen Hinterhalt.");

                    int zb = 0; //Int für den loop für die Entscheidung

                    while (zb < 1){

                        game.showstrich();
                        System.out.println("Du stehst vor der Entscheidung ob du dich selbst oder dein Team retten willst.");
                        System.out.println("Schreibe --1-- um dein Team zu retten.");
                        System.out.println("Schreibe --2-- um dich selbst zu retten.");
                        game.showstrich();
                    
                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Du rettest dein Team, allerdings wirst du bei der Aktion getroffen und verblutest während des weiteren Verlauf der Mission.");
                            System.out.println("Dein Team bringt um dich zu ehren die Mission zu Ende, deine Familie wurde gerecht.");
            
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du rettest dich selbst und lässt dei Team sterben.");
                            System.out.println("Du versuchst die Mission zuende zu bringen, aber versagst und stirbst.");
                            System.exit(0);
                        }
                    }
                }

                else if(game.spieler1.karmapunkte == -40) { //Karmapunkte sind -40

                    game.showstrich();
                    System.out.println("Das Team ist sauer auf dich und misstraut dir.");
                    System.out.println("Du vertraust dein Team auch nicht mehr und bekommst ein komisches Gefühl.");

                    int zb = 0; // Int für den loop für die Entscheidung

                    while (zb < 1){
                
                        game.showstrich();
                        System.out.println("Du hast die Wahl, ob du mit deinem Team gehst, oder sie verlässt und die Mission alleine durchziehst.");
                        System.out.println("Schreibe --1-- wenn du mit deinem Team mitgehen möchetst.");
                        System.out.println("Schreibe --2-- wenn du dein Team verlassen willst und den Angriff alleine versuchen willst.");
                        game.showstrich();

                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Dein Gefühl hat dich nciht getäuscht. Das Team erschießt dich auf dem Schnellboot und lässt deine Leiche ins Wasser fallen.");
                            System.exit(0);
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du zeihst die Mission alleine durch. Dadurch das du alleine bist, kannst du dich bis zum Führer durchschleichen und ihn exekutieren.");
                            zb++;
                        }
                    }
                }

                else if(game.spieler1.karmapunkte == -10){

                    game.showstrich();
                    System.out.println("Dein Team ist stark motiviert.");
                    System.out.println("Während des Angriffs geratet ihr in einen Hinterhalt.");

                    int zb = 0; //Int für den loop für die Entscheidung

                    while (zb < 1){

                        game.showstrich();
                        System.out.println("Du stehst vor der Entscheidung ob du dich selbst oder dein Team retten willst.");
                        System.out.println("Schreibe --1-- um dein Team zu retten.");
                        System.out.println("Schreibe --2-- um dich selbst zu retten.");
                        game.showstrich();
                    
                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Du rettest dein Team, allerdings wirst du bei der Aktion getroffen und verblutest während des weiteren Verlauf der Mission.");
                            System.out.println("Dein Team bringt um dich zu ehren die Mission zu Ende, deine Familie wurde gerecht.");
                            
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du rettest dich selbst und lässt dei Team sterben.");
                            System.out.println("Du versuchst die Mission zuende zu bringen, aber versagst und stirbst.");
                            System.exit(0);
                        }
                    }
                }


            } // Story Ende Bravo-6 











            // Story Delta-5 falls dafür Entschieden 
            else if (team.teamname.equals ("Delta-5")){

                team.teammitglieder = "Tina, Charlkotte, Peter, Vlad, Dimitri, Achmed, Klaus und Hanz";
                team.advantage = "taktisch und fokussiert";
                team.disadvantage = "längere Planung und Entscheidung (Liebe oder Ziele)";

                    game.showstrich();
                    System.out.println("Du hast das Team Delta-5 gewählt.");
                    game.showstrich();

                // int m für den loop für die andvantages usw
                int ad = 0;

                while(ad < 1){

                    game.showstrich();
                    System.out.println("Zuerst lernst du das team kennen, falls dieses dich nicht interessiert, dann schreibe --weiter--");
                    System.out.println("schreibe --teammitglieder-- um die Namen deines Teammitglieder zu sehen");
                    System.out.println("schreibe --advantage-- um die Vorteile dieses Teams zu sehen");
                    System.out.println("schreibe --disadvantage-- um die Nachteile dieses Teams zu sehen");
                    game.showstrich();
                
                    // Abfrage nach advantages, disadvantages, Teammitglieder
                    String inputteam = in.nextLine(); 
                
                    if (inputteam.equals("teammitglieder")){
                        System.out.println(team.teammitglieder);
                        continue;
                    }
    
                    else if (inputteam.equals("advantage")){
                        System.out.println(team.advantage);
                        continue;
                    }
    
                    else if (inputteam.equals("disadvantage")){
                        System.out.println(team.disadvantage);
                        continue;
                    }
    
                    else if (inputteam.equals("weiter")){
                        ad++;  
                    }
                    else {
                        game.showfalsecommand();
                        continue;
                    }
                }
                
                game.showstrich();  
                System.out.println("Jens:"+ "\t" + "Wir müssen bei der nächsten Mission gut planen, was wir angreifen um einen strategischen Vorteil zu erlangen. \n"+
                                   "Klaus:"+ "\t"+ "Wir wäre es denn mit der Satellitenbasis in Leipzig? \n" + 
                                   "Charlotte:"+ "\t" + "Sie ist zwat sehr gut bewacht, aber damit schädigen wir ihr Kommunikationssystem.\n" +
                                    game.spieler1.name + ":\t" + "Ich finde es besser wenn wir nicht so viel Risiko eingehen und das Munitionslager in Osnabrück angreifen \n" +
                                    "Jens:" + "\t Ja, aber damit haben wir nicht so einen strategischen Vorteil. \n" +
                                    "Tina:" + "\t Ich bin auch der Meinung von" + " " + game.spieler1.name + ".\n" +
                                    game.spieler1.name + ":\t" + "Dort haben wir einer geringere chance zu verlieren.\n" +
                                    "Jens:" + "\t Wir benötigen diesen Vorteil! Sonst wird das nie was.\n" +
                                    "Tina:" + "\t"   + game.spieler1.name + " " + "Was ist deine Entscheidung?\n"
                                    ); // Diskussion mit dem Team, was man angreift 
                game.showstrich();  

                // ao = Angriffsortabfrage  für  Delta 5   
                int aoa = 0;
                while (aoa < 1) {

                    game.showstrich(); 
                    System.out.println("Du kannst dich nun zwischen 2 verschiedenen Orten entscheiden, die du angreifen möchtest.");
                    game.showstrich();
                    System.out.println("Die erste möglichkeit währe die Satellittenbasis nähe Leipzig, welches schwerer, dafür strategisch wichtig wäre einzunehmen.");
                    System.out.println("\t" + "Schreibe --1-- um diesen Angriff zu starten.");   
                    System.out.println("");  
                    System.out.println("Die zweite Möglichkeit ist das Munitionslager nähe Osnabrück, welches leichter, dafür weniger strategisch wichtig wäre einzunehmen.");
                    System.out.println("\t"+ "Schreibe --2-- um diesen Angriff zu starten.");        
                    game.showstrich(); 

                    // Abfrage für den Angriffsort von Delta 5
                    String angriffsort = in.nextLine();

                    // Falls eingabe 1: (Leipzig) 
                    if (angriffsort.equals("1")) {

                        game.spieler1.karmapunkte = -10; // Karmapunkte werden auf -10 gesetzt 
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden, die Satellitenbasis in der nähe von Leipzig anzugreifen.");
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte); 
                        game.showstrich(); 
                        System.out.println("In der Nacht bevor du und dein Team Die Satellitenbasis angreift, trifst du noch Tina, die in deiner Hütte wartet.\n" +
                                            "Tina:" +"\t" + "Na, was bringt dich eigentlich hier zu uns? \n" +
                                            game.spieler1.name + ": \t Ach, in der letzten Zeit ist alles schief gelaufen. Ich wusste einfach nichtmehr was ich noch tun kann. \n" +
                                            "Tina: \t Ja. Diese Welt ist echt schrecklich wie sie momentan ist.\n" +
                                            "\n "+
                                            "Für eine kurze Zeit herscht Stille in dem Zelt. Du selber weißt nicht, was du sagen willst. Du guckst ihr für \n" +
                                            "einige Sekunden an und bemerkst, dass sie dich auch zurück anschaut. Nach einer kurzen Zeit steht sie wieder auf. \n" + 
                                            "\n" +
                                            "Tina: \t So, Ich sollte auch so langsam mal schlafen gehen. Morgen wird ein langer und anstrengender Tag. Ciao. \n" +
                                            game.spieler1.name + ":\t Tschüss. Angenehme Nacht noch."
                        );
                        game.showstrich();

                            
                        System.out.println("Story: \n" + "\n" +
                                            "Am nächsten Morgen seit auf den Weg die Satellitenbasis anzugreifen. während des Angriffes bemerkst du und ein paar Teammitglieder,\n" +
                                            "dass dein Truppführer in schwierigkeiten gerät.");
                        System.out.println(game.spieler1.name + "\t" + ": Dort hinter der Ecke sind Gegner! Ich gib euch rückendeckung! \n" + 
                                            "Petr:" + "\t" + "Geht es dir gut Jens? \n" +
                                            "Jens:" + "\t" + "Ja nur ich stecke hier in ein paar kleinen Schwierigkeiten. Diese Typen halten mich hier in Schach. \n"+
                                            "Du siehst dich um und hörst aus verschieden Richtungen Schüsse. Daraufhin wirftst du dich auf den Boden.\n" +
                                            "In der Zwischenzeit haben sich deine Teammitglieder zu Jens vorgekämpft.\n" + 
                                             game.spieler1.name + ":\t" + "Ich komme auch zu euch um euch zu helfen!\n" +
                                            "Als ihr versucht euren Truppleiter aus der Situation herauszu bekommen, wird ihm in den Rücken geschossen." +
                                            "Jens:" + "\t" + "Scheiße! Ich bin verwundet." + 
                                            "Vlad:"  + "\t" + "Komm wir bringen dich heraus" +
                                            "Du und dein Team schafft es die restlichen Gegner in der Satellitenbasis auszuschalten. Der Truppleiter ist zwar Kampfunfähig, \n" +
                                            "aber er ist sonst Ok.");
                        aoa++;
                    }
                    // Falls eingabe 2: (Osnabrück)
                    else if (angriffsort.equals("2")) {

                        game.spieler1.karmapunkte = 10; // Karmapunkte werden auf 10 gesetzt.
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden das Munitionslager in der nähe von Osnabrück anzugreifen."); 
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte);
                        game.showstrich();
                        System.out.println("In der Nacht bevor du und dein Team das Munitionslager angreift, trifst du noch Tina, die in deiner Hütte wartet.\n" +
                                            "Tina:" +"\t" + "Na, was bringt dich eigentlich hier zu uns? \n" +
                                            game.spieler1.name + ": \t Ach, in der letzten Zeit ist alles schief gelaufen. Ich wusste einfach nichtmehr was ich noch tun kann. \n" +
                                            "Tina: \t Ja. Diese Welt ist echt schrecklich wie sie momentan ist.\n" +
                                            "\n" +
                                            "Für eine kurze Zeit herscht Stille in dem Zelt. Du selber weißt nicht, was du sagen willst. Du guckst ihr für \n" +
                                            "einige Sekunden an und bemerkst, dass sie dich auch zurück anschaut. Nach einer kurzen Zeit steht sie wieder auf. \n" + 
                                            "\n"+
                                            "Tina: \t So, Ich sollte auch so langsam mal schlafen gehen. Morgen wird ein langer und anstrengender Tag. Ciao. \n" +
                                            game.spieler1.name + ":\t Tschüss. Angenehme Nacht noch."
                        );
                        game.showstrich(); 

                        System.out.println("Als ihr beim Munitonslager angekommen seit bemerkt ihr, dass dieses nicht sehr gut bewacht ist\n"+
                                            "\n" +
                                            "Achmed: \t Hier ist ja nichts los. Vallah das wird einfach.\n" +
                                            "Charlotte: \t Ja komm wir legen die um und dann habe wir das einfach eingenommen\n" +
                                            game.spieler1.name + ": \t Ich habs euch ja gesagt, dass das einfach wird.\n"+
                                            "Jens: \t Ja aber dafür haben wir einen weniger strategischen Vorteil.\n"+
                                            "\n" +
                                            "Dein Team schaltet alle Gegner aus und übernehmen das ganze Munitionslager.\n"+ 
                                            "\n" +
                                            "Tina: \t Boss wir sind echt froh, dass wir doch hier hingegangen sind. Wer weiß was alles hätte in Leipzig passieren können.\n" +
                                            "\n" +
                                            "Du und dein sind sehr Froh und ihr feiert den restlichen Abend."    );
                        aoa++;
                    }

                    else {

                        game.showfalsecommand();
                        continue;
                    }
                }// Story ende Osnabrück

                // Wenn Leipzig gewählt wurde
                if (game.spieler1.karmapunkte == -10) {

                    game.showstrich(); 
                    System.out.println("Das Team ist sauer auf dich, weil sie lieber Osnabrück angreifen wollten.\n" + 
                                        "Achmed:  \t Schau dir das doch mal an, was du getan hast. Wegen deiner Entscheidung gehts es Jens richtig schlecht.\n Warum macht man so ne Scheiße!\n" +
                                        "Dimitri: \t Ist ernsthaft so.");
                    game.showstrich();

                    int he = 0; // int für entscheidung wie du handelst

                    while (he < 1){
                    System.out.println("Du kannst dich nun entscheiden wie du handelst.");  
                    System.out.println(""); 
                    game.showstrich(); 
                    System.out.println("\t" +"Schreibe --1-- um dich rauszureden"); // bessere Formulierung 
                    System.out.println("\t"+ "Schreibe --2-- um deaskalierend zu wirken. "); 
                    System.out.println("");
                    System.out.println("Wenn du --karmapunkte-- schreibst, siehst du deine Karmapunkte");  
                    System.out.println("Wenn du --hilfe-- schreibst, siehst du die hilfe ");
                    game.showstrich(); 

                    
                        
                        String handelsentscheidung = in.nextLine();

                        // wenn 1 ,dann karmapunkte = -20
                        if (handelsentscheidung.equals("1")) {

                            game.spieler1.karmapunkte = -20;
                            game.showstrich(); 
                            System.out.println(
                                game.spieler1.name + ":\t Es ist doch nicht meine Schuld, wenn Jens selber hier hin wollte. \n Dann muss er auch mal die Konsequenzen daraus ziehen." +
                                "Hanz:  \t Ja, aber du bist die Person die die Entscheidungen trifft.\n" +
                                game.spieler1.name + ":\t Es ist aber nicht meine Schuld!\n"
                            );
                            game.showstrich(); 
                            System.out.println("Dein Team ist sehr sauer auf dich, da du dich so schlech verhälst.");
                                            
                            break;
                        }
                        // wenn 2, dann Karmapunkte auf 0 wieder
                        else if (handelsentscheidung.equals("2")) { 

                            game.spieler1.karmapunkte = 0;
                            game.showstrich(); 
                            System.out.println(
                                game.spieler1.name + ":\t Ok Leute hört mal zu. Ich wusste von vornerein, dass es hier schwieriger sein wird.\n Deswegen nimm ich die Konsequenzen auf mich.\n" +
                                "Tina: \t Mehr als dich Entschuldigen kannst du ja nicht.\n" +
                                "Klaus: \t Es ist trotzdem sehr gut, dass du dich Entschuldigst. So bleibt die Teammoral bestehen.");
                            game.showstrich();
                            System.out.println("Wegen deiner Entscheidug, deeskalierend zu wirken, beruhigst du deine Teammitglieder");
                            game.showstrich();
                            break;
                        }

                        else if (handelsentscheidung.equals("karmapunkte")) {

                            game.spieler1.showkarmapunkte();
                            continue;
                        }
                        
                        else if (handelsentscheidung.equals("hilfe")) {

                            game.showhilfe();
                            continue;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }

                    // Falls die Karmapunkte auf -20 sind bei Delta 5 (Wenn du dich herrausredest)
                    if (game.spieler1.karmapunkte == -20) {

                        game.showstrich(); 
                        System.out.println("Achmed geht mit einem Messer auf dich los." + 
                            "Achmed: \t Wegen dir ist alles schlecht gelaufen! Du tauchst hier auf und tust auf Boss! \n Was denkst du eigentlich wer du bist!"
                        );
                        System.out.println(""); 

                        int aa = 0; // int aa = achmetangriff
                        while (aa < 1) {

                            System.out.println("Du kannst dich zwischen entscheiden wie du gegen ihn handelst.");
                            System.out.println(""); 
                            System.out.println("\t"+ "Wenn du --1-- schreibst, dann verteidigst du dich"); 
                            System.out.println("\t"+ "Wenn du --2-- schreibst, dann machst du nichts");
                            System.out.println("\t" + "Wenn du --3-- schreibst, dann bringst du Achmet um.");  
                            game.showstrich(); 

                            String achmetentscheidung = in.nextLine();

                            // Wenn du dich verteidigst
                            if (achmetentscheidung.equals("1")) {

                                System.out.println(
                                    game.spieler1.name + ":\t Achmed beruhig dich. Ich hab dir nichts getan.\n" +
                                    "Achmed: \t Doch! Du wirst uns noch in den Tod reiten wenn du so weiter machst. \n " +
                                    "Du versucht ihn sein Messer aus der Hand zu schlagen. \n Dir gelingt dieses und du bringst ihn zu Boden.\n Nach ein Paar Minuten hat er sich wieder beruhigt.\n" +
                                    "Achmed: \t Ich hätte das nicht tun sollen.\n" +
                                    game.spieler1.name + ": \t Alles gut. Jeder hat mal seine kurzen Phasen, wo er agressive wird. \n" +
                                    "In dem Moment bemerkst du wie Jens in seinen Rollstuhl zu euch kommt. \n" +
                                    "Jens: \t Was ist hier denn los! Da liegt man einmal auf dem Krankenbett um sich zu entspannen. \n Warum liegt hier ein Messer?"+
                                    "Charlotte: \t Achmed hat" + game.spieler1.name + "mit dem Messer angegriffen. \n Er hat sich aber wieder beruhigt. \n" +
                                    "Jens: \t Warum macht man sowas. Sowas möchte ich nicht nochmal mit erleben. \n Später bringt ihr euch alle noch gegenseitig um."
                                );
                                game.spieler1.karmapunkte = -10;
                                break;
                            }

                            // Wenn du nichts tust
                            else if (achmetentscheidung.equals("2")) {

                                System.out.print("Achmed greift dich an und trifft dich mit dem Messer.\n Dein Team kann dir nicht mehr helfen." +
                                    "Game over"
                                );
                                System.exit(0);
                            }

                            // Wenn du Ihn umnbringst
                            else if (achmetentscheidung.equals("3")) {

                                game.spieler1.karmapunkte = -40;
                                System.out.println("Als Achmed mit dem Messer auf dich losgeht zückst du deine Waffe.\n"+
                                    "Vlad: Nein!\n" +
                                    "Du betätigst den Abdruck und ein lauter Knall ertönt.\n"+
                                    "Achmed fällt auf den Boden und deine Teammitglieder rennen direkt zu ihm. \n" +
                                    "Hanz: \t Warum hast du das getan! \n"+
                                    "Du schaust dich um und dir wird auf einmal bewusst, dass du gerade einen Menschen umgebracht hast."
                                );
                                game.spieler1.showkarmapunkte();
                                break;
                            }

                            else {

                                game.showfalsecommand();
                                continue;
                            }
                        }
                    }
                }// Story für Leipzig ende

                /*
                Karmapunkte abfrage
                */
                int kpa = 0; // int Karmapunkte abfrage 

                while (kpa < 1) {

                    // Karmapunkte sind bei -40 
                    if (game.spieler1.karmapunkte == -40) {

                        game.showstrich(); 
                        System.out.println("Dein Team spricht mit dir über deine Entscheidungen");
                        game.showstrich(); 
                        System.out.println("Klaus: \t Warum mustest du einfach Achmed umbringen? \n" +
                                            "Peter: \t Wiese machst du so ne Scheiße! Hättest du dich einfach nicht verteidigen können? \n" + 
                                            "Für einen Moment schweigst du, weil du selber erstmal drauf klar kommen muss, was du gerade getan hast. \n" +
                                            "Vlad: \t Hast du noch was zu sagen?" 
                        );
                        game.showstrich();
                        
                        while (game.spieler1.karmapunkte == -40) {

                            System.out.println("Du kannst dich entscheiden ob du ihnen über deine Vergangenheit erzählst, dass dir die Mission sehr wichtig ist.");
                            System.out.println("Oder du schweigst, um die Mission nicht  zu gefährden.");
                            System.out.println("Schreibe --1-- um über deine Vergangenheit zu erzählen."); 
                            System.out.println("Schreibe --2-- um zu schweigen."); 
                            game.showstrich(); 

                            String inputkarma = in.nextLine(); // Inputkarma nur für das nächste If- Statement

                            if (inputkarma.equals("1")) {

                                game.spieler1.karmapunkte = -30;//Setz die Karmapunkte auf -30, für die Entscheidung (+10)
                                game.showstrich(); 
                                System.out.println("Erzählt die Geschichte: \n" +
                                                    game.spieler1.name + ": \t Ihr müsst wissen, dass mir die Mission echt sehr wichtig ist. \n" +
                                                    "Ihr müsst wissen, dass ich wegen dieses Krieges alles verloren habe. \n" + 
                                                    "Du atmest einmal kurz ein.\n" +
                                                    "\n"+
                                                    game.spieler1.name + ": \t Alles begann vor etwa 2 Jahren. Damals als der Krieg begann,\n" +
                                                    "saß ich mit meiner Familie zuhause. Auf einmal hörrte man sehr laute Geräusche. \n" +
                                                    "Ich sah nach draußen, und es war die Hölle los. Überall flogen Bomben in Häuser. \n" +
                                                    "Die Menschen rennten überall auf der Straße. Ich befahl meiner Fraun und meinen Zwei Kindern aus dem Haus zu flüchten.\n"+
                                                    "Das schaften wir auch, aber dann wurden wir von mehreren Soldaten aufgehalten. \n" +
                                                    "Sie befiehlten uns stehen zu bleiben, dass wir mit ihnen mitkommen als Gefangene. \n" +
                                                    "Aber ich Vollidiot wollte das nicht, und dann haben sie um sich geschossen. \n"+
                                                    "\n"+
                                                    "Dir kommen ein paar tränen \n" +
                                                    game.spieler1.name + ":\t Und dann haben sie meine Frau und meine Söhne erschossen.\n" +
                                                    "Daraufhin, habe ich meine Pistole gezückt, und alle Soldaten erschossen. \n" +
                                                    "Mir ist die Mission so wichtig, weil ich meine Familie rechen will! \n " +
                                                    "Tina: \t Ja, und wir werden dir dabei Helfen! \n" +
                                                    "Peter: \t Ja, wir werden sie alle für ihre Taten zahlen lassen!"
                                );
                                game.showstrich();
                                game.spieler1.showkarmapunkte();

                                
                            }

                            else if (inputkarma.equals("2")) { 
 
                                game.spieler1.karmapunkte = -50; //Setzt die Karmapunkte auf -50 (-10)
                                game.showstrich(); 
                                System.out.println("Du schweigst.\n" +
                                                    "Vlad: \t Alles Klar, dann hat sich das ja erledigt."
                                ); 
                                game.showstrich(); 
                                game.spieler1.showkarmapunkte();
                                game.showstrich();
                                
                            }

                            else {

                                game.showfalsecommand();
                                continue;
                            }
                        }  
                    }

                    // Karmapunkte sind bei -10
                    else if (game.spieler1.karmapunkte == -10) {

                        game.showstrich(); 
                        System.out.println("Dimitri: \t" + game.spieler1.name + " " +"Wäre es vermutlich nicht schlauer, wenn wir weniger Risikio eingehen würden?\n" +
                                            "Klaus: \t Ja, dann würde vielleicht nicht so etwas mit Jens nochmal passieren. \n"+
                                            "Wer weiß wie es beim nächsten mal ausgehen wird.\n " +
                                            "Nicht das noch einer daran stirbt."
                        ); 
                        game.showstrich(); 

                        // While looop
                        // Wenn Karmapunkte nicht mehr -10 hört er auf
                        while (game.spieler1.karmapunkte == -10) {

                            game.showstrich(); 
                            System.out.println("Dein Team bittet dich weniger Risiko einzugehen."); 
                            game.showstrich(); 
                            System.out.println("Schreibe --1-- um weniger Risiko einzugehen."); 
                            System.out.println("Schreibe --2-- um nicht darauf zu reagieren."); 
                            game.showstrich(); 

                            String inputkarma = in.nextLine(); // Inputkarma nur für das nächste If- Statement

                            if (inputkarma.equals("1")){

                                game.showstrich(); 
                                System.out.println("Du gehsts weniger Risiko ein"); 
                                game.showstrich(); 
                                game.spieler1.karmapunkte = 0;
                                game.spieler1.showkarmapunkte();
                            }
                            else if (inputkarma.equals("2")) {

                                game.showstrich(); 
                                System.out.println("Du reagierst darauf nicht\n"+
                                                    "Du gehst trotzdem mehr Risiko ein."
                                ); 
                                game.showstrich(); 
                                game.spieler1.karmapunkte = -20;
                                game.spieler1.showkarmapunkte();
                                game.showstrich();
                            }
                            else {

                                game.showfalsecommand();
                                continue;
                            }
                        }   
                    }

                    // Karmapunkte sind bei +10
                    else if (game.spieler1.karmapunkte == 10) {

                        game.showstrich(); 
                        System.out.println("Durch deine Entscheidungen Osnabrück anzugreifen, vetraut dir dein Team mehr\n"+
                                            "Dadurch förderst du auch die Teammoral."
                        ); 
                        game.showstrich(); 
                        System.out.println("Als du gerade in dem Munitionslager herum läufst, siehst du Jens.\n" +
                                            game.spieler1.name + ": \t Moin Jens!\n" +
                                            "Jens: \t Guten Tag" + " " + game.spieler1.name + " " + "Das war doch besser, \n" +
                                            "dass wir Osnabrück angegriffen haben.\n" +
                                            game.spieler1.name + ": \t Ja. Hier ist es wenigsten sehr einfach gewesen, das Lager einzunehmen.\n" +
                                            "Jens: \t Das Stimmt. Kann ich dich mal was fragen?\n" + 
                                            game.spieler1.name + ": \t Ja Natürlich. Du kannst mich alles fragen.\n" + 
                                            "Jens: \t Wieso machst du das eigentlich alles. Hat das einen bestimmten Grund?" 
                        
                        );
                        game.showstrich(); 
                        System.out.println("Du kannst dich entscheiden, ob du über deine Vorgeschichte redest oder nicht.");
                        game.showstrich(); 

                        // while loop 
                        int tr = 0; 

                        while (tr < 1) {

                            System.out.println("Schreib --1-- um seriös zu bleiben und ihm nicht die Wahrheit zu erzählen");
                            System.out.println("Schreibe --2-- um über deine Vorgeschichte zu berichten.");  
                            game.showstrich(); 

                            // Scanner
                            String inputkarma = in.nextLine(); // Inputkarma nur für das nächste If- Statement

                            if(inputkarma.equals("1")) {

                                game.showstrich(); 
                                System.out.println("Du bleibst seriös"); 
                                game.showstrich(); 
                                System.out.println(  game.spieler1.name + ": \t Nein. Ich mache das nur um mir die Zeit zu vertreiben. \n " +
                                                    "Jens: \t Oh....alles klar. Später treffen wir uns noch, um unseren nächstes Angriff zu planen.\n" +
                                                    game.spieler1.name + ": \t Ich werde da sein." 
                                
                                );
                                game.showstrich();
                                break;
                            }
                            else if(inputkarma.equals("2")){

                                game.showstrich(); 
                                System.out.println(game.spieler1.name + ": \t Ja, es gibt einen Grund.\n" +
                                                    "Jens:  \t Dürfte ich den wissen?" + 
                                                    game.spieler1.name + ": \t Natürlich. Es begann alles vor einem Jahr. Dann als der Krieg begann.\n"+ 
                                                    "Damals war ich mit meiner Frau und meinen Söhnen in unserem Haus.\n"+ 
                                                    "Auf einmal sah ich, wie Bomben abgewurfen wurden. Dann sind wir direkt aus unserem Haus gerannt.\n" +
                                                    "Die Menschen rennten überall auf der Straße.\n"+
                                                    "Als wir draußen waren, wurden wir von mehreren Soldaten aufgehalten. \n" +
                                                    "Sie befiehlten uns stehen zu bleiben, dass wir mit ihnen mitkommen als Gefangene. \n" +
                                                    "Aber ich wollte das nicht, und dann haben sie um sich geschossen, weil ich so ausgerastet bin. \n"+
                                                    "\n"+
                                                    "Dir kommen ein paar tränen \n" +
                                                    game.spieler1.name + ":\t Und dann haben sie meine Frau und meine Söhne erschossen.\n" +
                                                    "Daraufhin, habe ich meine Pistole gezückt, und alle Soldaten erschossen. \n" +
                                                    "Ich will einfach, dass dieser Dumme Krieg aufhört und auch noch meine Familie rächen!" 
                                ); 
                                game.showstrich(); 
                                break;
                            }
                            else {

                                game.showfalsecommand();
                                continue;
                            }
                        }
                        
                        game.showstrich(); 
                        System.out.println("Planung nächste Mission mit deinem Team."); 
                        game.showstrich(); 
                        System.out.println("Jens: \t Zu erst einmal, mir geht es den Umständen gut. \n" +
                                            "Wahrscheinlich aber werde ich euch nicht viel helfen können.\n" +
                                            "Charlotte: \t Alles gut Jens, wenn wir wieder angreifen, dann werden wir dafür sorgen, \n"+
                                            "dass dir nichts geschieht. \n" +
                                            "Jens: \t Das ist echt sehr Nett von euch allen.\n" +
                                            "Hanz: \t Was machen wir denn als nächstes? \n" +
                                            game.spieler1.name + ": \t Wir können uns wieder aussuchen, was wir angreifen.\n"+
                                            "Tina: \t Das gute ist, dass die Gegner jetzt geschwächt sind, da wir ihre Kommunikation gestört haben. \n"+
                                            "Dimitri: \t Welche Möglichkeiten stehen denn zur Auswahl? \n" +
                                            "Jens: \t Wir können entweder die Nahrungsversorgung in Bremen angreifen oder \n" +
                                            "die Drogenlabore in Berlin. Damit schädigen wir ihre Geld einkommen. \n" +
                                            game.spieler1.name + ": \t Wir müssen bedenken, dass Bremen schwerer anzugreifen ist als Berlin." +
                                            "Vlad: \t Stimmt. \n" +
                                            game.spieler1.name + ": \t  Wenn wir Bremen angreifen würden, dann würden wir mit einen Helikopter dort hinfliegen.\n" +
                                            "Klaus: \t Und wir würden wir die Drogenlabore angreifen?\n" +
                                            game.spieler1.name + ": \t Mit gepanzerten Fahrzeugen." +
                                            "Klaus: \t Ok.\t" +
                                            game.spieler1.name + ": \t Was meint ihr.\n" +
                                            "Achmed: \t Das entscheidest du und nicht wir. Wir haben vollstes vertrauen in dir \n"
                        );
                        game.showstrich();
                        break;
                    }

                    // Bei dieser Karmapunktenabfrage kommt es direkt zur Planung
                    // Karmapunkte sind bei 0
                    else if (game.spieler1.karmapunkte == 0) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission mit deinem Team."); 
                        game.showstrich(); 
                        System.out.println("Jens: \t Zu erst einmal, mir geht es den Umständen gut. \n" +
                                            "Wahrscheinlich aber werde ich euch nicht viel helfen können.\n" +
                                            "Charlotte: \t Alles gut Jens, wenn wir wieder angreifen, dann werden wir dafür sorgen, \n"+
                                            "dass dir nichts geschieht. \n" +
                                            "Jens: \t Das ist echt sehr Nett von euch allen.\n" +
                                            "Hanz: \t Was machen wir denn als nächstes? \n" +
                                            game.spieler1.name + ": \t Wir können uns wieder aussuchen, was wir angreifen.\n"+
                                            "Tina: \t Das gute ist, dass die Gegner jetzt geschwächt sind, da wir ihre Kommunikation gestört haben. \n"+
                                            "Dimitri: \t Welche Möglichkeiten stehen denn zur Auswahl? \n" +
                                            "Jens: \t Wir können entweder die Nahrungsversorgung in Bremen angreifen oder \n" +
                                            "die Drogenlabore in Berlin. Damit schädigen wir ihre Geld einkommen. \n" +
                                            game.spieler1.name + ": \t Wir müssen bedenken, dass Bremen schwerer anzugreifen ist als Berlin." +
                                            "Vlad: \t Stimmt. \n" +
                                            game.spieler1.name + ": \t  Wenn wir Bremen angreifen würden, dann würden wir mit einen Helikopter dort hinfliegen.\n" +
                                            "Klaus: \t Und wir würden wir die Drogenlabore angreifen?\n" +
                                            game.spieler1.name + ": \t Mit gepanzerten Fahrzeugen." +
                                            "Klaus: \t Ok.\t" +
                                            game.spieler1.name + ": \t Was meint ihr.\n" +
                                            "Achmed: \t Das entscheidest du und nicht wir. Wir haben vollstes vertrauen in dir \n"
                        );
                        game.showstrich();

                        break;
                    }

                    /* 
                    Karmapunkte sind bei -50 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte nicht zu erwähnen (Line  667-704)
                    */
                    else if (game.spieler1.karmapunkte == -50) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission alleine."); 
                        game.showstrich();  
                        break;  
                    }

                    /*
                    Karmapunkte sind bei -30 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte zu erwähnen (Line  667-704)
                    */
                    else if (game.spieler1.karmapunkte == -30) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission mit deinem Team."); 
                        game.showstrich(); 
                        System.out.println("Jens: \t Zu erst einmal, mir geht es den Umständen gut. \n" +
                                            "Wahrscheinlich aber werde ich euch nicht viel helfen können.\n" +
                                            "Charlotte: \t Alles gut Jens, wenn wir wieder angreifen, dann werden wir dafür sorgen, \n"+
                                            "dass dir nichts geschieht. \n" +
                                            "Jens: \t Das ist echt sehr Nett von euch allen.\n" +
                                            "Hanz: \t Was machen wir denn als nächstes? \n" +
                                            game.spieler1.name + ": \t Wir können uns wieder aussuchen, was wir angreifen.\n"+
                                            "Tina: \t Das gute ist, dass die Gegner jetzt geschwächt sind, da wir ihre Kommunikation gestört haben. \n"+
                                            "Dimitri: \t Welche Möglichkeiten stehen denn zur Auswahl? \n" +
                                            "Jens: \t Wir können entweder die Nahrungsversorgung in Bremen angreifen oder \n" +
                                            "die Drogenlabore in Berlin. Damit schädigen wir ihre Geld einkommen. \n" +
                                            game.spieler1.name + ": \t Wir müssen bedenken, dass Bremen schwerer anzugreifen ist als Berlin." +
                                            "Vlad: \t Stimmt. \n" +
                                            game.spieler1.name + ": \t  Wenn wir Bremen angreifen würden, dann würden wir mit einen Helikopter dort hinfliegen.\n" +
                                            "Klaus: \t Und wir würden wir die Drogenlabore angreifen?\n" +
                                            game.spieler1.name + ": \t Mit gepanzerten Fahrzeugen." +
                                            "Klaus: \t Ok.\t" +
                                            game.spieler1.name + ": \t Was meint ihr.\n" +
                                            "Achmed: \t Das entscheidest du und nicht wir.\n"
                        );
                        game.showstrich();
                        break;
                    }

                    /* 
                    Karmapunkte bei -20. Passiert da, wo man nicht auf den Vorschlag wegen des Risikos eingeht. 
                    Line (708- 744) 
                    */
                    else if(game.spieler1.karmapunkte == -20) {

                        game.showstrich(); 
                        System.out.println("Du planst die nächste Mission alleine."); 
                        game.showstrich(); 
                        break;  
                    }

                }// Karmapunkte Abfrage ende 

                // Ab Hier fängt die Planung der nächsten Mission statt.

                  //Nächste Mission (Bremen / Berlin)

                  game.showstrich();
                  System.out.println("Du kannst dich zwischen zwei verschiedenen Zwischenstützpunkten entscheiden.");
                  System.out.println("");
                  System.out.println("1. Der Zwischenstützpunkt in Bremen.");
                  System.out.println("Dieser Zwischenstützpunkt ist verantwortlich für die Nahrungsversorgung und ist schwerer anzugreifen, da er von vielen Wachen beschützt wird");
                  System.out.println("");
                  System.out.println ("2. Der Zwischenstützpunkt in Berlin.");
                  System.out.println("Dieser Zwischenstützpunkt ist ein Drogenlabor, wo mit sie Geld machen. Er ist etwas leichter anzugreifen, da dort weniger Wachen stehen. \n " +
                                     "Trotzdem ist ein sehr schwieriges Ziel.");


                    int zsp = 0; //int zwischenstützpunkt für while schleife
                    while (zsp < 1) {

                        System.out.println("");
                        System.out.println("Schreibe --1-- um dich für Bremen zu entscheiden.");
                        System.out.println("Schreibe --2-- um dich für Berlin zu entscheiden.");
                        game.showstrich();

                        String zwischenstützpunkt = in.nextLine();

                        //Abfrage der verschiedenen Möglichkeiten 

                        // Story Bremen Anfang
                        if (zwischenstützpunkt.equals("1")) { 
                        zsp = 1;
                        
                        game.showstrich();
                        System.out.println("Du greifst mit deinem Team Bremen an");
                        System.out.println("Dies wird ein Helikopterangriff");
                        System.out.println("Was als nächstes passieren wird, wird jedoch nicht von dir, sondern von deinen Karmapunkten \nbzw. deiner Beziehung zu deinem Team bestimmt");
                        
                        game.showstrich();
                        
                        if (game.spieler1.karmapunkte == -50) {
                            System.out.println("Auf den Hinweg nach Bremen, bemerkst du , wie deine Teammitglieder dich böse angucken. \n" +
                                                "Vlad: \t So wollen wir es hinter uns bringen? \n" +
                                                " \n" +
                                                "Du guckst verwundert, denn ihr seit noch nicht in Bremen. \n Daraufhin steht Vlad auf und geht auf dich zu.\n " + 
                                                "\n" +
                                                "Vlad: \t Ab hier endet deine Reise.\n" +
                                                "\n" +
                                                "Er hällt dich fest und zieht dich zur Tür. Hanz und Klaus helfen ihm dabei. \n"+
                                                "Danach werfen sie dich aus dem Helikopter."
                            );                    
                            game.showstrich();
                            System.out.println("Game Over");
                            System.exit(0);
                        }
                        else if (game.spieler1.karmapunkte == -30) {
                            System.out.println("Als ihr ankommt seht ihr, dass die Gegner nicht auf euren Angriff vorbereitet sind. \n" +
                                                "Durch ihre geschwächte Kommunikation, sind nur sehr wenige Soldaten dort positioniert.\n" +
                                                "Ihr steigt aus euren Helikopter aus. \n" +
                                                "\n" +
                                                game.spieler1.name + ": \t Kommt leute, wir nehmen die Soldaten nur hier fest. \n" +
                                                "Die hälfte des Teams geht ins Gebäude, und die andere folgt mir. \n"+
                                                "Dimitri: \t Alles klar Boss. Dann wollen wir mal.\n"
                            );
                            game.showstrich();
                            System.out.println("Durch eure gute Strategie nimmt ihr 10 Soldaten fest und übernimmt das Gebäude der Nahrungsversorgung.");
                            game.showstrich();
                            zsp++;
                            
                        }
                        else if (game.spieler1.karmapunkte == -20) {
                            System.out.println("Ihr geht mit viel Risiko in die Mission hinein \n" + 
                                                "Charlotte: \t komm wir werden das Schaffen. Wie sollen wir vorgehen" + " " + game.spieler1.name + "?" +
                                                game.spieler1.name + ": \t Ihr geht ins Hauptgebäude. Ich kümmere um die Soldaten draußen. " +
                                                " \n" +
                                                "Du überwältigtst alle Gegner draußen. Als du aber ins Gebäude rennst,\n" + 
                                                "siehst du wie dein ganzes Team in schwierigkeiten steckt. \n" 
                                                
                            
                            );
                            System.out.println("Dein Team ist gefangen genommen worden. \n"+
                                                "Du siehst, wie drei deiner Leuter einfach zu befreien sind, da sie nicht so gut bewacht werden."
                            );
                            System.out.println("Du kannst dich entscheiden: \n");

                            int bremen20 = 0;
                            while (bremen20 < 1) {
                                System.out.println("Schreibe --1-- um zu versuchen, dein ganzes Team zu retten.");
                                System.out.println("Schreibe --2-- um nur drei deiner Leute zu befreien.");

                                String bremen = in.nextLine();
                                if (bremen.equals("1")) {
                                
                                    System.out.println("Du hattest extremes Glück und konntest dein gesamtes Team befreien.");
                                    System.out.println("Ihr fahrt fort mit der Einnahme des Stützpunktes und plant von dort aus eure letze Mission.");
                                    game.spieler1.karmapunkte = game.spieler1.karmapunkte + 30;
                                    bremen20 = 1;
                                    zsp++;
                                

                                }
                                else if (bremen.equals("2")){
                                
                                System.out.println("Du schaffst es die Tina, Klaus und Vlad zu retten.");
                                System.out.println("Ihr übernehmt die Basis zu viert aber eure Kameraden überleben dies nicht.");
                                game.spieler1.karmapunkte = game.spieler1.karmapunkte + 10;
                                System.out.println("Trotz dessen fahrt ihr fort, indem ihr eure letzte Mission plant.");
                                bremen20 = 1;
                                zsp++;
                                
                                }
                                else {
                                    game.showfalsecommand();
                                }
                            }
                            

                        }
                        else if (game.spieler1.karmapunkte == 0) {
                            System.out.println("Die Übernahme verläuft reibungslos, jedoch wirst du von einem Soldaten, der sich versteckt hat aus einem Hinterhalt überfallen.");
                            System.out.println("Da dein Team dir jedoch vertraut, hilft es dir und erledigt den Feind.");
                            game.showstrich();
                            System.out.println("Damit wurde der Stützpunkt in Bremen erfolgreich übernommen.");
                            zsp++;
                        }
                        else if (game.spieler1.karmapunkte == 10) {

                        

                            System.out.println("Bei der Übernahme wird dein Teamleiter gefangen genommen \nWenn du ihn rettest könnte das gefährlich werden");
                            game.showstrich();

                            int bremengut = 0;
                            while (bremengut < 1) {//loop
                            System.out.println("Schreibe --1-- um ihn nicht zu retten. Ihr fahrt aber mit der Übernahme fort ");
                            System.out.println("Schreibe --2-- um deinen Truppleiter zu retten.");

                            int bremen10 = in.nextInt();
                                if (bremen10 == 1) {
                                    System.out.println("Als du versuchst, deinen Truppleiter zu befreien, bemerkst du wie ein Soldat um sich schießt. \n" +
                                                        "Du selber schaffst es aus der schlimmen Situation. Jens aber konnte es nicht mehr schaffen."
                                    
                                    );
                                    System.out.println("Trotz Allem denkt dein Team, dass du dich richtig entschieden hast");
                                    bremengut = 1;
                              
                                game.showstrich();
                                zsp++;

                                }
                                else if (bremen10 == 2){
                                    System.out.println("Du und dein Team versuchen den Teamleiter zu retten \nzu erst verläuft alles wie geplant, doch dann macht einer deiner Kameraden einen essenziellen Fehler");
                                    System.out.println("Durch diesen Fehler passiert es, dass der Feind auf euch aufmerksam wird. \nDu musst unter dem hohen Druck eine Entscheidung treffen und entscheidest dich dazu, dass dein Team die Mission fortsetzen soll");
                                    System.out.println("Dadurch seid ihr jedoch gezwungen euch zu opfern. \nIhr schafft es den Teamleiter zu retten, aber du seler stirbst dabei.");
                                    game.showstrich();
                                    System.out.println("Aus dank, führt dein Team die Mission weiter fohrt, um dir gerecht zu werden.");
                                    System.out.println("Game Over");
                                    bremengut = 1;
                                
                                    System.exit(0);
                                }
                                else {
                                    game.showfalsecommand();
                                }
                            }//While loop ende 
                            
                            
                        }
                        
                        } //Story Bremen ende



                        //Story Berlin Anfang
                        else if (zwischenstützpunkt.equals("2")) {

                            game.showstrich();
                            System.out.println("Du hast dich  entschiden mit deinem Team, das Drogenlabor in Berlin anzugreifen \n" +
                                                "Ihr fahrt mit gepanzerten Fahrzeugen dort hin.");
                            game.showstrich();

                            
                                //Story Berlin bei -50 Karmapunkten anfang
                                if (game.spieler1.karmapunkte == -50) {

                                    game.showstrich();
                                    System.out.println("Auf den hinweg fährt dein Team einen komplett anderen Weg als geplant.\n" +
                                                        "\n"+
                                                        game.spieler1.name + ": \t Hää. Wo fahrt ihr hin.\n" +
                                                        "Dimitri: \t Zu deinem Ende.\n" +
                                                        "\n" +
                                                        "Sie steigen alle aus den Wagen aus, und zerren dich dort heraus.\n" +
                                                        "\n"+
                                                        "Klaus:\t Weil wir dir nicht mehr vertrauen, wirst du hier bleiben und nirgendwo sonst mehr hingehen." +
                                                        "\n"+
                                                        "Sie ketten dich an einen Baum uns steigen wieder in die gapenzerten Fahrzeuge."

                                    );
                                    game.showstrich();
                                    System.out.println("Game over"); 
                                    System.exit(0);
                                    game.showstrich();


                                } //Story Berlin bei -50 Karmapunkten ende


                                //Story Berlin bei -30 Karmapunkten anfang
                                else if (game.spieler1.karmapunkte == -30) {
                                    
                                    System.out.println("Als ihr ankommt seht ihr, dass die Gegner nicht auf euren Angriff vorbereitet sind. \n" +
                                                        "Durch ihre geschwächte Kommunikation sind nur 5 Soldaten dort, die den Haupteingang bewachen..\n" +
                                                        "Ihr steigt aus euren Fahrzeugen aus. \n" +
                                                        "\n"+ 
                                                        "Klaus: \t Das wir ein heiden Spaß.\n"+
                                                        "\n"+
                                                        "Charlotte lenkt die Soldaten ab, und ihr kommt von den Seiten und nimmt sie alles fest.\n" +
                                                        "Dann öffnen sie für euch die Tür, und ihr übernimmt das komplette Drogenlabor."
                                                        
                                     );
                                    game.showstrich();
                                    System.out.println("");
                                    game.showstrich();
                                    zsp++;
                                    
                                    
                                } //Story Berlin bei -30 Karmapunkten ende 


                                //Story Berlin bei -20 Karmapunkten anfang 
                                else if (game.spieler1.karmapunkte ==-20) {
                                   
                                   game.showstrich();
                                   System.out.println("Story Angriff");
                                   game.showstrich();
                                   System.out.println("Während des Angriffes ist Hanz in großer gefahr. \n" +
                                                        "Er wird von mehren Personen in schach gehalten und kann von alleine nicht dort raus. \n"+ 
                                                        "Wenn du ihn rettest, dann geht dabei sehr viel Munition verloren und auch die gepanzerten fahrzeuge"); 

                                        //While loop für die Entscheidung ob du das Teammitglied rettest.
                                        int b = 0; 
                                        while (b < 1) {
                                            
                                            game.showstrich();
                                            System.out.println("Schreibe --1-- um ihn zu retten");
                                            System.out.println("Schreibe --2-- um ihn nicht zu retten");
                                            game.showstrich();
                                            
                                            String rettung = in.nextLine();

                                                if (rettung.equals("1")) {
                                                   
                                                    game.showstrich();
                                                    System.out.println("Du hast dich entschieden ihn zu retten");
                                                    game.showstrich();
                                                    System.out.println("Ihr versucht mit den gepanzerten Fahrzeugen, durch die Wand des Drogenlabors. \n"+
                                                                        "Dann schießt ihr alle um euch, so das sich die Gegner verstecken müssen.\n"+
                                                                        "Du rennst zu Hanz und rettest ihn aus der Situation.\n"+
                                                                        "In der Zeit haben es deine Teammitglieder geschaft, die Soldaten fest zu nehmen.\n"+
                                                                        "Ihr fahrt mit der Übernahme fort."
                                                    
                                                    );
                                                    game.showstrich();
                                                    game.spieler1.karmapunkte = -10;

                                                    zsp++;
                                                }
                                                 
                                                else if (rettung.equals("2")) {
                                                   
                                                    game.showstrich();
                                                    System.out.println("Du hast dich entschieden ihn nicht zu retten" +
                                                                        "Daraufhin, übernehmen du und dein Team das Drogenlabor. \n"+
                                                                        "Ihr findet später Hanz tot in seiner Zellle vor.\n"+
                                                                        "Am Abend trauert ihr um ihn."
                                                    );
                                                    game.showstrich();

                                                    zsp++;
                                                }
                                                
                                                else {
                                                    game.showfalsecommand();
                                                    continue;
                                                }

                                        }//while loop ende 

                                }//Story Berlin bei -20 Karmapunkten ende 
                                

                                //Story Berlin bei 0 Karmapunkten anfang
                                else if (game.spieler1.karmapunkte == 0) {
                                    
                                    game.showstrich();
                                    System.out.println("Als ihr ankommt haben du und dein Team eine sehr hohe Motivation.\n"+
                                                        "\n"+
                                                        "Hanz: \tDas wird doch ein Kinderspiel \n"+
                                                        "Charlotte: \t Ja, das wird es. \n"+
                                                        "\n"+
                                                        "Ihr übernehmt das ganze Drogenlabor mit links. \n"+
                                                        "Keiner von deinen Teammitglieder kommt in einer schwierige Situation und\n"+
                                                        "ihr freut euch über euren gelungenen Angriff."
                                    
                                    );
                                    game.showstrich();
                                    
                                    game.spieler1.karmapunkte = 20;
                                    zsp++;
                                }//Story Berlin bei 0 Karmapunkten ende

                                
                                //Story Berlin bei 10 Karmapunkten anfang
                                else if (game.spieler1.karmapunkte == 10) {

                                    game.showstrich();
                                    System.out.println("Tina gerät ihn aussichtslose schwierigkeiten \n" +
                                                        "Ohne irgendeine hilfe, wird sie aus der Situation nicht herrauskommen und sterben.\n"+
                                                        "Sei dir bewusst, dass es ein sehr hohes risiko gibt, dass du stirbst wenn du sie rettest.");
                                    game.showstrich();

                                    
                                        //while loop
                                        int b = 0;
                                        while (b < 1) {
                                            
                                            System.out.println("Schreibe --1-- um ihr zu helfen");
                                            System.out.println("Schreibe --2-- um ihr nicht zu helfen");

                                                String rettung = in.nextLine();
                                                
                                                //Entscheidung sie zu retten
                                                if (rettung.equals("1")) {

                                                    game.showstrich();
                                                    System.out.println("Du versuchtst sie zu retten. \n" +
                                                                        "Du schaffst es sie in Sicherheit zu bringen.\n" +
                                                                         "Als du aber versuchst zu ihr zu kommen, wird dir in den Bauch geschossen.\n"+
                                                                         "Du fällst zu Boden und das letzte was du siehst, ist wie Tina versucht dich noch am leben zu halten."
                                                                         );
                                                    game.showstrich();
                                                    System.out.println("Du bist Gestorben");
                                                    game.showstrich();
                                                    System.exit(0);
                                                }

                                                else if (rettung.equals("2")) {

                                                    game.showstrich();
                                                    System.out.println("Du ziehtst deine Mission vor und rettest sie nicht.\n" +
                                                                        "Du und dein Team übernehmen das Drogenlabor \n"
                                                    );
                                                    game.showstrich();
                                                    
                                                    zsp++;
                                                }

                                                else {
                                                    game.showfalsecommand();
                                                    continue;
                                                }
                                                
                                        }//while loop ende


                                }//Story Berlin bei 10 Karmapunkten ende
                                


                        }//Story Berlin ende
                        
                        else {
                            game.showfalsecommand();
                        }//Bei falscher eingabe

                    }//Zwischenstützpunkt story ende 

                    //letzte Mission anfang 
                    
                game.showstrich();
                System.out.println("Du und dein Team greifen Hamburg vom Flughaven aus an. Ihr lasst euch aus einen gepanzerten Helikopter abseilen.");
                System.out.println("Dadurch seit ihr bei der Ankunft zwar geschützt, allerdings haben die Gegner den Helikopter gehört und sind über euren Angriff informiert.");
                game.showstrich();

                // Karmaabfrage
                if(game.spieler1.karmapunkte == -20) { //Karmapunkte sind -20
                   
                    game.showstrich();
                    System.out.println("Storytelling");

                    int ae = 0;  // int für Loop für Anführer Exekution

                    while (ae < 1) {

                        game.showstrich();
                        System.out.println("Du hast die Wahl ob ihr den Anführer exekutiert, oder ob ihr ihn verschohnt.");
                        System.out.println("Schreibe --1-- wenn du ihn verschonen willst.");
                        System.out.println("Schreibe --2-- wenn du ihn exekutieren willst");
                        game.showstrich();
                    
                        String execution = in.nextLine();

                        if (execution.equals("1")){

                            System.out.println("Du lässt den Führer am leben...");
                            
                            ae++;
                        }

                        else if (execution.equals("2")){

                            System.out.println("Du lässt den Gegner exekutieren...");
                           
                            ae++;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
                
                else if(game.spieler1.karmapunkte == +10) { //Karmapunkte sind +10

                    game.showstrich();
                    System.out.println("Storytelling");
                    
                    int zb = 0; //int für loop für es zu Ende bringen

                    while (zb < 1) {

                        game.showstrich();
                        System.out.println("Du hast Angst dein Team zu verlieren.");
                        System.out.println("Du kannst dich entscheiden ob du das Risiko eingehen willst und die Mission zu ende bringen willst, oder das Team schützen  willst.");
                        System.out.println("Schreibe --1-- wenn du es zu Ende bringen willst.");
                        System.out.println("Schreibe --2-- wenn du die Mission abbrechen und dein Team schützen willst.");
                        game.showstrich();

                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Du willst die Mission zu Ende bringen.");
                            
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen");
                            
                            zb++;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
            
                else if(game.spieler1.karmapunkte == -10) { //Karmapunkte sind -10

                    game.showstrich();
                    System.out.println("Es ist unwahrscheinlich, dass ihr die Mission mit so wenig Kämpfern schafft");
                    
                    int zb = 0; // Int für den loop für die Enstscheidung

                    while (zb < 1){

                        game.showstrich();
                        System.out.println("Du bist dir unsicher ob du die Mission zu Ende bringen kannst und kannst dich nun entscheiden.");
                        System.out.println("Schreibe --1-- wenn du es zu Ende bringen willst.");
                        System.out.println("Schreibe --2-- wenn du die Mission abbrechen und dein Team schützen willst.");
                        game.showstrich();

                        String entscheidung = in.nextLine();

                        if (entscheidung.equals("1")){

                            System.out.println("Du willst die Mission zu Ende bringen.");
                            System.out.println("Du stirbst");
                            
                            System.exit(0);
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen");
                            
                            zb++;
                        }

                        else {

                            game.showfalsecommand();
                            continue;
                        }
                    }
                }
                
                else if(game.spieler1.karmapunkte == +20) { //Karmapunkte sind +20

                    game.showstrich();
                    System.out.println("Du und dein Team seit sehr motiviert");
                    System.out.println("Mit großer Motivation und starken Teamgeist, nehmt ihr ohne Probleme Berlin ein und ahbt nur wenige, leicht Verletzte.");
                }

                else if(game.spieler1.karmapunkte == 0) { //Karmapunkte sind 0

                    game.showstrich();
                    System.out.println("Dein Team hat wegend der vorherigen Aktion, wenig Munition und kommt in einen Hinterhalt");

                    int zb = 0; // Int für den loop für die Entscheidung

                    while (zb < 1){
                
                        game.showstrich();
                        System.out.println("Du hast die Wahl, ob du es alleine zu Ende bringst und dein Team zurück lässt, oder bei deinen Team bleibst, aber ihr euch zurückziehen müsst.");
                        System.out.println("Schreibe --1-- wenn du dein Team in Stich lassen willst, um die Mission zu beenden.");
                        System.out.println("Schreibe --2-- wenn du dein Team retten willst, ihr euch dafür zurückziehen müsst und damit die Mission abbrecht.");
                        game.showstrich();

                        String entscheidung = in.nextLine();
                        
                        if (entscheidung.equals("1")){

                            System.out.println("Du lässt dein Team in Stich. Sie sterben. Du kämpfst dich alleine durch und Bringst den Anführer um.");
                            
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du zeihst dich mit deinem Team zurück, ihr brecht die Mission ab. Du bekommst keine Rache, dafür überlebt allerdings das Team.");
                            
                            zb++;
                        }
                    }
                }
                    







                
            }// story Ende Delta 5






            else {
                System.out.println("Du hast kein Team gewählt."); 
            }

            if (game.spieler1.karmapunkte >0){

                game.showstrich();
                game.showstrich();
                System.out.println("Danke fürs spielen, du hast dich gut geschlagen. Deine Kamrapunkte, die nun dein Score sind, sind im positiven Bereich.");
                System.out.println("Dein Score ist:" + game.spieler1.karmapunkte);
                System.out.println("Du hast also wenige schlechte Entscheidungen getroffen.");
                game.showstrich();
                game.showstrich();
                System.exit(0);
            }

            else if (game.spieler1.karmapunkte <0){

                game.showstrich();
                game.showstrich();
                System.out.println("Danke fürs spielen, du hast dich allerdings nicht  gut geschlagen. Deine Kamrapunkte, die nun dein Score sind, sind im negativen Bereich.");
                System.out.println("Dein Score ist:" + game.spieler1.karmapunkte);
                System.out.println("Du ahst also einige schlechte Entscheidungen getroffen.");
                game.showstrich();
                game.showstrich();
                System.exit(0);
            }

            else {

                game.showstrich();
                game.showstrich();
                System.out.println("Danke fürs spielen, du hast dich ganz okay geschlagen. Deine Kamrapunkte, die nun dein Score sind, neutral, so wie am Anfang.");
                System.out.println("Dein Score ist:" + game.spieler1.karmapunkte);
                System.out.println("Du ahst also einige schlechte Entscheidungen getroffen.");
                game.showstrich();
                game.showstrich();
                System.exit(0);
            }
        // Ende des Spiels  

        //Scanner schließen warning
        in.close();
    } //schluss der Main Methode
}

