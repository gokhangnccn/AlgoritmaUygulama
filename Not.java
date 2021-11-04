/*
Klavyeden girilen 3 notun ortalamasını bulup 50 den büyük olup olmadığını bulunuz.
*/
package EmineHOCA;
import java.util.Scanner;
public class Not {
    public static void main(String[] args) {
        double a,b,c;
        Scanner k=new Scanner(System.in);
        System.out.println("Birinci notunuzu giriniz.");
        a=k.nextDouble();
        System.out.println("İkinci notunuzu giriniz.");
        b=k.nextDouble();
        System.out.println("Üçüncü notunuzu giriniz.");
        c=k.nextDouble();
        if (((a+b+c)/3)<50) System.out.println("Sınıfta kaldınız.");
        else System.out.println("Sınıfı geçtiniz.");
        System.out.println("Ortalamanız: "+((a+b+c)/3));    
    }
}
