
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
            while(e <1000) {
                
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
                        break;  

                    }else if (input.equals("hilfe")) {
                        e++;
                        continue;
                    

                    } else if (input.equals("karmapunkte")) {
                        game.spieler1.showkarmapunkte();
                        e++;
                        continue;
                    } 

                    else {
                        game.showfalsecommand();
                        e++;
                        continue;  
                    }
                 
            }


        // Story Start

        // Einleitung in das Spiel
            game.showstrich();
            System.out.println("Einleitung");
            System.out.println("Es ist 2088 in Deutschland. Deutschland ist ein Land in dem nur Krieg herscht."); //geht noch weiter
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
                System.out.println("Diskussion was man angreift"); // Diskussion mit dem Team, was man angreift 
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
                        System.out.println("Du hast dich entschieden das Satelitenbasis in der nähe von Leipzig anzugreifen.");
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

                System.out.println(game.spieler1.karmapunkte); // kurzer Test (kann später gelöscht werden) 

                // Entscheidung Satellitenbasis (Karmapunkte = -10)
                if (game.spieler1.karmapunkte==-10) {

                    game.showstrich(); 
                    System.out.println("Hier ist die Story für die Satellitenbasis"); // Text der Story für Satellitenbasis 
                    game.showstrich(); 

                }
                
                // Entscheidung für Munitionslager (Karmapunkte = 0)
                if (game.spieler1.karmapunkte==0) {

                    game.showstrich(); 
                    System.out.println("Hier steht die Story fürs Munitionslager"); // Story Munitionslager
                    game.showstrich(); 

                    game.showstrich(); 
                    System.out.println("Dein Team ist Sauer auf dich, da ein Mann verloren gegangen ist");
                    System.out.println("Du kannst dich nun entscheiden, wie du handeln möchtest");
                    System.out.println("Sei dir bewusst, dass jede Entscheidung einen andere auswirkung hat");
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
                    System.out.println("Das war die Story für Bravo 6");
                }
                
                else if (game.spieler1.karmapunkte == -10) {
                    game.showstrich();
                    System.out.println("Du redest mit dem Truppleiter, dieser ist jedoch sehr sauer auf dich und rastet aus \nDas Gespräch eskaliert und du musst eine Entscheidung treffen:");
                    System.out.println("\nOption 1: Du verteidigst dich (mit Worten)");
                    System.out.println("\nOption 2: Du ignorierst ihn");
                    System.out.println("\nOption 3: Du bringst ihn um");
                    String schuldentscheidung = in.nextLine();
                    if (schuldentscheidung.equals("1")) {
                        
                    }
                    if (schuldentscheidung.equals("2")) {
                        
                    }
                    if (schuldentscheidung.equals("3")) {
                        
                    }

                }

                else if (game.spieler1.karmapunkte == -20 ) {
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
                                System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                game.showstrich();
                            }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                                //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Der Truppleiter sagt, dass du gelogen hast.");
                                game.showstrich();
                            }//Zwischenstützpunkt Story bei -10 Karmapunkten ende



                             //Zwischenstützpunkt Story bei 0 Karmapunkten Anfang 
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
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

                                        System.out.println("Du bringst deinen Truppleiter um");
                                        game.spieler1.karmapunkte = -40;

                                    }

                                    else if (input.equals("2")) {
                                        
                                        System.out.println("klärendes Gespräch");
                                        game.spieler1.karmapunkte = 20;
                                    
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
                                System.out.println("Auf dem Hinweg bringen dich deine Leute um");
                                game.showstrich();
                            }//Zwischenstützpunkt Story bei -30 Karmapunkten ende



                            //Zwischenstützpunkt Story bei -20 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == -20) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                System.out.println("Dein Team möchte dich nichtmehr haben.");
                                System.out.println("Du kannst dich entscheiden ob du die Mission alleine weiterführst oder ob du doch mit ihnen mitgehst");

                                int b = 0;

                                while (b < 1) {

                                    game.showstrich();
                                    System.out.println("Schreibe --1-- um mit deinen Team mitzugehen");
                                    System.out.println("Schreibe --2-- um die Mission alleine auszuführen.");
                                    game.showstrich();

                                    String input = in.nextLine();

                                    if (input.equals("1")) {

                                        System.out.println("Du gehst mit deinem Team mit");
                                        System.out.println("Sie bringen dich um"); 
                                        System.exit(0);
                                    }
                                    
                                    else if (input.equals("2")) {

                                        System.out.println("Du führst die restliche Mission alleine aus");
                                    }

                                    else {
                                        game.showfalsecommand();
                                    }
                                } 

                            }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                            //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
                                game.spieler1.karmapunkte = 10;
                            }//Zwischenstützpunkt Story bei -10 Karmapunkten ende



                            //Zwischenstützpunkt Story bei 0 Karmapunkten Anfang 
                            else if (game.spieler1.karmapunkte == 0) {

                                game.showstrich();
                                System.out.println("Story Angriff");
                                game.showstrich();
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

                                        System.out.println("Du bringst deinen Truppleiter um");
                                        game.spieler1.karmapunkte = -40;

                                    }

                                    else if (input.equals("2")) {
                                        
                                        System.out.println("klärendes Gespräch");
                                        game.spieler1.karmapunkte = 20;
                                    
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
                int m = 0;

                while(m < 1){

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
                        m++;  
                    }
                    else {
                        game.showfalsecommand();
                        continue;
                    }
                }
                
                game.showstrich();  
                System.out.println("Diskussion was man angreift"); // Diskussion mit dem Team, was man angreift 
                game.showstrich();  

                // ao = Angriffsortabfrage  für  Delta 5   
                int ao = 0;
                while (ao < 1) {

                    game.showstrich(); 
                    System.out.println("Du kannst dich nun zwischen 2 verschiedenen Orten entscheiden, die du angreifen möchtest.");
                    System.out.println("Die erste möglichkeit währe die Satellittenbasis nähe Leipzig.");
                    System.out.println("\t" + "Schreibe --1-- um diesen Angriff zu starten.");   
                    System.out.println("");  
                    System.out.println("Die zweite Möglichkeit ist das Munitionslager nähe Osnabrück");
                    System.out.println("\t"+ "Schreibe --2-- um diesen Angriff zu starten.");        
                    game.showstrich(); 

                    // Abfrage für den Angriffsort von Delta 5
                    String angriffsort = in.nextLine();

                    // Falls eingabe 1: (Leipzig) 
                    if (angriffsort.equals("1")) {

                        game.spieler1.karmapunkte = -10; // Karmapunkte werden auf -10 gesetzt 
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden das Satelitenbasis in der nähe von Leipzig anzugreifen.");
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte); 
                        game.showstrich(); 
                        ao++;
                    }
                    // Falls eingabe 2: (Osnabrück)
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
                }// Story ende Osnabrück

                // Wenn Leipzig gewählt wurde
                if (game.spieler1.karmapunkte == -10) {

                    game.showstrich(); 
                    System.out.println("Das Team ist sauer auf dich.");
                    System.out.println("Du kannst dich nun entscheiden wie du handelst.");  
                    System.out.println(""); 
                    game.showstrich(); 
                    System.out.println("\t" +"Schreibe --1-- um dich rauszureden"); // bessere Formulierung 
                    System.out.println("\t"+ "Schreibe --2-- um deaskalierend zu wirken. "); 
                    System.out.println("");
                    System.out.println("Wenn du --karmapunkte-- schreibst, siehst du deine Karmapunkte");  
                    System.out.println("Wenn du --hilfe-- schreibst, siehst du die hilfe ");
                    game.showstrich(); 

                    int he = 0; // int für entscheidung wie du handelst

                    while (he < 1){
                        
                        String handelsentscheidung = in.nextLine();

                        // wenn 1 ,dann karmapunkte = -20
                        if (handelsentscheidung.equals("1")) {

                            game.spieler1.karmapunkte = -20;
                            game.showstrich(); 
                            System.out.println("du redest dich heraus. Team wird sauer"); 
                            game.showstrich(); 
                            break;
                        }
                        // wenn 2, dann Karmapunkte auf 0 wieder
                        else if (handelsentscheidung.equals("2")) { 

                            game.spieler1.karmapunkte = 0;
                            game.showstrich(); 
                            System.out.println("du wirkst deeskalierend"); 
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
                        System.out.println("Achmet geht mit einem Messer auf dich los.");
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

                                System.out.println("Du verteidigst dich");
                                game.spieler1.karmapunkte = -10;
                                break;
                            }

                            // Wenn du nichts tust
                            else if (achmetentscheidung.equals("2")) {

                                System.out.print("Du bist Gestorben");
                                System.exit(0);
                            }

                            // Wenn du Ihn umnbringst
                            else if (achmetentscheidung.equals("3")) {

                                System.out.println("Du hast Achmet umgebracht");
                                game.spieler1.karmapunkte = -40; 
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
                        
                        while (game.spieler1.karmapunkte == -40) {

                            System.out.println("Du kannst dich entscheiden ob du ihnen über deine Vergangenheit erzählst, dass dir die Mission sehr wichtig ist.");
                            System.out.println("Oder du schweigst, um die Mission nicht  zu gefährden.");
                            System.out.println("Schreibe --1-- um über deine Vergangenheit zu erzählen."); 
                            System.out.println("Schreibe --2-- um zu schweigen."); 
                            game.showstrich(); 

                            String inputkarma = in.nextLine(); // Inputkarma nur für das nächste If- Statement

                            if (inputkarma.equals("1")) {

                                game.showstrich(); 
                                System.out.println("Erzählt die Geschichte"); 
                                game.showstrich(); 
                                game.spieler1.karmapunkte = -30;
                            }

                            else if (inputkarma.equals("2")) { 
 
                                game.showstrich(); 
                                System.out.println("Du schweigst."); 
                                game.showstrich(); 
                                game.spieler1.karmapunkte = -50;
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
                        System.out.println("Gespräch mit Team über deine Entscheidungen, bitten weniger Risiko einzugehen"); 
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
                            }
                            else if (inputkarma.equals("2")) {

                                game.showstrich(); 
                                System.out.println("Du reagierst darauf nicht"); 
                                game.showstrich(); 
                                game.spieler1.karmapunkte = -20;
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
                        System.out.println("Team vertraut dir mehr"); 
                        game.showstrich(); 
                        System.out.println("Du redest mit dem Truppleiter und er fragt dich wieso du das alles tust."); 
                        System.out.println("Du kannst dich entscheiden, ob du über die Vorgeschichte redest oder nicht.");
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
                                break;
                            }
                            else if(inputkarma.equals("2")){

                                game.showstrich(); 
                                System.out.println("Du erzählst dem Truppleiter deine Vorgeschichte"); 
                                game.showstrich(); 
                                break;
                            }
                            else {

                                game.showfalsecommand();
                                continue;
                            }
                        }
                        
                        game.showstrich(); 
                        System.out.println("Planung nächste Mission"); 
                        game.showstrich(); 
                        break;
                    }

                    // Bei dieser Karmapunktenabfrage kommt es direkt zur Planung
                    // Karmapunkte sind bei 0
                    else if (game.spieler1.karmapunkte == 0) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission"); 
                        game.showstrich(); 
                        break;
                    }

                    /* 
                    Karmapunkte sind bei -50 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte nicht zu erwähnen (Line  667-704)
                    */
                    else if (game.spieler1.karmapunkte == -50) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission"); 
                        game.showstrich();  
                        break;  
                    }

                    /*
                    Karmapunkte sind bei -30 dann kommt es zur Planung der Mission
                    Das hier passierte nachdem man sich entschied die Vorgeschichte zu erwähnen (Line  667-704)
                    */
                    else if (game.spieler1.karmapunkte == -30) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission"); 
                        game.showstrich(); 
                        break;
                    }

                    /* 
                    Karmapunkte bei -20. Passiert da, wo man nicht auf den Vorschlag wegen des Risikos eingeht. 
                    Line (708- 744) 
                    */
                    else if(game.spieler1.karmapunkte == -20) {

                        game.showstrich(); 
                        System.out.println("Planung nächste Mission"); 
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
                        Scanner enter = new Scanner(System.in);
                        game.showstrich();
                        System.out.println("Du greifst mit" + team.teammitglieder + "Bremen an");
                        System.out.println("Dies wird ein Helikopterangriff");
                        System.out.println("Was als nächstes passieren wird, wird jedoch nicht von dir, sondern von deinen Karmapunkten \nbzw. deiner Beziehung zu deinem Team bestimmt");
                        enter.nextLine();
                        game.showstrich();
                        
                        if (game.spieler1.karmapunkte == -50) {
                            System.out.println("Dein Team wirft dich aus dem Helikopter und du stirbst");
                            game.showstrich();
                            System.out.println("Game Over");
                            System.exit(0);
                        }
                        else if (game.spieler1.karmapunkte == -30) {
                            System.out.println("Die Eroberung des Stützpunktes ist gut verlaufen \nIhr fahrt fort, mit der Planung eurer letzten Mission");
                            game.showstrich();
                            System.out.println("Dies war die Story für Delta 5");
                            System.exit(0);
                        }
                        else if (game.spieler1.karmapunkte == -20) {
                            System.out.println("Ihr geht mit viel Risiko in die Mission hinein");
                            System.out.println("Schon bald nachdem ihr ankommt, gerät dein ganzes Team in Gefahr und wird gefangen genommen \n");
                            System.out.println("Du kannst dich entscheiden: \n");
                            System.out.println("Option 1: Du gehst volles Risiko und versuchst dein ganzes Team zu retten");
                            System.out.println("Option 2: Du siehst, dass du drei deiner Leute einfach befreien kannst und befreist ausschließlich diese");
                            int bremen = in.nextInt();
                            if (bremen == 1) {
                                System.out.println("Du hattest extremes Glück und konntest dein gesamtes Team befreien");
                                System.out.println("Ihr fahrt fort mit der Einnahme des Stützpunktes und plant von dort aus eure letze Mission");
                                game.spieler1.karmapunkte = game.spieler1.karmapunkte + 30;

                            }
                            else if (bremen == 2){
                                System.out.println("Du schaffst es die drei Personen zu retten");
                                System.out.println("Ihr übernehmt die Basis zu viert aber eure Kameraden überleben dies nicht");
                                game.spieler1.karmapunkte = game.spieler1.karmapunkte + 10;
                                System.out.println("");
                            }

                        }
                        else if (game.spieler1.karmapunkte == 0) {
                            System.out.println("Dein Team"
                        }
                        else if (game.spieler1.karmapunkte == 10) {
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
                                    System.out.println("Auf den hinweg bringt dich dein Team um.");
                                    System.out.println("Du bist Gestorben"); 
                                    System.exit(0);
                                    game.showstrich();


                                } //Story Berlin bei -50 Karmapunkten ende


                                //Story Berlin bei -30 Karmapunkten anfang
                                else if (game.spieler1.karmapunkte == -30) {
                                    
                                    
                                } //Story Berlin bei -30 Karmapunkten ende 


                                //Story Berlin bei -20 Karmapunkten anfang 
                                else if (game.spieler1.karmapunkte ==-20) {
                                   
                                   game.showstrich();
                                   System.out.println("Story Angriff");
                                   game.showstrich();
                                   System.out.println("Während des Angriffes ist ein Teammitglied in großer gefahr. \n" +
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
                                                    game.spieler1.karmapunkte = -10;

                                                    zsp++;
                                                }
                                                 
                                                else if (rettung.equals("2")) {
                                                   
                                                    game.showstrich();
                                                    System.out.println("Du hast dich entschieden ihn nicht zu retten");
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
                                    System.out.println("");
                                    game.showstrich();
                                    
                                    game.spieler1.karmapunkte = 20;
                                    zsp++;
                                }//Story Berlin bei 0 Karmapunkten ende

                                
                                //Story Berlin bei 10 Karmapunkten anfang
                                else if (game.spieler1.karmapunkte == 10) {

                                    game.showstrich();
                                    System.out.println("Deine geliebte gerät ihn aussichtslose schwierigkeiten \n" +
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
                                                                        "Du schaffst es sie in Sicherheit zu bringen aber dann wird dir in den Rücken geschossen.");
                                                    game.showstrich();
                                                    System.out.println("Du bist Gestorben");
                                                    game.showstrich();
                                                    System.exit(0);
                                                }

                                                else if (rettung.equals("2")) {

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









                
            }// story Ende Delta 5






            else {
                System.out.println("Du hast kein Team gewählt."); 
            }
        // Ende des Spiels  

        //Scanner schließen warning
        in.close();
    } //schluss der Main Methode
} 
