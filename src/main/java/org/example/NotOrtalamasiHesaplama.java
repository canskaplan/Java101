package org.example;

import java.util.Scanner;

public class NotOrtalamasiHesaplama {

    public void hesapOrtalamaMethodu() {

        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;
        System.out.print("Mat Notunuzu Giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;

        System.out.println(sonuc);

        String gectiKaldi = sonuc >= 60 ? "Geçtiniz" : "Kaldınız";

        System.out.println(gectiKaldi);
    }
}
