package finalnaVjezba;

/*Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
naziv okruga odakle je rekreativni planinar
maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
rekeativci placaju clanarinu u iznosu od 1000 rsd
metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
Rekreativac, id: id
ime: ime prezime Okrug: okrug*/
public class RekreativniPlaninar extends Planinar {
    private int tezinaOpremeKg;
    private String okrug;
    double maxUsponBezOpreme;
    static int clanarina = 1000;

    public RekreativniPlaninar() {

    }


    public RekreativniPlaninar(int identifikacioniBr, String ime, String prezime, int tezinaOpremeKg, String okrug, double maxUsponBezOpreme) {
        super(identifikacioniBr, ime, prezime);
        this.tezinaOpremeKg = tezinaOpremeKg;
        this.okrug = okrug;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int getTezinaOpremeKg() {
        return tezinaOpremeKg;
    }

    public void setTezinaOpremeKg(int tezinaOpremeKg) {
        this.tezinaOpremeKg = tezinaOpremeKg;
    }

    public String getOkrug() {
        return okrug;
    }

    public void setOkrug(String okrug) {
        this.okrug = okrug;
    }

    public double getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }

    public void setMaxUsponBezOpreme(double maxUsponBezOpreme) {
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int clanarina() {
        return clanarina;

    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, " + "id:" + getId() + " ime= " + getIme() +

                " Okrug: " + okrug);

    }

    /*da li će rekreativni planinar uspešno popeti na planinu zavisi da li je njegov najveći uspon manji od visine planine,
    s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
     private int tezinaOpremeKg;
    private String okrug;
    double maxUsponBezOpreme;
    */
    public boolean uspesanUspon(Planina planina) {
        boolean uspijesnost;
//mozda mi treba boolean koja ce u zavisnosti od vrijednosti trigerovat izbor stampe
        if ((maxUsponBezOpreme - (50 * this.tezinaOpremeKg)) > planina.getVisina()) {
//            System.out.println("Planinar moze da osvoji ovu planinu");
            uspijesnost = true;
        } else {
//            System.out.println("Planinar ne moze da osvoji planinu");
            uspijesnost = true;
        }
        return uspijesnost;
    }
}

