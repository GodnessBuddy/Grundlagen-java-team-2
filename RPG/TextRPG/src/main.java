
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        // System objects
        Scanner in = new Scanner(System.in);

        Player player = new Player();
        player.karmapunkte = 0;

        Game game = new Game();
        game.karmapunkt = "Deine Karmapunkte sind :";
        game.weiter = "--------------------------------------";

        // Game Starts here

        int i = 0;

        while (i < 2) {
            i++;

            System.out.println("Willkommen zu ");

            System.out.println("--------------------------------------");
            System.out.println("Möchtest du das Spiel spielen?");
            System.out.println("\t" + "Schreibe 1 um das Spiel zu beginnen");
            System.out.println("\t" + "Schreibe 2 um das Spiel nicht zu beginnen");
            System.out.println("--------------------------------------");

            String input = in.nextLine();

            if (input.equals("1")) {
                break;
            } else if (input.equals("2")) {
                continue;
            } else
                System.out.println("Falsche Eingabe");
            continue;

        }

        while (i < 2) {
            i++;

            System.out.println("--------------------------------------");
            System.out.println("Wie willst du heißen:");

            player.name = in.nextLine(); // variable name

            System.out.println("--------------------------------------");
            System.out.println("Dein Name ist:" + " " + player.name);
            System.out.println(" ");
            System.out.println("Wenn du Hilfe benötigst dann schreibe hilfe");
            System.out.println(" ");
            System.out.println("Wenn du dir deine Karma Punkte anzeigen lassen willst dannn schreibe karmapunkte");
            System.out.println(" ");
            System.out.println("Wenn du die Geschichte anfangen willst dann schreibe weiter ");
            System.out.println("--------------------------------------");

            String input = in.nextLine();

            if (input.equals("weiter")) {
                break;
            } else if (input.equals("hilfe")) {
                System.out.println("Hier steht die Hilfe");
                continue;
            } else if (input.equals("karmapunkte")) {
                System.out.println(game.karmapunkt);
                continue;
            } else {
                System.out.println("Falsche Eingabe");
                continue;
            }

        }
        // Scanner schließen warning
        in.close();
    }

}
