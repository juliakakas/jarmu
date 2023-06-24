public class Audi extends Jarmu{

    private final boolean lezerBlokk;
    public Audi(int actualSebesseg, String rendszam, boolean lezerBlokk) {
        super(actualSebesseg, rendszam);
        this.lezerBlokk = lezerBlokk;
    }

    @Override
    public boolean gyorsHajtott(int sebessegKorlat) {
        return sebessegKorlat <= actualSebesseg && lezerBlokk;
    }

    @Override
    public String toString() {
        return "Audi: " + super.toString();
    }
}
