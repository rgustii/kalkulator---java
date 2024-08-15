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
public class bangun_datar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int BD;
        double p,l,s,a,t,r,hasil = 0;
        
        System.out.print("pilih bangun datar : \n 1. persegi \n 2. persegi panjang \n 3. segitiga \n 4. lingkaran \n masukkan angka :");
        BD = scan.nextInt();
        
        switch (BD) {
            case 1:
                System.out.print("masukkan sisi :");
                s = scan.nextInt();
                hasil = s*s;
                System.out.print("luas persegi" + hasil + "cm");
                break;
            case 2:
                System.out.print("masukkan panjang :");
                p = scan.nextInt();
                System.out.print("masukkan lebar :");
                l = scan.nextInt();
                hasil = p*l;
                System.out.print("luas persegi panjang" + hasil + "cm");
                break;
            case 3:
                System.out.println("masukkan alas :");
                a = scan.nextInt();
                System.out.println("masukkan tinggi :");
                t = scan.nextInt();
                hasil = 0.5*a*t;
                System.out.println("luas segitiga" + hasil + "cm");
                break;
            case 4:
                System.out.println("masukkan jari-jari :");
                r = scan.nextInt();
                hasil = 3.14*r*r;
                System.out.println("luas lingkaran" + hasil + "cm");
            default: System.out.println("yasudah gini");
                break;
        }
        
        System.out.println("hasil :" + hasil);
    }
    
    
}
