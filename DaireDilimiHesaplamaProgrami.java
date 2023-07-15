package CaglaSonmez;

import java.util.Scanner;
public class DaireDilimiHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yariCap;
        double merkezAci;

        System.out.print("Daire diliminin yarıçapını girin: ");
        yariCap = input.nextDouble();

        System.out.print("Daire diliminin merkez açısını girin: ");
        merkezAci = input.nextDouble();

        double pi = 3.14;
        double alan = (pi * yariCap * yariCap * merkezAci) / 360;

        System.out.println("Daire diliminin Alanı: " + alan);
    }
}
