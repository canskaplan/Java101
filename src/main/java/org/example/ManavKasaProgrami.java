package org.example;

import java.util.Scanner;

public class ManavKasaProgrami {
    public void manavKasaHesaplama() {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        System.out.print("Armut Kaç Kg? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma Kaç Kg? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates Kaç Kg? : ");
        domatesKg = input.nextDouble();
        System.out.print("Muz Kaç Kg? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan Kaç Kg? : ");
        patlicanKg = input.nextDouble();

        double toplamTutar = armutKg * armut + elmaKg * elma + domatesKg * domates + muzKg * muz + patlicanKg * patlican;
        System.out.println("Toplam Tutar : " + toplamTutar);
    }
}
