import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("(1)Topla\n(2)Çıkar\n(3)Böl\n(4)Çarp\nİşlem Seçiniz: ");
        int Choice = input.nextInt();
        System.out.printf("");
        System.out.printf("1.Sayıyı Giriniz: ");
        double s1 = input.nextDouble();
        System.out.printf("2.Sayıyı Giriniz: ");
        double s2 = input.nextDouble();

        switch (Choice){
            case(1):
                System.out.printf("Sonuç: " + (s1+s2));
                break;
            case(2):
                System.out.printf("Sonuç: "+(s1-s2));
                break;
            case(3):
                System.out.printf("Sonuç: " + (s1/s2));
                break;
            case(4):
                System.out.printf("Sonuç: "+(s1*s2));
                break;
            default:
                System.out.printf("Geçersiz işlem !!!");

        }




    }
}