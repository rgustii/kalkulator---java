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
public class sistem_kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  indomie,minyak,kopi,gula;
        indomie = 50;
        minyak = 10;
        kopi = 20;
        gula = 30;
                
        double harga_indomie, harga_minyak, harga_kopi, harga_gula;
        harga_indomie=2000;
        harga_minyak=25000;
        harga_kopi=38000;
        harga_gula=10000;
        double dibeli,banyak,total,stok;
        
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
        System.out.print("beli (input angka)  : ");
       dibeli=input.nextDouble();
        System.out.print("berapa banyak       : ");
       banyak=input.nextDouble();
       
        if (dibeli == 1){
            total = banyak * harga_indomie;
            System.out.println("TOTAL HARGA BELANJA : " + total);
            stok = indomie - banyak;
            System.out.println("SISA STOK BARANG    : " + stok);
            
        }else if (dibeli == 2){
            total = banyak * harga_minyak;
            System.out.println("TOTAL HARGA BELANJA : " + total);
            stok = minyak - banyak;
            System.out.println("SISA STOK BARANG    : " + stok);
            
        }else if (dibeli == 3){
            total = banyak * harga_kopi;
            System.out.println("TOTAL HARGA BELANJA : " + total);
            stok = kopi - banyak;
            System.out.println("SISA STOK BARANG    : " + stok);
            
        }else if (dibeli == 4){
            total = banyak * harga_gula;
            System.out.println("TOTAL HARGA BELANJA : " + total);
            stok = gula - banyak;
            System.out.println("SISA STOK BARANG    : " + stok);
            
        }else{
            System.out.println(" ERROR MASEEHHH ");
            
        }
    }   
                
    }
    

