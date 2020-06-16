/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_output;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
class JoptionPane {
    public static void main(String[] args) {
         String pil ="Y";
        do{
            int ID = 0;
            JOptionPane.showMessageDialog(null, "Daftar Menu Makanan & Minuman\n"
                    +"1. Nasi Padang\n"
                    +"2. Nasi Ayam Penyet\n"
                    +"3. Jus Jeruk\n");
            ID=Integer.parseInt(JOptionPane.showInputDialog("Silahkan input ID Menu Makanan & Minuman"));
            switch (ID) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Harga Nasi Padang Rp. 10.000,-") ;
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Harga Nasi Ayam Penyet Rp. 20.000,-") ;
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Harga Jus Jeruk Rp. 5.000,-") ;
                    break;
                default:
                    break;
            }
            pil =JOptionPane.showInputDialog("Apa anda memilih kembali menu makanan? pilih Y/T : ");
        }while(pil.equals("Y"));
        if (pil.equals("T")){
            JOptionPane.showMessageDialog(null,"Terima kasih");
        }
    }
   
}
