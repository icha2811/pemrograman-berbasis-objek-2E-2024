/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datadosen;

/**
 *
 * @author HP
 */
class DosenTidakTetap extends Dosen {
    private int jamMengajar;
    private double honorPerJam;

    // Constructor
    public DosenTidakTetap(String nama, String nik, int umur, char jenisKelamin, int jamMengajar, double honorPerJam) {
        super(nama, nik, umur, jenisKelamin);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    // Implementation of hitungGaji method
    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    // Implementation of tampilkanInfo method
    @Override
    public void tampilkanInfo() {
        System.out.println("===== Informasi Dosen Tidak Tetap =====");
        System.out.println("Nama: " + getNama());
        System.out.println("NIK: " + getNik());
        System.out.println("Umur: " + getUmur());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("Jam Mengajar: " + jamMengajar);
        System.out.println("Honor per Jam: " + honorPerJam);
        System.out.println("Total Gaji: " + hitungGaji());
    }
}


