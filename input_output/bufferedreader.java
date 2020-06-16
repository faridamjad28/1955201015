/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama, usia;
        
        System.out.println("masukkan nama anda :");
        nama = br.readLine();
        System.out.println("berapa usia anda");
        usia = br.readLine();
        System.out.println("nama anda adalah " +nama );
        System.out.println("usia anda adalah " +usia );
        
    }
    
}
