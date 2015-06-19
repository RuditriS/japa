/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rudi 3 Setiawan
 */
 import java.io.*;
public class pilihmenuswicth {

	public static void main (String [] argv) throws Exception
	{
            int hargasoto = 10000;
            int hargarawon =12000;
            int PS=0;
            int PR= 0;
            int HargaTotalS;
            int HargaTotalR;
        	do{    
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("===============================");
			System.out.println("      MENU WARUNG OM.KARYO");
			System.out.println("===============================");
			System.out.println("       1. Soto Ayam           ");
			System.out.println("       2. rawon               ");
                        System.out.println("       3. Total Pembayaran               ");
			System.out.println("       4. Keluar");
			System.out.println(" ===============================");
			System.out.print(" Masukkan Pilihanmu Cok      : ");
			int pil = Integer.parseInt(x.readLine());
			
			switch(pil)
			{
				case 1:
				System.out.println("Pilihan anda adalah Soto ayam  ");
				System.out.println("Harga  Perporsi    = "+hargasoto);
                                System.out.print(" Masukkan Jumlah Pesanan anda   : ");
                                    PR = Integer.parseInt (x.readLine());
                                    System.out.println("");
                                break;
				case 2:
				System.out.println("Pilihan anda adalah Soto ayam  ");
				System.out.println("Harga  Perporsi    = "+hargarawon);
                                System.out.print(" Masukkan Jumlah Pesanan anda   : ");
                                    PR = Integer.parseInt (x.readLine());
                                    System.out.println("");
                                break;

				case 3:
                                    System.out.println("TOTAL PEMBAYARAN");
                                    System.out.println("======================");
                                    HargaTotalS = hargasoto * PS;
                                    HargaTotalR = hargarawon * PR;
                                    System.out.println("Total Pembayaran Soto = "+HargaTotalS);
                                    System.out.println("Total Pembayaran Rawon = "+HargaTotalR);
                                    
                                    System.out.println("");
                               break;
                                    
                                    
                                    
                                    
                                    
                                case 4:    
				System.exit(0);
				break;
				
				default:
				System.out.println("Pilihan Menu Tidak Ada");
				break;
			}
		}
		while(true);
	}
}
   