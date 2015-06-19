/*
 * To change this template, choose Tools | Templates
 */

/**
 *
 * @author Rudi 3 Setiawan
 */
import java.io.*;
public class daftar{
	public static void main(String[] args) throws Exception {
		 String nama="";
		 String namaa="";
		 String alamat="";
		 int berat=0;
		 String jenis="";
		 String lulus="";
                 int no=0;
            do{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
		 System.out.println("=====================================");
		 System.out.println("	Pilihan menu : ");
		 System.out.println("1.Input data anggota koperasi bebek");
		 System.out.println("2.pengumumuman hasil seleksi : ");
		 System.out.println("3.Keluar/exit");
		 System.out.println("=====================================");
		 System.out.println("");
		 int pil = Integer.parseInt(br.readLine());
		 
		 switch (pil) {
	case 1:
	
		 System.out.println("Masukkan No Anggota bebek :");
		 no = Integer.parseInt(br.readLine());
		 System.out.print("Masukkan Nama bebek : ");
		  nama = br.readLine();
	     System.out.print("Masukkan Nama Pemilik bebek : ");
		  namaa = br.readLine();
	     System.out.print("Masukkan Alamat bebek : ");
		  alamat = br.readLine();
		 System.out.print("Masukkan Berat Badan bebek :");
		 int abot = Integer.parseInt(br.readLine());
		 System.out.print("Masukkan Jenis Makanan bebek :");
		  jenis = br.readLine();
                  
		 if( berat<=10 && jenis.equalsIgnoreCase("ikan tuna"))
                 {
			lulus="dinyatakan lulus";
		 }
                 else if(berat <=20 && jenis.equalsIgnoreCase("bubur ayam"))
                 {
                     lulus="dinyatakan lulus";
                 }
                 else if(berat <=30 && jenis.equalsIgnoreCase("nasi uduk"))
                 {
                     lulus="dinyatakan lulus";
                 }
		 else 
                 {
		
                    lulus="Tidak lulus";
		 }
		
		
		
	case 2 :
		
		System.out.println("=====================================");
		 System.out.println("	pengumumuman hasil seleksi");
		 System.out.println("=====================================");
		 System.out.println("No anggota Bebek : " +  no);
		 System.out.println("Nama Bebek : "+  nama);
		 System.out.println("Berat Badan bebek  :"+  berat);
		 System.out.println("Jenis Makanan bebek : "+  jenis);
		 System.out.println("luluskah :" + lulus);
		break; 
	
		
		case 3 :
		
		System.exit(0);
	}
	
}while (true);
}
}
