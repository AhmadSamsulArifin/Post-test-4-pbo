package model;

public class RuanganKelas extends Ruangan {
    public RuanganKelas(String nomor, String tipe, String status) {
        super(nomor, tipe, status);
    }

    @Override
    public void infoRuangan() {
        System.out.println("Ruangan Kelas: " + getNomor() + " | " + getTipe() + " | " + getStatus());
    }
}
