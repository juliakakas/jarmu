public abstract class Jarmu implements KisGepjarmu {
    public int actualSebesseg;

    private final String rendszam;

    public Jarmu(int actualSebesseg, String rendszam){
        this.actualSebesseg= actualSebesseg;
        this.rendszam = rendszam;
    }

    public abstract boolean gyorsHajtott(int sebessegKorlat);

    @Override
    public String toString() {
        return "rendszam = " + rendszam + " sebesseg = " + actualSebesseg+ "km/h";
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return sebesseg > actualSebesseg;
    }

    public int getActualSebesseg() {
        return actualSebesseg;
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setActualSebesseg(int actualSebesseg) {
        this.actualSebesseg = actualSebesseg;
    }
}
