package Model;

public class Dokter extends Person {
    private String spesialis;
    private String jadwal;

    // Constructor
    public Dokter(String nama, String spesialis, String jadwal) {
        super(nama);
        this.spesialis = spesialis;
        this.jadwal = jadwal;
    }

    // Method untuk menampilkan informasi dokter
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Dokter: " + getNama());
        System.out.println("Spesialis: " + spesialis);
        System.out.println("Jadwal: " + jadwal);
    }

    // Getter dan Setter
    public String getSpesialis() {
        return spesialis;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }
}
