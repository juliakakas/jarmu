public class Main {
    public static void main(String[] args) {

        Robogo vespa = new Robogo(15,"Lia333",20);
        Audi audiS8 = new Audi(120, "Lia111",false);

        System.out.println(vespa);
        System.out.println("haladhat itt " + vespa.haladhatItt(20));
        System.out.println("gyorshajtott " + vespa.gyorsHajtott(60));

        System.out.println(audiS8);
        System.out.println("gyorshajtott " + audiS8.gyorsHajtott(30));
    }
}
