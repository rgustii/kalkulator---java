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
public class first_less {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, y = 0, b = 0, m = 0;
          System.out.print(" start from  : ");
             x= input.nextInt();
          System.out.print(" kelipatan   : ");
             b= input.nextInt();
          System.out.print(" dikalikan   : ");
             m= input.nextInt();
             System.out.println("=====================================");
        for (int hitungan = x ; hitungan <= 50; hitungan +=b ){
            System.out.println(" " + hitungan*m);

        }
    }
    
}
