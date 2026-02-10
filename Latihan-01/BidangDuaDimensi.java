public abstract class BidangDuaDimensi {
    protected String nama;

    public BidangDuaDimensi(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Nama: " + nama);
    }

    public abstract double luas();
}
