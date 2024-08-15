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
public class sistem_kasir2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int indomie,minyak,kopi,gula,b_indomie,b_minyak,b_kopi,b_gula,stok1,stok2,stok3,stok4;
        indomie=50;
        minyak=10;
        kopi=20;
        gula=30;
        
        double harga_indomie,harga_minyak,harga_kopi,harga_gula;
        harga_indomie=2000;
        harga_minyak=25000;
        harga_kopi=38000;
        harga_gula=10000;
        double harga;
        
        System.out.println(" ROMO MART ");
         System.out.println("=====================================");
        System.out.println(" ----SELAMAT DATANG DI ROMO MART---- ");
        System.out.println("=====================================");
        System.out.println("   barang        stok        harga");
        System.out.println("1. indomie        50         2000 \n" 
                         + "2. minyak         10         25000 \n"
                         + "3. kopi nes       20         38000 \n"
                         + "4. gula           30         10000");
        
        System.out.println("=====================================");
        System.out.println("-----------SILAHKAN DIBELI-----------");
        System.out.println("=====================================");
        
        System.out.print("1. beli indomie  : ");
        b_indomie= input.nextInt();
        System.out.print("2. beli minyak   : ");
        b_minyak= input.nextInt();
        System.out.print("3. beli kopi     : ");
        b_kopi= input.nextInt();
        System.out.print("4. beli gula     : ");
        b_gula= input.nextInt();
        
        //penjumalahan total
        harga= b_indomie*harga_indomie+b_minyak*harga_minyak+b_kopi*harga_kopi+b_gula*harga_gula;
        System.out.println(" TOTAL BAYAR     : " + harga);
        
        stok1= indomie-b_indomie;
        stok2= minyak-b_minyak;
        stok3= kopi-b_kopi;
        stok4= gula-b_gula;
        
        System.out.println("=====================================");
        System.out.println("-----------SISA STOK BARANG----------");
        System.out.println("=====================================");
        System.out.println("1. indomie : " + stok1 + "\n" + "2. minyak  : " + stok2 + "\n" + "3. kopi    : " + stok3 + "\n" + "4. gula    : " + stok4);
        
    }
    
}
