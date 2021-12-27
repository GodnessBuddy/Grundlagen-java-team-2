
public class Game {
    
    //Attribute
    private String hilfe;
    public String weiter;
    public Player spieler1;


    //Methoden
    public void showhilfe() {
        System.out.println(hilfe);
    }

    public void setHilfe(String pHilfe){
        this.hilfe = pHilfe;
    }

    
     //Konstruktor
     public Game(Player pPlayer){
        spieler1 = pPlayer;
     }
        

    

    
    

}
