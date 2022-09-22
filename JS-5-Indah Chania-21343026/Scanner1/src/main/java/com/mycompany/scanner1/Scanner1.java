
package com.mycompany.scanner1;

import java.util.Scanner;

/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class Scanner1 {

    private static String nilai;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukan nama lengkap: ");
        String nama = in.nextLine();
        
        System.out.print("Masukan NIM: ");
        int NIM = in.nextInt();
        
        System.out.println("\nNama : " + nama +
                           "\nNim : " + NIM +
                           "\nNilai : " + nilai);
    }
}
