package com.tutorial;

class Pegawai {
    private String nama;
    private String jabatan;
    private double pajak;
    private double gajiPokok;
    private double gajiBersih;

    // Konstruktor
    public Pegawai(String nama, String jabatan, double gajiPokok, double pajak) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.pajak = pajak;
    }
    
    // getter

    public String getNama() {
        return nama;
    }
    public String getJabatan() {
        return jabatan;
    }
    public double getPajak() {
        return pajak;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }
    public double hitungGajiBersih() {
        gajiBersih = gajiPokok - (gajiPokok * pajak);
        return gajiBersih;
    }
    public double getGajiBersih() {
        return gajiBersih;
    }

    //setter

    public void setNama(String nama) {
        this.nama = nama;
    }
     public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    // method untuk mengubah nilai pajak
    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
}


public class Main {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("Adam", "Dosen", 3500000,0.1);
        
        // mengubah nilai pajak menjadi 15%
          //pegawai.setPajak(0.15); 

        double gajiBersih = pegawai.hitungGajiBersih();
        
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Jabatan: " + pegawai.getJabatan());
        System.out.println("Gaji Bersih: Rp." + gajiBersih);

       
    }
}

