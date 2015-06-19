/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudi 3 Setiawan
 */
public class Array_For {
 
    
        public static void main (String arg[]){
    
    int [] nilaiMhs = new int[5];
    String[] namaMhs = new String[5];
    
   namaMhs[0] = "iksan";
   namaMhs[1] = "tole";
   namaMhs[2] = "andi";
   namaMhs[3] = "odang";
   namaMhs[4] = "paijo";
    
    nilaiMhs[0] = 80;
    nilaiMhs[1] = 90;
    nilaiMhs[2] = 85;
    nilaiMhs[3] = 70;
    nilaiMhs[4] = 86;
    
    for (int i=0; i<5; i++){
    
            System.out.println("Nama MHS ke  "+(i+1)+"    =   " + namaMhs[i]);
            System.out.println("Nilai MHS ke  "+(i+1)+"   =   "+ nilaiMhs[i]);
    }
        }
    
    
}
