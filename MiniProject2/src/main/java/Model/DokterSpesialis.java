package Model;

public final class DokterSpesialis extends Dokter {
    private final String bidangSpesialis;

    public DokterSpesialis(String nama, String bidangSpesialis, String jadwal) {
        super(nama, "Spesialis", jadwal);
        this.bidangSpesialis = bidangSpesialis;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dokter Spesialis di bidang " + bidangSpesialis);
        super.tampilkanInfo();
    }

    public String getBidangSpesialis() {
        return bidangSpesialis;
    }
}