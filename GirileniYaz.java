/*
Sayi ve kelime girdisini ekrana yazdıran program.
*/
package EmineHOCA;
import java.util.Scanner;
public class GirileniYaz{
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayi;
        String kelime;
        System.out.println("Bir sayi giriniz");
        sayi=k.nextInt();
        System.out.println("Girilen sayı: "+sayi);
        System.out.println("Bir kelime giriniz");
        kelime=k.next();
        System.out.println("Girilen kelime:"+kelime);
    }
}