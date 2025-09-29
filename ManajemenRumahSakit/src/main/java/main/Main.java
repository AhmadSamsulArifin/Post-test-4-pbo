package main;

import model.KamarInap;
import model.Laboratorium;
import service.RuanganService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuanganService service = new RuanganService();
        int pilihan;

        do {
            System.out.println("\n=== MENU RUANGAN RUMAH SAKIT ===");
            System.out.println("1. Tambah Ruangan");
            System.out.println("2. Tampilkan Semua Ruangan");
            System.out.println("3. Update Ruangan");
            System.out.println("4. Hapus Ruangan");
            System.out.println("5. Cari Ruangan berdasarkan Nomor");
            System.out.println("6. Cari Ruangan berdasarkan Tipe");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahRuangan();
                case 2 -> service.tampilkanRuangan();
                case 3 -> service.updateRuangan();
                case 4 -> service.hapusRuangan();
                case 5 -> {
                  System.out.print("Masukkan Nomor Ruangan: ");
                  String nomor = scanner.nextLine();
                  service.cariRuangan(nomor);
        }
                case 6 -> {
                System.out.print("Masukkan Tipe Ruangan: ");
                String tipe = scanner.nextLine();
                service.cariRuangan(tipe, true); 
        }

                case 7 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);

        System.out.println("\n=== Ruangan ===");
        KamarInap kamar = new KamarInap("K101", "VIP", "Kosong");
        Laboratorium lab = new Laboratorium("L201", "Laboratorium", "Kosong", "Patologi");

       
        kamar.infoRuangan();
        kamar.pesan("Budi");

        lab.infoRuangan();
        lab.pesan("Ani");

        System.out.println(kamar); 
        System.out.println(lab);
    }
}
