import java.io.*;

class coba1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("=====================================================");
		System.out.println(" ");
		System.out.println("\t  Input Biodata Anggota Koperasi ");
		System.out.println("\t \t \" Makmur Jaya\" ");
		System.out.println("\t Jln. Trenggolo 28,Surabaya ");
		System.out.println(" ");
		System.out.println("=====================================================");
		

		
		System.out.print ( " Nama Depan : " ) ;
		String nama1 = br.readLine();

		System.out.print ( " Nama Belakang : " ) ;
		String nama2 = br.readLine();
		
		System.out.print ( " Alamat : " ) ;
		String nama3 = br.readLine();
		
		System.out.print ( " Kota Lahir :" ) ;
		String nama4 = br.readLine();
		
		System.out.print ( " Tanggal Lahir :" ) ;
		String nama5 = br.readLine();
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("=====================================================");
		System.out.println(" ");
		System.out.println("\t  Output Biodata Anggota Koperasi ");
		System.out.println("\t \t \" Makmur Jaya\" ");
		System.out.println("\t Jln. Trenggolo 28,Surabaya ");
		System.out.println(" ");
		System.out.println("=====================================================");
		
		System.out.println ( " Nama Lengkap : " +nama1+" "+nama2);
		System.out.println ( " Email : " + nama1+"@makmur.com");
		System.out.println ( " Alamat : " +nama3);
		System.out.println ( " Tempat/Tanggal Lahir : " +nama4+"/"+nama5);
	
	
	
		}
		}