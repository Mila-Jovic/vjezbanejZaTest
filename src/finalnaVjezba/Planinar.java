package finalnaVjezba;
/*Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime. Svi podaci smeju da se
 dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase. Pored toga, klasa ima:
apstraktnu metodu štampaj apstraktnu metodu koja vraca clanarinu planinara
apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
Metoda kao ulazni parametar prima objekat tipa Planina.
//da li apstrakcija mora uvijek biti metoda koja je nepotpuna/ne izvrasavase, vec je izvrsavaju klase koj je naslijede?.*/
public abstract class Planinar {
    private int id;
    private String ime;
    private String prezime;
    public Planinar(){

    }

    public Planinar(int id, String ime, String prezime) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

   abstract void stampaj();


    abstract int clanarina();
    //apstraktnu metodu štampaj apstraktnu metodu koja vraca clanarinu planinara
    abstract boolean uspesanUspon(Planina planina);
    //apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
    //Metoda kao ulazni parametar prima objekat tipa Planina.
}
