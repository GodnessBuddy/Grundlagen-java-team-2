
import java.time.chrono.HijrahEra;
import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Testmain {
        
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
                    System.out.println("Du: Red nicht so einen Blödsinn. Leipzig wäre viel zu gefährlich gewesen. \nBesser so, als wenn wir einen Mann verlieren oder Sonstiges.");
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
                            game.showstrich();


                                    //Zwischenstützpunkt Story bei -30 Karmapunkten Anfang
                                if (game.spieler1.karmapunkte == -30) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
                                    game.showstrich();
                                    System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                }//Zwischenstützpunkt Story bei -30 Karmapunkten ende



                                    //Zwischenstützpunkt Story bei -20 Karmapunkten Anfang
                                else if (game.spieler1.karmapunkte == -20) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
                                    game.showstrich();
                                    System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                                    //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                                else if (game.spieler1.karmapunkte == 0) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
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
                                }//Zwischenstützpunkt Story bei 10 Karmapunkten ende




                            

                        }//Story Bremen ende



                        //Story Berlin Anfang
                        else if (zwischenstützpunkt.equals("2")) {

                            game.showstrich();
                            System.out.println("Du greifst mit" + team.teammitglieder + "Berlin an");


                                                                //Zwischenstützpunkt Story bei -30 Karmapunkten Anfang
                                if (game.spieler1.karmapunkte == -30) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
                                    game.showstrich();
                                    System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                }//Zwischenstützpunkt Story bei -30 Karmapunkten ende



                                    //Zwischenstützpunkt Story bei -20 Karmapunkten Anfang
                                else if (game.spieler1.karmapunkte == -20) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
                                    game.showstrich();
                                    System.out.println("Bei dem Angriff sterben vier deiner Leute");
                                }//Zwischenstützpunkt Story bei -20 Karmapunkten ende



                                    //Zwischenstützpunkt Story bei -10 Karmapunkten Anfang
                                else if (game.spieler1.karmapunkte == 0) {

                                    game.showstrich();
                                    System.out.println("Story Angriff");
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
                                }//Zwischenstützpunkt Story bei 10 Karmapunkten ende



                        }//Story Berlin ende

                        //bei Falscher eingabe
                        else {
                            game.showfalsecommand();
                            continue;
                        }
                }












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
                            game.spieler1.karmapunkte = -10;
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
                            game.spieler1.karmapunkte = +10;
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen. Ihr zieht euch zurück und führt ein normales Leben, allerdings konntest du deine Familie nicht rechnen.");
                            game.spieler1.karmapunkte = -10;
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
                            game.spieler1.karmapunkte = 10;
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
                                    game.spieler1.karmapunkte = 0;
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
                            game.spieler1.karmapunkte = 30;
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
                            game.spieler1.karmapunkte = -10;
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
                            game.spieler1.karmapunkte = 10;
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
                int l = 0;

                while(l < 1){

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
                        l++;  
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
                int el = 0;
                while (el < 1) {

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
                        el++;
                    }
                    // Falls eingabe 2: (Osnabrück)
                    else if (angriffsort.equals("2")) {

                        game.spieler1.karmapunkte = 10; // Karmapunkte werden auf 10 gesetzt.
                        game.showstrich(); 
                        System.out.println("Du hast dich entschieden das Munitionslager in der nähe von Osnabrück anzugreifen."); 
                        System.out.println("Deine Karmapunkte betragen" + "=" + game.spieler1.karmapunkte);
                        game.showstrich(); 
                        el++;
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
                            game.spieler1.karmapunkte = -10;
                            ae++;
                        }

                        else if (execution.equals("2")){

                            System.out.println("Du lässt den Gegner exekutieren...");
                            game.spieler1.karmapunkte = -20;
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
                            game.spieler1.karmapunkte = 10;
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen");
                            game.spieler1.karmapunkte = 30;
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
                            game.spieler1.karmapunkte = -10;
                            System.exit(0);
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du brichst die Mission ab um dein Team zu schützen");
                            game.spieler1.karmapunkte = 10;
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
                            game.spieler1.karmapunkte = -30;
                            zb++;
                        }

                        else if (entscheidung.equals("2")){

                            System.out.println("Du zeihst dich mit deinem Team zurück, ihr brecht die Mission ab. Du bekommst keine Rache, dafür überlebt allerdings das Team.");
                            game.spieler1.karmapunkte = 40;
                            zb++;
                        }
                    }
                }
            } // story Ende Delta 5

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
