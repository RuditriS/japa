
import java.util.*;
	public class Login {
		public static void main(String []args)
	{
	System.out.println("=========================================================================");
	System.out.println("				Inputkan User dan Password Anda							");
	System.out.println("==========================================================================");
	
	Scanner sc=new Scanner (System.in);
	System.out.print("Silahkan masukkan UserName anda :");
	String User=sc.next();
	System.out.print("Silahkan masukkan password anda :");
	String pass=sc.next();
	
	String[] UserName={"rudi","tri","setiawan"}; 
	String[] password={"ruditri","trirudi","setiawan"};
	String nama = User;
	String pas = pass;
	int pos;
	 
		for(int i=0;i<6;i++)
		{
		if(nama.equals(UserName[i])&&pas.equals(password[i]))
			{
			pos=i;
			i=6;
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("Selamat Datang	:     "+nama);
			}
		}
	
	}
}