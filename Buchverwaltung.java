
/**
 * Beschreiben Sie hier die Klasse Buchverwaltung.
 * 
 * @Timon 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Buchverwaltung
{
    private Buch buchregal[]=new Buch[5];
    private Buch tauschen[]=new Buch[1];
    int speicher;
    int ende = buchregal.length;
    int anfang = 0;
    String sortierArt;
    public Buchverwaltung(String sortierArt){
        this.sortierArt = sortierArt;
        buecherspeichern();
    }
    
    public void buecherspeichern(){
        buchregal[0] = new Buch("Bibel", "Gott", 23489);
        buchregal[1] = new Buch("Herr der Ringe", "J.R.R Tolkien", 56234);
        buchregal[2] = new Buch("Harry Potter", "J.K.Rowling", 23465);
        buchregal[3] = new Buch("Ausgerechnet Sylt", "Thomas Herzberg", 11111);
        buchregal[4] = new Buch("Frühling auf Schottisch", "Karin Lindberg", 34677);
    }

    public void buechersortieren(){    
        if(sortierArt == "Titel"){
            for(int anfang = 0; anfang < ende; anfang++)
            {
                for(int aktuell = 0; aktuell < ende; aktuell++)
                {      
                    if(buchregal[anfang].getTitel().compareTo(buchregal[aktuell].getTitel())<0)    //Es wird gespeichert wo das Beste ist
                    {
                      tausche(anfang, aktuell);
                    }
                }
            }
            buecherausgeben();
            }
                else if(sortierArt == "Isbn")
            {
            for(int anfang = 0; anfang < ende; anfang++)
            {
                for(int aktuell = 0; aktuell < ende; aktuell++)
                {      
                    if(buchregal[anfang].getIsbn() < buchregal[aktuell].getIsbn())    //Es wird gespeichert wo das Beste ist
                    {
                      tausche(anfang, aktuell);
                    }
                }
            }
            buecherausgeben();
            }
                else if(sortierArt == "Autor")
            {
                for(int anfang = 0; anfang < ende; anfang++)
            {
                for(int aktuell = 0; aktuell < ende; aktuell++)
                {      
                    if(buchregal[anfang].getAutor().compareTo(buchregal[aktuell].getAutor())<0)    //Es wird gespeichert wo das Beste ist
                    {
                        tausche(anfang, aktuell);
                    }
                }
            }
            buecherausgeben();
            }
    }
    
    public void buecherausgeben(){
        for(int i = 0; i < buchregal.length;i++){
            System.out.println(buchregal[i].getTitel());
        } 
    }

    public void tausche(int zahl1, int zahl2){
        
        tauschen[0] = buchregal[zahl1];
        buchregal[zahl1] = buchregal[zahl2];
        buchregal[zahl2] = tauschen[0];
    }
    
    
}
