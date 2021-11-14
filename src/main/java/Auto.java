public class Auto {
    private String name;
    private int jahr;
    private String kosten;
    private int herstelljahr;

    public Auto(String name, int jahr, String kosten, int herstelljahr) {
        this.name = name;
        this.jahr = jahr;
        this.kosten = kosten;
        this.herstelljahr = herstelljahr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public String getKosten() {
        return kosten;
    }

    public void setKosten(String kosten) {
        this.kosten = kosten;
    }

    public int getHerstelljahr() {
        return herstelljahr;
    }

    public void setHerstelljahr(int herstelljahr) {
        this.herstelljahr = herstelljahr;
    }

    public int differenz(){
        return getJahr()-getHerstelljahr();
    }
}
