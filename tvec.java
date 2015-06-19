import java.util.*;
public class tvec{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		Vector notran=new Vector();
		Vector nama=new Vector();
		Vector alamat=new Vector();
		Vector notelp=new Vector();
		Vector makanan=new Vector();
		Vector total=new Vector();
		Object cek=new Object();
		int nt=0;
		while(true){
			System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
								"				Pemesanan Makanan\n"+
								"				Warung + Katering\n"+
								"				\" Warung Sadok Oplosan \"\n"+
								"				Jl. Betasudekat 111, Surabaya\n"+
								"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
								"1. Input Data Pemesanan Makanan\n"+
								"2. List Data Pemesanan Makanan\n"+
								"3. Hapus Data Pemesanan Makanan\n"+
								"4. Keluar\n"+
								"--------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("Masukkan No. Pilihan Anda (1-4) : ");
			int pil=Integer.parseInt(in.nextLine());
			System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			switch(pil){
				case 1:
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
										"				Input Data Pemesanan Makanan\n"+
										"--------------------------------------------------------------------------------------------------------------------------------------------");
					nt=nt+1;
					notran.addElement(nt);
					System.out.println("1. No. Transaksi : "+nt);
					System.out.print("2. Nama Pemesan : ");
					String nm=in.nextLine();
					nama.addElement(nm);
					System.out.print("3. Alamat : ");
					String almt=in.nextLine();
					alamat.addElement(almt);
					System.out.print("4. No. Telp : ");
					String tlp=in.nextLine();
					notelp.addElement(tlp);
					System.out.print("5. Nama Makanan : ");
					String mkn=in.nextLine();
					makanan.addElement(mkn);
					System.out.print("6. Harga Per Porsi : ");
					int hrg=Integer.parseInt(in.nextLine());
					System.out.print("7. Jumlah Makanan Yang Dipesan : ");
					int jum=Integer.parseInt(in.nextLine());
					total.addElement(jum*hrg);
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					break;
				case 2:
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
										"				List Data Pemesanan Makanan\n"+
										"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
										"No. Transaksi	Nama Pemesan	Alamat		No. Telp		Nama Makanan	Total Bayar");
					for(int i=0;i<notran.size();i++){
						System.out.println(notran.elementAt(i)+"		"+nama.elementAt(i)+"		"+alamat.elementAt(i)+"		"+notelp.elementAt(i)+"		"+makanan.elementAt(i)+"		"+total.elementAt(i));
					}
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					break;
				case 3:
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
										"				Hapus Data Pemesanan Makanan\n"+
										"--------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.print("Masukkan No. Transaksi Pemesanan Yang Akan Dihapus : ");
					int hps=Integer.parseInt(in.nextLine());
					cek=hps;
					for(int i=0;i<notran.size();i++){
						if (notran.elementAt(i)==cek){
							notran.remove(i);
							nama.remove(i);
							alamat.remove(i);
							notelp.remove(i);
							makanan.remove(i);
							total.remove(i);
						}
					}
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println(	"--------------------------------------------------------------------------------------------------------------------------------------------\n"+
										"				Anda Salah Memasukkan No.\n"+
										"--------------------------------------------------------------------------------------------------------------------------------------------");
					System.out.println();
			}
		}
	}
}