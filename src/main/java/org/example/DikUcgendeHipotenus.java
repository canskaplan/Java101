package org.example;

import java.util.Scanner;

public class DikUcgendeHipotenus {
    public void DikUcgenHesaplama() {

        //Değişkenlerimizi oluşturalım.
        int a, b;
        double c;

        //Kullanıcıdan verilerimizi alalım.
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        a = girdi.nextInt();
        System.out.print("2.Kenarı Giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a * a) + (b * b));
        System.out.print("Hipotenüs : " + c);

    }
}
