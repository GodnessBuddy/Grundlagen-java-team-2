
public class Game {
    
   //Attribute
    private String hilfe;
   // public String karmapunkt; 
    public String weiter;
    public Player spieler1;

    //Konstruktor
    public Game(Player pPlayer){
        spieler1 = pPlayer;
    }

    //Methoden
    public void showhilfe() {
        System.out.println(hilfe);
    }

    public void setHilfe(String pHilfe){
        this.hilfe = pHilfe;
    }
}
