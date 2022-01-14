



public class Player {
    
    //Attribute der Klasse Player

    public int karmapunkte; //Karmapunkt
    public String name; //Spieler name

    //Konstruktor
    public Player(String pName, int pKarma){
        name = pName;
        karmapunkte = pKarma;
    }
   
    //Methoden


   

    public void showkarmapunkte() {
        System.out.println("Deine Karmapunkte sind =" + " "  + karmapunkte);
    }

    
}
