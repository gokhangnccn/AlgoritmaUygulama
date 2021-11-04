/*
 Girilen 5 kelimede sadece uzunluğu 5'ten büyük olan kelimeleri yazınız.
*/
package EmineHOCA;
import java.util.Scanner;
public class Kelime {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int sayac=1;
        while (sayac<=5) {
            System.out.println(sayac+". Kelimeyi giriniz.");;
            String a=k.next();
            if (a.length()==5) System.out.println(a+" 5 Harfli kelimedir.");
            sayac++;              
        } 
    }   
}
