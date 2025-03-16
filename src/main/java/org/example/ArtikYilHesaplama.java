package org.example;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public void artikYilHesabi() {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 400 == 0) {
            System.out.println( yil + " Bir Artık Yıldır");
        }else if (yil % 100 == 0) {
            System.out.println( yil + " Bir artık yıl değildir!");
        } else if (yil % 4 == 0) {
            System.out.println( yil + " Bir artık yıldır!");
        } else {
            System.out.println( yil + " Bir artık yıl değildir!");
        }
    }
}
