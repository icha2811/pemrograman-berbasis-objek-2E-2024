package proyek;

class KaryawanTetap extends Karyawan {
    private int gajiBulanan;

    public KaryawanTetap(String nama, int usia, String posisi, int gajiBulanan) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Data Karyawan Tetap:");
        System.out.println("Nama: " + getNama());
        System.out.println("Usia: " + getUsia());
        System.out.println("Posisi: " + getPosisi());
        System.out.println("Gaji Bulanan: " + formatGaji(gajiBulanan));
        System.out.println("----------------------");
    }

    private String formatGaji(int gajiBulanan) {
        double juta = gajiBulanan / 1_000_000.0;
        return String.format("%.1f juta", juta).replace('.', ',');
    }
}
