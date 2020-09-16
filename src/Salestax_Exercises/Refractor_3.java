package Salestax_Exercises;

import java.util.Scanner;


public class Refractor_3 {

    public static void main(String[] args) {
        plusMoms();

    }

    public static void plusMoms() {
        Scanner input = new Scanner(System.in);

        System.out.print("Indtast Indkøbs Mængde : ");
        double indkøbsMængde = input.nextDouble();

        double moms = indkøbsMængde * 0.25;
        System.out.println(" Moms skat  " + (int) (moms * 100) / 100.0 + " Kr. ");

    }
}


