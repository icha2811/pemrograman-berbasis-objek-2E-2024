package proyek;

class KaryawanKontrak extends Karyawan {
    private int upahPerJam;
    private int jumlahJamKerja;

    public KaryawanKontrak(String nama, int usia, String posisi, int upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Data Karyawan Kontrak:");
        System.out.println("Nama: " + getNama());
        System.out.println("Usia: " + getUsia());
        System.out.println("Posisi: " + getPosisi());
        System.out.println("Upah Per Jam: " + formatUpah(upahPerJam));
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Total Gaji: " + formatGaji(upahPerJam * jumlahJamKerja));
        System.out.println("----------------------");
    }

    private String formatUpah(int upahPerJam) {
        return String.format("%,d", upahPerJam);
    }

    private String formatGaji(int totalGaji) {
        if (totalGaji >= 1_000_000) {
            int juta = totalGaji / 1_000_000;
            return juta + " juta";
        } else {
            return String.format("%,d", totalGaji);
        }
    }
}
