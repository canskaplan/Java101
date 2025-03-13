package org.example;

import java.util.Scanner;

public class KullaniciGirisi {
    public void KullaniciOlusturma() {
        String userName, password, yeniSifre;
        int sifremiUnuttum;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giriş Yaptınız !");
        } else {
            System.out.println("Bilgileriniz Yanlış");
            System.out.println("Şifrenizi Sıfırlamak İster misiniz?");
            System.out.println("1-Evet");
            System.out.println("2-Hayır");
            sifremiUnuttum = input.nextInt();
            input.nextLine();
            if (sifremiUnuttum == 1) {
                System.out.print("Yeni Şifreyi Giriniz : ");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("Java123")) {
                    System.out.println("Şifre Oluşturulamadı ");
                } else {
                    System.out.println("Şifre Oluşturuldu");
                }


            }


        }

    }
}
