package finalnaVjezba;

/*Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine. Klasa mora imati
 konstruktore i getere i setere.*/
public class Planina {
    private String imePlanine;
    private String imeDrzave;
    private double visina;

    public Planina() {

    }

    public Planina(String imePlanine, String imeDrzave, double visina) {
        this.imePlanine = imePlanine;
        this.imeDrzave = imeDrzave;
        if (visina < 0) {
            System.out.println("Planina mora imati visinu.");
        } else {

            this.imeDrzave = imeDrzave;
        }
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public String getImeDrzave() {
        return imeDrzave;
    }

    public void setImeDrzave(String imeDrzave) {
        if (visina < 0) {
            System.out.println("Planina mora imati visinu.");
        } else {

            this.imeDrzave = imeDrzave;
        }
    }

    public double getVisina() {
        return visina;

    }

    public void setVisina(double visina) {
        this.visina = visina;
    }
}
