/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakdapid_UKL;

import java.util.Scanner;

/**
 *
 * @author rafig
 */
public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("## Program Java Membuat Deret Angka ##");
        System.out.println("====================================== \n");
        
        
        int jumlah_deret,i;
        
        System.out.print(" jumalah banyak deret : ");
        jumlah_deret = input.nextInt();
        System.out.println();
        
        for (i=3; i<=jumlah_deret; i++){
            System.out.print( i + " ");
        }
        System.out.println();
    }
    
}
