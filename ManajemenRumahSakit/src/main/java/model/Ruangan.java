package model;

public abstract class Ruangan {
    private String nomor;
    private String tipe;
    private String status;

    public Ruangan(String nomor, String tipe, String status) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.status = status;
    }

    public String getNomor() { return nomor; }
    public String getTipe() { return tipe; }
    public String getStatus() { return status; }

    public void setTipe(String tipe) { this.tipe = tipe; }
    public void setStatus(String status) { this.status = status; }

    // Wajib diimplementasikan di subclass
    public abstract void infoRuangan();

    @Override
    public String toString() {
        return "Nomor: " + nomor + " | Tipe: " + tipe + " | Status: " + status;
    }
}
