package Salestax_Exercises;

import java.util.Scanner;

public class Refractor_5 {

    public static void main(String[] args) {

        plusDanskMoms();
    }

    // Omdøbt plusMoms til plusDanskMoms

    public static void plusDanskMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast Indkøbs Mængde : ");
        double indkøbsMængde = input.nextDouble();

        double moms = indkøbsMængde * 0.16;
        System.out.println(" Moms skat  " + (int) (moms * 100) / 100.0 + " Kr. ");

    }
}
