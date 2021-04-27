
/**
 * Beschreiben Sie hier die Klasse Buchverwaltung.
 * 
 * @Timon 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Buchverwaltung
{
    private Buch buchregal[]=new Buch[5];//Das Array in dem die Büscher gespeichert werden sollen wird deklariert
    private Buch tauschen[]=new Buch[1]; // ein Array, als zwischenspeicher wird deklariert
    int ende = buchregal.length; //Das Ende wird auf das Ende des Arrays gesetzt
    int anfang = 0;//Der Anfang wird auf 0 gesetzt 
    
    public Buchverwaltung(String sortierArt){
        buecherspeichern();// Bei der Erstellung des Arrays werden die Bücher in dem Array buchregal gespeichert
    }

    public void buecherspeichern(){
        buchregal[0] = new Buch("Bibel", "Gott", 23489); //Ein Buch mit Titel, Autor und Isbn-Nummer wird erstellt und in dem Array "buchregal" gespeichert 
        buchregal[1] = new Buch("Herr der Ringe", "J.R.R Tolkien", 56234);//Ein Buch mit Titel, Autor und Isbn-Nummer wird erstellt und in dem Array "buchregal" gespeichert 
        buchregal[2] = new Buch("Harry Potter", "J.K.Rowling", 23465);//Ein Buch mit Titel, Autor und Isbn-Nummer wird erstellt und in dem Array "buchregal" gespeichert 
        buchregal[3] = new Buch("Ausgerechnet Sylt", "Thomas Herzberg", 11111);//Ein Buch mit Titel, Autor und Isbn-Nummer wird erstellt und in dem Array "buchregal" gespeichert 
        buchregal[4] = new Buch("Frühling auf Schottisch", "Karin Lindberg", 34677);//Ein Buch mit Titel, Autor und Isbn-Nummer wird erstellt und in dem Array "buchregal" gespeichert 
    }

    public void buechersortierenTitel(){    

        for(int anfang = 0; anfang < ende; anfang++)//Das Array wird durgegangen
        {
            for(int aktuell = 0; aktuell < ende; aktuell++)//bei einem Durgang wird jedes Element aus dem Array mit der momentanen Zahl der oberen for-Schleife verglichen
            {      
                if(buchregal[anfang].getTitel().compareTo(buchregal[aktuell].getTitel())<0)    //Falls der "aktuell"-Zeiger auf einen Buchstaben stößt, der vor dem anderen Buchstaben des anfang-Zeigers im Alphabet steht(in diesem Fall wird nach dem Titel geguckt)...
                {
                    tausche(anfang, aktuell);//...wird getauscht mit dem Dreiecks-Tausch
                }
            }
        }
        buecherausgeben(); //Die Anordnung der Bücher, die nach Titelnamen alphabetisch sortiert wurde, wird ausgegeben
    }

    public void buechersortierenIsbn(){
        for(int anfang = 0; anfang < ende; anfang++)//Das Array wird durgegangen
        {
            for(int aktuell = 0; aktuell < ende; aktuell++)//bei einem Durgang wird jedes Element aus dem Array mit der momentanen Zahl der oberen for-Schleife verglichen
            {      
                if(buchregal[anfang].getIsbn() < buchregal[aktuell].getIsbn())    //Falls der "aktuell"-Zeiger auf eine Zahl stößt, die größer ist, als die vom Anfangs-Zeiger... 
                {
                    tausche(anfang, aktuell); //...wird getauscht
                }
            }
        }
        buecherausgeben();//Die Anordnung der Bücher, die nach Isbn-Nummer sortiert wurde, wird ausgegeben
    }

    public void buechersortierenAutor(){
        for(int anfang = 0; anfang < ende; anfang++)//Das Array wird durgegangen
        {
            for(int aktuell = 0; aktuell < ende; aktuell++)//bei einem Durgang wird jedes Element aus dem Array mit der momentanen Zahl der oberen for-Schleife verglichen
            {      
                if(buchregal[anfang].getAutor().compareTo(buchregal[aktuell].getAutor())<0)    //Falls der "aktuell"-Zeiger auf einen Buchstaben stößt, der vor dem anderen Buchstaben des anfang-Zeigers im Alphabet steht(in diesem Fall wird nach dem Autor geguckt)...
                {
                    tausche(anfang, aktuell);//...wird getauscht
                }
            }
        }
        buecherausgeben();//Die Anordnung der Bücher, die nach Autorennamen alphabetisch sortiert wurde, wird ausgegeben
    }

    public void buecherausgeben(){
        for(int i = 0; i < buchregal.length;i++){ //das buchregal-Array wird durchgegangen
            System.out.println(buchregal[i].getTitel());//Und Die Titel der Bücher wird ausgegeben
        } 
    }

    public void tausche(int zahl1, int zahl2){
        tauschen[0] = buchregal[zahl1];//Das erste Parameter wird in einem Zwischenspeicher gespeichert
        buchregal[zahl1] = buchregal[zahl2];//Das zweite Parameter wird in der ersten Zahl gespeichert
        buchregal[zahl2] = tauschen[0];//Der Zwischenspeicher mit dem Ursprünglichen 1. Paramter wird in der zweiten Zahl gespeichert
    }

}
