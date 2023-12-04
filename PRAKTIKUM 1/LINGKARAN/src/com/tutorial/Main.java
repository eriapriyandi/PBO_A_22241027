package com.tutorial;
// Definisikan class Lingkaran
class Lingkaran {
    // Variabel anggota (atribut)
    double jariJari;

    // Konstruktor untuk inisialisasi jari-jari
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling lingkaran
    public double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek lingkaran
        Lingkaran lingkaran1 = new Lingkaran(22);

        // Menghitung luas dan keliling lingkaran
        double luas = lingkaran1.hitungLuas();
        double keliling = lingkaran1.hitungKeliling();

        // Menampilkan hasil perhitungan
        System.out.println("========LINGKARAN========");
        System.out.println("Luas Lingkaran: " + luas +" cm2");
        System.out.println("Keliling Lingkaran: " + keliling+" cm");
    }
}
