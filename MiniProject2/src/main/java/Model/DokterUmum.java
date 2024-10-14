package Model;

public final class DokterUmum extends Dokter {

    public DokterUmum(String nama, String jadwal) {
        super(nama, "Umum", jadwal);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dokter Umum");
        super.tampilkanInfo();
    }
}