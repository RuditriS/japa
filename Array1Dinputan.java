/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudi 3 Setiawan
 */
import java.util.*;
public class Array1Dinputan {
    public static void main (String arg[]){
    Scanner inputan = new Scanner (System.in);
        System.out.println("Masukkan Jumlah Mahasiswa    ");
        int N = Integer.parseInt(inputan.nextLine());
        String [] namaMhs = new String[N];
        int [] nilaiMhs = new int [N];
        
    //input nilai elemen array
        for (int i=0; i<N; i++)
        {
        System.out.println("Inputkan Nama MHS ke" +(i+1)+" = ");
        namaMhs [i] = inputan.nextLine();
        System.out.println("Inputkan Nilai MHS ke" +(i+1)+" = ");
        nilaiMhs[i] = Integer.parseInt(inputan.nextLine());             
         }
        
        
        //proses pada array cari Total dan Rata2
        int total=0;
        for(int i=0; i<N; i++) {
            total=total+nilaiMhs[i];
        }
        double rata = total/N;
        
        //proses pada Array cari nilai Maksimum
        int maks = nilaiMhs[0];
        int indeks=0;
        for(int i=0; i<N; i++) {
        if (nilaiMhs [i] > maks){
        maks = nilaiMhs[i];
        indeks=i;
        }
        
    }
        
        
        
        //Cetak Nilai Element Array
        
            for (int i=0; i<N; i++){
    
            System.out.println("Nama MHS ke  "+(i+1)+"    =   " + namaMhs[i]);
            System.out.println("Nilai MHS ke  "+(i+1)+"   =   "+ nilaiMhs[i]);
    }
            System.out.println("Total Nilai    ="+total);
            System.out.println("Rata - Rata    ="+rata);
            System.out.println("Nilai Terbesar ="+maks);
   //         System.out.println("");
    
    
    

    }
}