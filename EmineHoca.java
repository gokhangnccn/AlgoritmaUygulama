package EmineHOCA;
import java.util.Scanner;
public class EmineHoca{
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        /*
        int sayi;
        String kelime;
        System.out.println("Bir sayi giriniz");
        sayi=k.nextInt();
        System.out.println("Girilen sayı: "+sayi);
        System.out.println("Bir kelime giriniz");
        kelime=k.next();
        System.out.println("Girilen kelime:"+kelime);
        */
        int sayi1=10;
        int sayi2=25;
        if (sayi1<sayi2) System.out.println(sayi1+" küçüktür "+sayi2);
        else if (sayi1>sayi2) System.out.println(sayi1+" büyüktür "+sayi2);
        else System.out.println("İki sayı birbirine eşittir.");
        
        if(sayi1%2==0) System.out.println("Sayi çifttir");
        else System.out.println("Sayı tektir.");
        
        
                
        
        
    }
}