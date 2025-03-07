package org.example;

import java.util.Scanner;

public class KdvTutariHesaplama {

    public void KdvTutariMethodu() {

        /* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
         (Not : KDV tutarını 18% olarak alın)
          KDV'siz Fiyat = 10;
          KDV'li Fiyat = 11.8;
          KDV tutarı = 1.8; */

        Scanner input = new Scanner(System.in);
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdv'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);

    }


}
