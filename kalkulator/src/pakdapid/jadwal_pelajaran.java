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
public class jadwal_pelajaran {
    public static void main(String[] args) {
        int hari;
        Scanner input = new Scanner(System.in);
        System.out.println(" 1. senin \n 2. selasa \n 3. rabu \n 4. kamis \n 5. jumat");
        
        System.out.print(" pilih hari :");
        hari = input.nextInt();
        
        System.out.println("=======================================");
                if (hari == 1){
                    System.out.println(" 07.00-08.30 : olahraga"
                            + "\n 08.30-09.00 : istirahat \n 09.00-10.30 : produktif rpl \n 10.30-11.15 : fisika(IPAS)"
                            + "\n 11.15-12.45 : agama dan istirahat \n 12.45-15.00 : bahasa inggris \n 15.00-15.15 : ashar dan pulang");
                }else if (hari == 2){
                    
                    System.out.println(" 06.15-07.00 : bahasa jawa \n 07.00-08.30 : produktif rpl \n 08.30-09.00 : istirahat \n 09.00-09.45 : tahfidz \n 09.45-11.15 : informatika \n 11.15-12.45 : istirahat"
                            + "\n 12.45-15.00 : matematika \n 15.00-15.15 : ashar dan pulang");
                }else if (hari == 3){
                    System.out.println(" 06.15-08.30 : bahasa indonesia \n 08.30-09.00 : istirahat \n 09.00-10.30 : pend. pancasila (IPAS) \n 10.30-11.15 : produktif rpl \n 11.15-12.45 : istirahat"
                            + "\n 12.45-13.30 : produktif rpl \n 13.30-15.00 : informatika \n 15.00-15.15 : ashar dan pulang ");
                }else if (hari == 4){
                    System.out.println(" 06.15-08.30 : produktif rpl \n 08.30-09.00 : istirahat \n 09.00-11.15 : produktif rpl \n 11.15-12.45 : istirahat"
                            + "\n 12.45-13.30 : kimia (IPAS) \n 13.30-15.00 : seni budaya \n 15.00-15.15 : ashar dan pulang");
                }else if (hari == 5){
                    System.out.println(" 07.00-08.30 : marketing \n 08.30.09.00 : istirahat \n 09.00-10.30 : agama \n 10.30-11.15 : produktif rpl"
                            + "\n 11.15-12.45 : istirahat \n 12.45-13.30 : produktif rpl \n 13.30-15.00 : sejarah indonesia \n 15.00-15.15 : ashar dan pulang");
 
                    
                    
                    
                    
                    
                }
                    
                    
                }
           
                
        
      
    
}
