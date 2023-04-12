import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar = input.nextDouble();

        if (tutar <= 1000) {
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz fiyat : " + tutar);
            System.out.println("KDV'li fiyat : " + kdvliTutar);
            System.out.println("Kdv tutarı : " + kdvTutar);

        }else if (tutar > 1000) {
            kdvOran=0.08;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz fiyat : " + tutar);
            System.out.println("KDV'li fiyat : " + kdvliTutar);
            System.out.println("Kdv tutarı : " + kdvTutar);
        }
    }
}