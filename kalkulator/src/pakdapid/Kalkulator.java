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
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int bil1,bil2,pil,hasil = 0;
        
        System.out.println("PROGRAM KALKULATOR SEDERHANA");
        System.out.println("1. perkalian");
        System.out.println("2. pembagian");
        System.out.println("3. penjumlahan");
        System.out.println("4. pengurangan");
        System.out.println("----------------------");
        System.out.print("bilangan 1 : ");
        bil1=input.nextInt();
        System.out.print("bilangan 2 :");
        bil2=input.nextInt();
        System.out.println("pilihan operasi :");
        pil=input.nextInt();
        
       
        switch (pil){
            
            case 1 : hasil = bil1*bil2;break;
            case 2 : hasil = bil1/bil2;break;
            case 3 : hasil = bil1-bil2;break;
            case 4 : hasil = bil1+bil2;break;
            default : System.out.println("salah memasukan pilihan");
            
        }
        
        System.out.println("hasil :" + hasil);
        
    }
    
}
