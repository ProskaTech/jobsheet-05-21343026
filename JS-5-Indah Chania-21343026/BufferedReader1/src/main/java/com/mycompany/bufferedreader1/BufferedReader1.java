
package com.mycompany.bufferedreader1;

/**
 * Created by Indah Chania 21343026
 * @author Indah
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReader1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String a, b = null;
        float angka1,angka2,jumlah;
        System.out.println("Program Penjumlahan Dua Buah Bilangan");
        
        try {
            System.out.print("Masukan angka pertama: ");
            a = dataIn.readLine();
            angka1 = Float.parseFloat(a);
            
            System.out.print("Masukkan angka kedua: ");
            b = dataIn.readLine();
            angka2 = Float.parseFloat(b);
            
            jumlah = angka1+angka2;
            System.out.println("Jumlah : " +jumlah);
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
    }
}
}
