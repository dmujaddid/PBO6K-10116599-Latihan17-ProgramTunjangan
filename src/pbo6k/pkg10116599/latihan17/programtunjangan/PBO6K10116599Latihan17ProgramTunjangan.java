/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : 
 * 
 */
public class PBO6K10116599Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double gajiPokok, tunjangan, totalGaji;
        String status;
        
        
        
        
        System.out.println("=======Program Tunjangan=======");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        Scanner scan = new Scanner(System.in);        
        gajiPokok = scan.nextDouble();
        
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        status = scan.next();
        
        //tunjangan=0.35*gajiPokok;
        //totalGaji=gajiPokok+tunjangan;    
        System.out.println();
        System.out.println("=======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t\t: Rp " +gajiPokok);
        
        if(status.equals("Menikah")){
           System.out.println("Tunjangan\t\t: Rp " +gajiPokok*0.35);
            System.out.println("Total Gaji\t\t: Rp " +(gajiPokok*0.35+gajiPokok));
        }
            else    {
            System.out.println("Tunjangan\t\t: Rp " + 0);
            System.out.println("Total Gaji\t\t: Rp " +gajiPokok);
        }
        
        
       
        
        
       
        /**
        String menikah="jn";
        double gajipokok;
        gajipokok=1000;
        System.out.println("gaji pook: " +gajipokok);
        System.out.println("tinjangnan " +(("jn".equals(menikah))?0.2*gajipokok:0));
        */
        
    }
    
}
