package org.example;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public void vucutKitleEndeksiHesabi() {
        Scanner input = new Scanner(System.in);
        double m;
        double kg;

        System.out.print("Lütfen boyunuzu giriniz : ");
        m = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = input.nextDouble();
        double vucutKitleEndeksi = kg / (m * m);
        System.out.println("Vücut Kitle Endeksiniz : " + vucutKitleEndeksi);
    }
}
