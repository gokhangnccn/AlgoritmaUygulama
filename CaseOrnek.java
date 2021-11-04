/*
Switch-case örneği.
*/
package EmineHOCA;
import java.util.Scanner;
public class CaseOrnek {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        int gun;
        String gunadi = null;
        gun=k.nextInt();
        System.out.println("Gün numarası giriniz.");
        switch(gun) {
            case 1: gunadi="Pazartesi"; break;
            case 2: gunadi="Sali"; break;
            case 3: gunadi="Carsamba"; break;
            case 4: gunadi="Persembe"; break;
            case 5: gunadi="Cuma"; break;
            case 6: gunadi="Cumartesi"; break;
            case 7: gunadi="Pazar"; break;
            default: System.out.println("Gün ismi girin");
        }
         System.out.println(gunadi);
    }
    
}
