package org.example;

import java.util.Scanner;

public class SinifiGecmeDurumu {
    public void notOrtalamasi() {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;

        if (ortalama <= 55) {
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Tebrikler Sınıf Geçtiniz");
        }
        System.out.println("Ortalamanız : " + ortalama);


    }
}
