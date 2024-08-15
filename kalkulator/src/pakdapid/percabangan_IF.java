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
public class percabangan_IF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai,hasil=0;
        
        System.out.print(" nilai didapat : ");
        nilai= input.nextInt();
        hasil=nilai;
      
        
        if (nilai>=75) {
            System.out.println(" KAMU LULUS ");
        }
        System.out.println(" terima kasih ");
        
    }
    
}
