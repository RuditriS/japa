import java.util.Vector;
import java.io.*;
import java.util.Scanner;

class uascak
{
	public static void main (String [] args) throws Exception	
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int pil = 0;
		int pil2 = 0;
		int pil3 = 0;
		int pa = 0;
		int ke = 0;
		int sn = 0;
		int ol = 0;
		int bo = 0;
		int hg = 0;
		int sa = 0;

		Vector kode = new Vector(2);
		Vector nama = new Vector(2);
		Vector alamat = new Vector(2);
		Vector nomor = new Vector(2);
		Vector jumlah = new Vector(2);
		Vector total = new Vector(2);
		Vector ket = new Vector(2);
		Vector harga = new Vector(2);


		
		do
		{
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("1. Masuk Sebagai Pelanggan");
			System.out.println("2. Masuk Sebagai admin");
			System.out.println("3. Keluar");
			System.out.println("Masukkan Pilihan Anda (1-3) : ");
			pil = Integer.parseInt(in.readLine());

			
			switch(pil)
			{ 					
				case 1:				
	System.out.println ("==================================");
	System.out.println ("               LOGIN              ");
	System.out.println ("==================================");
	
	Scanner sc=new Scanner (System.in);
	System.out.print("Masukkan User Name Anda :");
	String User=sc.next();
	System.out.print("Masukkan password Anda  :");
	String pass=sc.next();
	System.out.println("");
	String[] UserName={"ruditri"}; 
	String[] password={"setiawan"};
	String namak = User;
	String pas = pass;
	int pos;
	 
		for(int i=0;i<6;i++)
		{
		if(namak.equals(UserName[i])&&pas.equals(password[i]))
			{
			pos=i;
			i=6;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Selamat Datang :"+namak);
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("");
			}
		}
								
				do {

			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("1. Daftar Barang yang dijual");
			System.out.println("2. Pesan Barang");
			System.out.println("3. Lihat Data Pembelian");
			System.out.println("4. Hapus Pesanan");
			System.out.println("5. Keluar");
			System.out.print("Masukkan Pilihan Anda (1-5) : ");
			pil2 = Integer.parseInt(in.readLine());
			
			switch (pil2){
			case 1 :
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("              Barang                  ");
			System.out.println("=======================================================");
			System.out.println("1. Velg      :350000 ");
			System.out.println("2. Ban       :165000 ");
			System.out.println("3. Rantai    :80000");
			System.out.println("4. Tromol    :210000 ");
			System.out.println("5. Spion     :70000 ");
			System.out.println("6. Knalpot   :450000 ");
			System.out.println("7. Jari-Jari :45000 ");
			break;
			
			case 2:
			System.out.print("Berapa transaksi yang diinginkan : ");
			int p=Integer.parseInt(in.readLine());
			for(int i=0; i<p; i++)
				{
					System.out.print("Nomor Transaksi : ");
					kode.add(in.readLine());
					System.out.print("Nama Pelanggan : ");
					nama.add(in.readLine());
					System.out.print("Alamat : ");
					alamat.add(in.readLine());
					System.out.print("No. Telepon : ");
					nomor.add(in.readLine());
					System.out.println(" Suku Cadang Yang Ingin Di Beli: ");
					System.out.print("1. Velg   :");
					pa = Integer.parseInt(in.readLine());
					int harga1 = pa*350000;
	
					

					System.out.print("2. Ban    :");
					ke = Integer.parseInt(in.readLine());
					int harga2 = ke*165000;
			
				

					System.out.print("3. Rantai :");
					sn = Integer.parseInt(in.readLine());
					int harga3 = sn*80000;
				
					

					System.out.print("4. Tromol :");
					ol = Integer.parseInt(in.readLine());
					int harga4 = ol*210000;
			

					System.out.print("5. Spion  :");
					bo = Integer.parseInt(in.readLine());
					int harga5 = bo*70000;
				
	
					System.out.print("6.Knalpot :");
					hg = Integer.parseInt(in.readLine());
					int harga6 = hg*450000;
			
			
					System.out.print("7. Jari - Jari :");
					sa = Integer.parseInt(in.readLine());
					int harga7 = sa*45000;
			
					total.add(harga1+harga2+harga3+harga4+harga5+harga6+harga7);
					System.out.print("Keterangan  : ");
					ket.add(in.readLine());

					System.out.println();	
				}
			break;
			case 3:
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("\t Lihat Data Pembelian");
			System.out.println("=======================================================");
			for(int i=0;i<nama.size();i++)
				{
					System.out.println("Kode Transaksi : "+ kode.elementAt(i));
					System.out.println("Nama Barang : "+ nama.elementAt(i));
					System.out.println("Alamat : "+ alamat.elementAt(i));
					System.out.println("No. Telepon : "+ nomor.elementAt(i));
					System.out.println("DATA YANG DIBELI  : ");
					System.out.println("1. Velg           : "+pa +"\t ");
					System.out.println("2. Ban            : "+ke+"\t");
					System.out.println("3. Rantai         : "+sn+"\t");
					System.out.println("4. Tromol         : "+ol+"\t ");
					System.out.println("5. Spion          : "+bo+"\t ");
					System.out.println("6. Knalpot        : "+hg+"\t ");
					System.out.println("7. Jari-Jari      : "+sa+"\t ");
					System.out.println("");
					System.out.println("Total Bayar (Rp.) : " + total.elementAt(i));
					System.out.println("Keterangan Tambahan : "+ ket.elementAt(i));
					System.out.println();
					}
					break;
								
			case 4:
	int ada=1;
			do
			{
				System.out.println("Masukan Kode Transaksi pesanan Yang akan dihapus: ");
				int urutan = Integer.parseInt(in.readLine());
				
				for(int i=0;i<kode.size();i++)
				{
					if(kode.elementAt(i).toString().equals(urutan+""))
					{
						ada=1;
						break;
					}
					else
					{
						ada=0;
					}
				}
				if(ada==1)
				{
					kode.removeElementAt(urutan-1);
					nama.removeElementAt(urutan-1);
					alamat.removeElementAt(urutan-1);
					nomor.removeElementAt(urutan-1);
					total.removeElementAt(urutan-1);
					ket.removeElementAt(urutan-1);
				}
				else
				{
					System.out.println("Kode Transaksi tidak ditemukan");
				}
			}
			while(ada==0);
			break;
				}				
}	
			while(pil<4);	

//-=====================


			case 2:
	System.out.println ("==========================");
	System.out.println ("        LOGIN ADMIN       ");
	System.out.println ("==========================");
	
	Scanner scc=new Scanner (System.in);
	System.out.print("Masukkan Nama :");
	String Userr=scc.next();
	System.out.print("Masukkan pass :");
	String passs=scc.next();
	
	String[] UserNamee={"admin"}; 
	String[] passwordd={"admin1"};
	String nama2 = Userr;
	String pas2 = passs;
	int pos1;
	 
		for(int i=0;i<6;i++)
		{
		if(nama2.equals(UserNamee[i])&&pas2.equals(passwordd[i]))
			{
			pos1=i;
			i=6;
			System.out.println("*************************");
			System.out.println("Selamat Datang :"+nama2);
			System.out.println("*************************");
			}
		}


			do {
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("1. Input Barang");
			System.out.println("2. Hapus Barang");
			System.out.println("3. Lihat Daftar Barang");
			System.out.println("4. Keluar");
			System.out.print("Masukkan Pilihan Anda (1-5) : ");
			pil3 = Integer.parseInt(in.readLine());
			
			switch (pil3){
			case 1 :
			System.out.print("Berapa Barang Yang Akan Dimasukkan : ");
			int p=Integer.parseInt(in.readLine());
			for(int i=0; i<p; i++)
				{
			System.out.println("=======================================");
			System.out.print("Kode Barang : ");
					kode.add(in.readLine());
					System.out.print("Nama Barang : ");
					nama.add(in.readLine());
					System.out.print("Harga Barang : ");
					harga.add(in.readLine());
			System.out.println("=======================================");					
				}
			break;
			
			case 2 :
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("\t Hapus Data Pembelian");
			System.out.println("=======================================================");
			int ada=1;
			do
				{
					System.out.println("Masukan Kode Barang yang akan dihapus");
				int hb = Integer.parseInt(in.readLine());
				for(int i=0;i<nama.size();i++)
				{
					if(kode.elementAt(i).toString().equals(hb+""))
					{
						ada=1;
						break;
					}
					else
					{
						ada=0;
					}
				}
				if(ada==1)
				{
					nama.removeElementAt(hb-1);
					harga.removeElementAt(hb-1);
				}
				else
				{
					System.out.println("Kode Barang tidak ditemukan");
				}
			}
			while(ada==0);
			break;

			case 3:
			System.out.println("=======================================================");
			System.out.println("            ========  SELAMAT DATANG ========          ");
			System.out.println("                  ====  Abadi Motor ====               ");
			System.out.println("           Menjual Suku Cadang Kendaraan Anda          ");
			System.out.println("  No.Telp 081983475838 / Jl. Kenjeran No.105 Surabaya  ");
			System.out.println("=======================================================");
			System.out.println("\t LIHAT DATA PEMBELIAN");
			System.out.println("=======================================================");
			for(int i=0;i<nama.size();i++)
				{
					System.out.println("Kode Barang : "+ kode.elementAt(i));
					System.out.println("Nama Barang : "+ nama.elementAt(i));
					System.out.println("Harga Barang : "+ harga.elementAt(i));

					}
			break;


			}
			}
			while(pil<4);


}
}
	while(pil<4);	 

System.exit(0);
}

}
