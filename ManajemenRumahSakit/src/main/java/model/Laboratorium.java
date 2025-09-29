package model;

public class Laboratorium extends Ruangan implements Reservasi {
    private String jenisLab;

    public Laboratorium(String nomor, String tipe, String status, String jenisLab) {
        super(nomor, tipe, status);
        this.jenisLab = jenisLab;
    }

    public String getJenisLab() { return jenisLab; }

    @Override
    public void infoRuangan() {
        System.out.println("Laboratorium - " + toString() + " | Jenis: " + jenisLab);
    }

    @Override
    public void pesan(String namaPasien) {
        System.out.println("Laboratorium " + getNomor() + " dipesan untuk " + namaPasien);
        setStatus("Terisi");
    }

    @Override
    public void batalkan() {
        System.out.println("Reservasi Laboratorium " + getNomor() + " dibatalkan.");
        setStatus("Kosong");
    }
}
