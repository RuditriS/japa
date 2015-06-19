
/*===================================
			Tebak Koin
=====================================*/
import java.util.*;
public class TebakKoin{
public static void main (String [] args){

int angka = (int)(Math.random()*2);
System.out.println("Tekan 1 untuk angka tekan 0 untuk gambar");
Scanner hasil = new Scanner (System.in);
int jumlah = hasil.nextInt();

if (jumlah == angka){
System.out.println("Selamat Anda Benar");}
else{
System.out.println("Maaf Anda Salah");}
}
}