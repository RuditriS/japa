
import java.util.*;

public class tugaslogin
{
	public static void main(String []args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		String[] user = new String[] {"Anang", "Yuliantoro","Aan"};
		String[] password = new String[] {"3421","1234","4321"};
		
		System.out.print("Masukkan Nama: ");
		String username = sc.nextLine();
		System.out.print("Masukkan Password: ");
		String pass = sc.nextLine();
		
		for(int i=0;i<user.length;i++) {
			if(username.equals(user[i])&&pass.equals(password[i])) {
				System.out.println("Login Success..");
				return;
			}
		}
		System.out.println("Maaf Anda Salah...");
	}
}
