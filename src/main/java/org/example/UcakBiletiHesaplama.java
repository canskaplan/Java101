package org.example;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public void ucakBiletiHesaplama() {
        Scanner input = new Scanner(System.in);
        int yas, yolculukTipi;
        double mesafe, normalTutar, yasIndirimOrani = 0, yolculukTipiOrani = 0;
        double yasIndirimi, indirimliTutar, gidisdonusbiletindirimi, toplamTutar;
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz : ");
        System.out.print(" 1 => Tek Yön, 2 => Gidiş Dönüş : ");
        yolculukTipi = input.nextInt();
        normalTutar = mesafe * 0.10;

        if ((mesafe < 0) && yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                yasIndirimOrani = 0.50;
            } else if (yas > 12 && yas < 24) {
                yasIndirimOrani = 0.10;
            } else if (yas > 65) {
                yasIndirimOrani = 0.30;
            }

            if (yolculukTipi == 2) {
                yolculukTipiOrani = 0.20;
            }
            yasIndirimi = normalTutar * yasIndirimOrani;
            indirimliTutar = normalTutar - yasIndirimi;
            gidisdonusbiletindirimi = indirimliTutar * yolculukTipiOrani;
            toplamTutar = (indirimliTutar - gidisdonusbiletindirimi) * yolculukTipi;

            System.out.print("Toplam Tutar : " + toplamTutar);

        }
    }
}
