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
public class materi_ifelse {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int kkm,nilai;
        
        System.out.print(" nilai kkm     : ");
        kkm= input.nextInt();
        System.out.print(" nilai didapat : ");
        nilai= input.nextInt();
        
        if (nilai>=kkm){
            System.out.println(" TUMBEN BAGUS ");
        }else{
            System.out.println(" HA MAMPUS MAMAK MARAH");
        }
                
        
        
    }
    
}
