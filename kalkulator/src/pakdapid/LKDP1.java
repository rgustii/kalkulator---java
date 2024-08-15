/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakdapid;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class LKDP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double dibeli,banyak,total = 0;
        double kemeja,jaket,topi;
        double h_kemeja, h_jaket, h_topi,diskon,hasil;
        diskon=800000;
        h_kemeja= 300000;
        h_jaket= 500000;
        h_topi= 100000;
        
        System.out.println("===========================");
        System.out.println("         SHC MALANG        ");
        System.out.println("===========================");
        System.out.println("    BARANG   :   HARGA ");
        System.out.println(" 1. kemaja   :   300000 IDR ");
        System.out.println(" 2. jaket    :   500000 IDR ");
        System.out.println(" 3. topi     :   100000 IDR ");
        System.out.println("===========================");
        System.out.print(" 1. KEMAJA   : ");
        kemeja=input.nextDouble();
        System.out.print(" 2. JAKET    : ");
        jaket=input.nextDouble();
        System.out.print(" 3. TOPI     : ");
        topi=input.nextDouble();
        
       total= (kemeja*h_kemeja)+(jaket*h_jaket)+(topi*h_topi);
        System.out.println(" TOTAL BARANG: " + total);
            
        System.out.println("===========================");
         if (total>=diskon){
            hasil = total - (0.2*total);
            System.out.println(" !!!DAPAT DISKON 20%!!!");
            System.out.println(" PEMBAYARAN  : " + hasil);
        }else{
        System.out.println(" MAAF TOTAL BELANJA KURANG  ");
        }
        System.out.println("===========================");
    }
    
}
 