public class App {
    public static void main(String[] args) {
        BujurSangkar bujurSangkar = new BujurSangkar("Bujur Sangkar", 5);
        bujurSangkar.info();
        System.out.println("Luas: " + bujurSangkar.luas());

        System.out.println();

        Lingkaran lingkaran = new Lingkaran("Lingkaran", 3.5);
        lingkaran.info();
        System.out.println("Luas: " + lingkaran.luas());
    }
}
