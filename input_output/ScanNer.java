/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class ScanNer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        String nama;
        
        System.out.println("siapa namamu : ");
        nama = input.nextLine();
        
        System.out.println("senang berkenalan denganmu " +nama);
 }

}