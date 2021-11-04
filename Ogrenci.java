// Klavyeden girilen öğrenci sayısı kadar öğrenci bilgilerini giren program.
package EmineHOCA;
import java.util.Scanner;
public class Ogrenci {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        String isim,soyisim;
        int no;
        int sayac=0;
        System.out.println("Kaç öğrenci girilecek?: ");
        int sayi=k.nextInt();
        while (sayac<sayi) {
        System.out.println("Öğrenci bilgilerini giriniz.");
        isim=k.next(); soyisim=k.next(); no=k.nextInt();
        System.out.println("Öğrencinin adı soyadı: "+isim+" "+soyisim);
        System.out.println("Öğrencinin numarası: "+no);
            System.out.println("");
        sayac++;
        }
    }
}
