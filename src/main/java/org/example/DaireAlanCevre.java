package org.example;

import java.util.Scanner;

public class DaireAlanCevre {
    public void daireAlanCevreHesaplama() {

         /* Dairenin Alanını ve Çevresini Hesaplayan Program
        Alan Formülü : 𝜋*r*r;
        Çevre Formülü : 2*𝜋*r; */

        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin Yarı Çapını Giriniz : ");
        r = input.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);


    }
}
