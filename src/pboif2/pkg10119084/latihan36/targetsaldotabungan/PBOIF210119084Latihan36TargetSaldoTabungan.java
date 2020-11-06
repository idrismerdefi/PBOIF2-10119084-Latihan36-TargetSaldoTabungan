/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119084.latihan36.targetsaldotabungan;
/**
 * @author  
 * Nama  : Muhammad Idris Merdefi
 * Kelas : PBOIF2
 * NIM   : 10119084
 * Deskripsi Program : Program ini berisi program Target saldo tabungan
 **/

public class PBOIF210119084Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan();
        
        tabungan.setSaldo(3500000);
        tabungan.setSaldoTarget(6000000);
        tabungan.setBunga(0.08);
        
        tabungan.hitungTarget();
        
         System.out.println("Developed by : Muhammad Idris Merdefi");
    }
    
}
