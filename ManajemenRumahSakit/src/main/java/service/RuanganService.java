package service;

import model.Ruangan;
import java.util.ArrayList;
import java.util.Scanner;
import model.RuanganKelas;

public class RuanganService {
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // ========================
    // Overloading tambahRuangan
    // ========================

    // 1. Tambah ruangan dengan input dari user
    public void tambahRuangan() {
        System.out.print("Masukkan Nomor Ruangan: ");
        String nomor = scanner.nextLine();

        String[] tipeValid = {"VIP", "Kelas 1", "Kelas 2", "ICU", "Isolasi"};
        String tipe;
        while (true) {
            System.out.print("Masukkan Tipe Ruangan (VIP/Kelas 1/Kelas 2/ICU/Isolasi): ");
            tipe = scanner.nextLine();
            boolean valid = false;
            for (String t : tipeValid) {
                if (t.equalsIgnoreCase(tipe)) {
                    valid = true;
                    break;
                }
            }
            if (valid) break;
            else System.out.println("Tipe ruangan tidak valid!");
        }

        String status;
        while (true) {
            System.out.print("Masukkan Status Ruangan (Kosong/Terisi): ");
            status = scanner.nextLine();
            if (status.equalsIgnoreCase("Kosong") || status.equalsIgnoreCase("Terisi")) {
                break;
            } else {
                System.out.println("Status hanya boleh 'Kosong' atau 'Terisi'!");
            }
        }

        Ruangan ruangan = new RuanganKelas(nomor, tipe, status);
        daftarRuangan.add(ruangan);
        System.out.println("Ruangan berhasil ditambahkan (versi input)!");
    }

    public void tampilkanRuangan() {
        if (daftarRuangan.isEmpty()) {
            System.out.println("Belum ada data ruangan.");
        } else {
            for (Ruangan r : daftarRuangan) {
                System.out.println(r);
            }
        }
    }

    public void updateRuangan() {
        System.out.print("Masukkan Nomor Ruangan yang ingin diupdate: ");
        String nomor = scanner.nextLine();

        for (Ruangan r : daftarRuangan) {
            if (r.getNomor().equalsIgnoreCase(nomor)) {
                System.out.print("Masukkan Tipe baru: ");
                String tipe = scanner.nextLine();
                System.out.print("Masukkan Status baru (Kosong/Terisi): ");
                String status = scanner.nextLine();
                r.setTipe(tipe);
                r.setStatus(status);
                System.out.println("Data ruangan berhasil diupdate!");
                return;
            }
        }
        System.out.println("Ruangan tidak ditemukan!");
    }

    public void hapusRuangan() {
        System.out.print("Masukkan Nomor Ruangan yang ingin dihapus: ");
        String nomor = scanner.nextLine();

        for (Ruangan r : daftarRuangan) {
            if (r.getNomor().equalsIgnoreCase(nomor)) {
                daftarRuangan.remove(r);
                System.out.println("Ruangan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Ruangan tidak ditemukan!");
    }

public void cariRuangan(String nomor) {
    for (Ruangan r : daftarRuangan) {
        if (r.getNomor().equalsIgnoreCase(nomor)) {
            System.out.println("Ditemukan berdasarkan Nomor: " + r);
            return;
        }
    }
    System.out.println("Ruangan dengan nomor " + nomor + " tidak ditemukan!");
}

public void cariRuangan(String tipe, boolean byTipe) {
    for (Ruangan r : daftarRuangan) {
        if (r.getTipe().equalsIgnoreCase(tipe)) {
            System.out.println("Ditemukan berdasarkan Tipe: " + r);
            return;
        }
    }
    System.out.println("Ruangan dengan tipe " + tipe + " tidak ditemukan!");
        }
    }