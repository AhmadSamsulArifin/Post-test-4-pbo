package model;

public class KamarInap extends Ruangan implements Reservasi {

    public KamarInap(String nomor, String tipe, String status) {
        super(nomor, tipe, status);
    }

    @Override
    public void infoRuangan() {
        System.out.println("Kamar Inap - " + toString());
    }

    @Override
    public void pesan(String namaPasien) {
        System.out.println("Kamar Inap " + getNomor() + " dipesan untuk " + namaPasien);
        setStatus("Terisi");
    }

    @Override
    public void batalkan() {
        System.out.println("Reservasi Kamar Inap " + getNomor() + " dibatalkan.");
        setStatus("Kosong");
    }
}
