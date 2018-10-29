/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan58_tambahkurang;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan hasil 
 *                     penjumlahan dan hasil selisih dengan inputan yg sudah 
 *                     ditentukan berdasarkan konsep inheritance 
 */
public class JumlahBilangan extends Bilangan{
    public void tampilHasilJumlah() {
        int z = getX() + getY();
        System.out.println("Hasil penjumlahan = " + z);
    }
}
