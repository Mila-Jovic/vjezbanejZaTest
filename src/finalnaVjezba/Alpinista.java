package finalnaVjezba;

/*Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost) i poeni se
mogu menjati kroz adekvatnu metodu. Alpinista može da savlada sve uspone do 4000 metara, placa clanarinu u iznosu od
1500 pritom za svaki poen ima popust od 50, a informacije o alpinisti se ispisuju u formatu:
Alpinista, id: id
ime: ime i prezime
Broj poena: poeni*/
public class Alpinista extends Planinar {
    private int ostvareniPoeni;
    final int maxVisina = 4000;

    public Alpinista() {
    }

    public Alpinista(int id, String ime, String prezime, int ostvareniPoeni) {
        super(id, ime, prezime);
        if (ostvareniPoeni >= 0) {
            this.ostvareniPoeni = ostvareniPoeni;
        } else {
            System.err.println("Nedozvoljeni unos");
            //kraci metos preko setera?
        }
    }

    public void setOstvareniPoeni(int ostvareniPoeni) {
        if (ostvareniPoeni >= 0) {
            this.ostvareniPoeni = ostvareniPoeni;
        } else {
            System.err.println("Nedozvoljeni unos");
        }
    }

    /*Alpinista, id: id
    ime: ime i prezime
    Broj poena: poeni*/

    @Override
    public void stampaj() {
        System.out.println("Alpinista, " + "ime: " + getIme() + " prezime: " + getPrezime() +
                " Broj poena: " + ostvareniPoeni);

    }

    public int clanarina() {
        int clanarina = 1500;
        clanarina = clanarina - (50 * ostvareniPoeni);
        if (clanarina <= 0) {
            System.out.println("Kidate koliko ste dobri, we won't take your money sir.");

        }
        return clanarina;
    }

    public boolean uspesanUspon(Planina planina) {
        boolean uspijesnost;
        if (planina.getVisina() < maxVisina && planina.getVisina() > 0) {
//            System.out.println("Alpinista moze da osvoji vrh ove planine.");
            return uspijesnost = true;
        } else {
//            System.out.println("Alpinista ne moze da osvoji ovaj vrh.");
            return uspijesnost = false;
        }
    }
}
