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
public class SWITCHCASE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PR;
        
        System.out.println("-------------------------------------");
        System.out.println(" PENGERTIAN TRASMISI MOBIL MATIC ");
        System.out.println("-------------------------------------");
        System.out.println(" 1. P \n 2. R \n 3. N \n 4. D \n 5. 2 \n 6. L");
        System.out.print(" PILIH ANGKA : ");
        PR=input.nextInt();
        
        switch (PR){
            case 1 :
                System.out.println(" P, artinya adalah Parking atau parkir ");
                break;
            case 2 :
                System.out.println(" R artinya Reverse atau gigi mundur ");
                break;
            case 3 : 
                System.out.println(" N adalah Neutral atau netral ");
                break;
            case 4 : 
                System.out.println(" D adalah singkatan dari Drive atau jalan ");
                break;
            case 5 :
                System.out.println(" 2, menahan gigi tertinggi di gigi 2 ");
                break;
            case 6 : 
                System.out.println(" L menahan gigi tertinggi di gigi 1 ");
                break;
            default : 
                System.out.println(" tidak tersedia ");
                
        }
    }
    
}
