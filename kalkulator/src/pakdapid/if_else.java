/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pakdapid;

import java.util.Scanner;

/**100.000
 *
 * @author rafig
 */
public class if_else {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        double harga, duid;
        System.out.print("harga : ");
        duid = input.nextDouble();
        
        System.out.print("berapa duid ente : ");
        harga = input.nextDouble();
        if (harga >= duid){
            System.out.println("alhamdullilah duid anda cukup");
        }else{
            System.out.println("nabung dulu dek");
        }
        
        
    }
    
}
