import java.util.Scanner;

public class KDVTutarıHesaplama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price, total, kdvPrice, rate;

        System.out.print("Tutar Giriniz : ");
        price = sc.nextDouble();

        // KDV oranını belirleme
        if (price > 0 && price <= 500) {
            rate = 18; // %18 KDV
        } else if (price > 500) {
            rate = 8; // %8 KDV
        } else {
            rate = 0; // Geçersiz tutar için KDV oranı %0
        }

        kdvPrice = price * (rate / 100);
        total = kdvPrice + price;

        System.out.println("KDV Oranı : %" + rate);
        System.out.println("KDV Tutarı : " + kdvPrice);
        System.out.println("KDV'li Tutar : " + total);
    }
}
