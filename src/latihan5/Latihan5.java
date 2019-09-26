/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author dwisr
 * NAMA      : RISKI DWI SABARIYANTO
 * KELAS     : IF -1 
 * NIM       : 10118026
 * Deskripsi : Program untuk belajar variabel Global
 * 
 */
public class Latihan5 {

    int jumlahKambing = 99;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing(){
        System.out.println("Jumlah Kambing "+jumlahKambing);
    }
    
     public void tambahKambing(){
        jumlahKambing = jumlahKambing + 5;
         System.out.println("umlah Kambing stelah ditambah = " + jumlahKambing);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Latihan5 kambingSusu = new Latihan5();
        
        //menampilkan jumlah kambing yang ada saat program pertama x bejalan
        kambingSusu.getJumlahKambing();
        
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
