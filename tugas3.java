import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas3
{
	
	public static void main(String[]args)
	{
		BufferedReader input= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			int angka_awal=0;
			int angka_akhir=0;
			
			System.out.print("Masukkan angka awal : ");
			angka_awal= Integer.parseInt(input.readLine());
			System.out.print("Masukkan angka akhir : ");
			angka_akhir= Integer.parseInt(input.readLine());
			
			while(angka_awal<=angka_akhir)
			{
				System.out.println(angka_awal);
				angka_awal=angka_awal+1;
			}
		}
		catch(IOException e)
		{
		}
	}
}