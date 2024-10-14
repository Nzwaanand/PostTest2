package Manajemen;

import Model.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PengelolaanJadwal implements CRUDOperations {
    private static final ArrayList<Dokter> daftarDokter = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PengelolaanJadwal pengelolaan = new PengelolaanJadwal();
        int pilihan;

        do {
            System.out.println("\nSistem Pengelolaan Jadwal Dokter di Klinik");
            System.out.println("1. Tambah Dokter");
            System.out.println("2. Tampilkan Semua Dokter");
            System.out.println("3. Update Jadwal Dokter");
            System.out.println("4. Hapus Dokter");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    pengelolaan.tambah();
                    break;
                case 2:
                    pengelolaan.tampilkan();
                    break;
                case 3:
                    pengelolaan.update();
                    break;
                case 4:
                    pengelolaan.hapus();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    @Override
    public void tambah() {
        System.out.print("Masukkan nama dokter: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan tipe dokter (1. Umum / 2. Spesialis): ");
        int tipe = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (tipe == 1) {
            System.out.print("Masukkan jadwal dokter: ");
            String jadwal = scanner.nextLine();
            DokterUmum dokter = new DokterUmum(nama, jadwal);
            daftarDokter.add(dokter);
        } else if (tipe == 2) {
            System.out.print("Masukkan bidang spesialisasi: ");
            String spesialis = scanner.nextLine();
            System.out.print("Masukkan jadwal dokter: ");
            String jadwal = scanner.nextLine();
            DokterSpesialis dokter = new DokterSpesialis(nama, spesialis, jadwal);
            daftarDokter.add(dokter);
        } else {
            System.out.println("Tipe dokter tidak valid.");
        }
        System.out.println("Dokter berhasil ditambahkan.");
    }

    @Override
    public void tampilkan() {
        if (daftarDokter.isEmpty()) {
            System.out.println("Belum ada dokter yang terdaftar.");
        } else {
            System.out.println("\nDaftar Dokter di Klinik:");
            for (Dokter dokter : daftarDokter) {
                dokter.tampilkanInfo();
                System.out.println("-------------------------");
            }
        }
    }

    @Override
    public void update() {
        System.out.print("Masukkan nama dokter yang ingin diupdate jadwalnya: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Dokter dokter : daftarDokter) {
            if (dokter.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan jadwal baru: ");
                String jadwalBaru = scanner.nextLine();
                dokter.setJadwal(jadwalBaru);
                System.out.println("Jadwal dokter berhasil diupdate.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Dokter dengan nama tersebut tidak ditemukan.");
        }
    }

    @Override
    public void hapus() {
        System.out.print("Masukkan nama dokter yang ingin dihapus: ");
        String nama = scanner.nextLine();
        boolean found = false;

        for (Dokter dokter : daftarDokter) {
            if (dokter.getNama().equalsIgnoreCase(nama)) {
                daftarDokter.remove(dokter);
                System.out.println("Dokter berhasil dihapus.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Dokter dengan nama tersebut tidak ditemukan.");
        }
    }
}
