import java.util.Scanner;
public class tebakangka{
public static void main(String[] args){

  int hasil = (int)(Math.random() *10);
  int kesempatan = 3;
  int nilai = 0;
    System.out.println("----------------------------------------------------------------");
    System.out.println("Aku lagi galau nih, sambil mikirin angka 1 sampai 10!");
    System.out.println("----------------------------------------------------------------");
do{
    System.out.println("Coba kamu tebak berapa angkanya? kamu punya 3 kali kesempatan");
    System.out.println("----------------------------------------------------------------");
    System.out.print("Masukan Angkanya?");
    Scanner jawab = new Scanner (System.in);
    int jawaban = jawab.nextInt();

if (kesempatan > 0 ){
if ( jawaban == hasil ){
    System.out.println("WOW!!! kamu dukun ya? kok bisa tau apa yg aku pikirkan. Nilai + " + (nilai+10));
    break;}
else if ( jawaban < hasil ){
    System.out.println("Angka nya kekecilan. Nilai " + (nilai-10));}
else if ( jawaban > hasil ){
    System.out.println("Angkanya kegedean. Nilai " +(nilai-10));}

    System.out.println(""+ kesempatan + " Kesempatan Lagi");
    System.out.println("--------------------------------------------------------------");
    kesempatan--;}
else{
    System.out.println("--------------------------------------------------------------");
    System.out.println("KAMU SALAH!!KESEMPATAN HABIS. COBA LAGI YA");
    System.out.println("ANGKA YANG DIMAKSUD ADALAH " + hasil);
    System.out.println("--------------------------------------------------------------");
    break;
    }
   }
while ( kesempatan >=0 );
    }
   }
