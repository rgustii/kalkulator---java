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
public class BMI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double berat, tinggi, hasil;
        String nama;
        
        System.out.print(" nama panggilan : ");
        nama=input.next();
        System.out.print(" tinggi badan   : ");
        tinggi=input.nextInt();
        tinggi= tinggi/100;
        System.out.print(" berat badan    : ");
        berat=input.nextInt();
        hasil=berat/(tinggi*tinggi);
        System.out.println("-------------------------------");
        System.out.println(" HASIL : " + hasil);
        
        if (hasil<=18.5){
            System.out.println(" KEKURANGAN BERAT BADAN ");
        }else if (hasil >=18.5 && hasil <=24.9){
            System.out.println(" BERAT BADAN IDEAL ");
        }else if (hasil >=24.9 && hasil <=29.9){
            System.out.println(" BESOK DIET ");
        }else {
            System.out.println(" OBESITAS ");
        }
        
         
        
        
    }
    
}
