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
public class materi_string {
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      String nama,kelas,alamat;
      int umur;
      
      
      
        System.out.println(" DATA DIRI ");
        System.out.println("nama siswa : ");
        nama = input.nextLine();
        System.out.println("kelas : ");
        kelas = input.nextLine();
        System.out.println("alamat : ");
        alamat = input.nextLine();
        System.out.println("umur : ");
        umur = input.nextInt();
        
        System.out.println("nama : " + nama);
        System.out.println("kelas : " + kelas);
        System.out.println("alamat : " + alamat );
        System.out.println("umur : " + umur);
        
        if (umur >= 20){
            System.out.println("YAHH DAH TUA BENTAR LAGI KOIT");
        }else{ 
            System.out.println("HAHAHA BOCIL CEMAS KO DEKKK BEK BEK BEK");
            
        }
        
        
        
    }
    
}
