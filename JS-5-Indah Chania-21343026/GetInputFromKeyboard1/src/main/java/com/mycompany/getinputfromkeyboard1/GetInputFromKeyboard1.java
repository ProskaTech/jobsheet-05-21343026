package com.mycompany.getinputfromkeyboard1;

/**
 * Created by Indah Chania 21343026
 * @author Indah 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class GetInputFromKeyboard1 {

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        String name = "", hobby="";
        
        try {
            System.out.print("Nama Anda:");
            name = dataIn.readLine();
            System.out.print("Hobi Anda: ");
            hobby = dataIn.readLine();
        }
        
        catch (IOException e) {
            System.out.println("gagal membaca keyboard");
        }
        
        System.out.println("Jadi Hobi Anda " +hobby+". Hobi yang bagus "+name);
    }
}
