
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Buch
{
    private String titel, autor;
    private int isbn;
    public Buch(String titel, String autor, int isbn){
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    public String getTitel(){
        return titel;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public int getIsbn(){
        return isbn;
    }
}
