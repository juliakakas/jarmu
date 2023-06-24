public class Robogo extends Jarmu implements KisGepjarmu{

    private int maxSebesseg;
    public Robogo(int actualSebesseg, String rendszam, int maxSebesseg) {
        super(actualSebesseg, rendszam);
        this.maxSebesseg = maxSebesseg;
    }

    @Override
    public boolean gyorsHajtott(int sebessegKorlat) {
        return sebessegKorlat <= actualSebesseg;
    }

    @Override
    public boolean haladhatItt(int sebesseg) {
        return sebesseg >= maxSebesseg;
    }

    @Override
    public String toString() {
        return "Robogo: " + super.toString();
    }

    public int getMaxSebesseg() {
        return maxSebesseg;
    }

    public void setMaxSebesseg(int maxSebesseg) {
        this.maxSebesseg = maxSebesseg;
    }
}
