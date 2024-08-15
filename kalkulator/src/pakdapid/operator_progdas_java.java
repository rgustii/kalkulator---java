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
public class operator_progdas_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pulpen,buku,penggaris,spidol,tas,spulpen,sbuku,spenggaris,sspidol,stas;
        double harga_pulpen,harga_buku,harga_penggaris,harga_spidol,harga_tas; 
        harga_pulpen=3000;
        harga_buku=10000;
        harga_penggaris=4000;
        harga_spidol=9000;
        harga_tas=250000;
                
        double total, bayar, diambil, RP;
        
         System.out.println("==========================");
         System.out.println("--------STOK BARANG-------");
         System.out.println("==========================");
         System.out.print(" 1. pulpen    : ");
         spulpen=input.nextInt();
         pulpen=(int) (spulpen*harga_pulpen);
         
         System.out.print(" 2. buku      : ");
         sbuku=input.nextInt();
         buku=(int) (sbuku*harga_buku);
         
         System.out.print(" 3. penggaris : ");
         spenggaris=input.nextInt();
         penggaris=(int) (spenggaris*harga_penggaris);
         
         System.out.print(" 4. spidol    : ");
         sspidol=input.nextInt();
         spidol=(int) (sspidol*harga_spidol);
         
         System.out.print(" 4. tas       : ");
         stas=input.nextInt();
         tas=(int) (stas*harga_tas);
         
         System.out.println("==========================");
         System.out.println("-----------HARGA----------");
         System.out.println("==========================");
         System.out.println(" 1. pulpen    : 3000");
         System.out.println(" 2. buku      : 10000");
         System.out.println(" 3. penggaris : 4000");
         System.out.println(" 4. spidol    : 9000");
         System.out.println(" 5. tas       : 250000");
         
         System.out.println("==========================");
         System.out.println("-----------ASET-----------");
         System.out.println("==========================");
          RP = pulpen+buku+penggaris+spidol+tas;
          System.out.println(" TOTAL ASET   : " +RP);
          
          
         
 
        
        
        
        
        
        
    }
    
}
