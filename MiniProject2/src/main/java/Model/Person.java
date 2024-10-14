package Model;

public abstract class Person {
    private String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method abstrak
    public abstract void tampilkanInfo();
}


