package cz.zynopi.learningkava;

import java.util.Scanner;

public class Kalkulacka {
    //Kalkulačka - Java | První projekt.
    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);
        String operace;
        System.out.println("Kalkulačka | Prosím napiš jakou operaci chceš použít { < Plus, Minus, Krat, Deleno > }");
        operace = vstup.nextLine();

        switch(operace) {
            case "Plus":
                operacePlus(vstup);
            case "Minus":
                operaceMinus(vstup);
            case "Krat":
                operaceKrat(vstup);
            case "Deleno":
                operaceDeleno(vstup);
            default:
                System.out.println("Nesprávná operace");
                break;
        }
    }
    public static void operacePlus(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("Kalkulačka | Ahoj, zadej dvě hodnoty které chceš sečíst.");
        Cislo1 = vstup.nextFloat();
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 + Cislo2;
        System.out.println("Součet čísel -> " + Cislo1 + " <- a -> " + Cislo2 + " <- je: " + vypocet);
        System.exit(0);
    }
    public static void operaceMinus(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("Kalkulačka | Ahoj, zadej hodnoty které chceš od sebe odečíst.");
        Cislo1 = vstup.nextFloat();
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1  - Cislo2;
        System.out.println("Odečet čísla -> " + Cislo1 + " <- a -> " + Cislo2 + " <- je: " + vypocet);
        System.exit(0);
    }
    public static void operaceKrat(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("Kalkulačka | Ahoj, zadej dvě hodnoty které chceš vynásobit.");
        Cislo1 = vstup.nextFloat();
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 * Cislo2;
        System.out.println("Násobek čísel -> " + Cislo1 + " <- a -> " + Cislo2 + " <- je: " + vypocet);
        System.exit(0);
    }
    public static void operaceDeleno(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("Kalkulačka | Ahoj, zadej dvě hodnoty které chceš vydělit. ( ! Upozorňujeme, že dělitelem bude druhé zadané číslo ! )");
        Cislo1 = vstup.nextFloat();
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 / Cislo2;
        System.out.println("Výsledek dělení -> " + Cislo1 + " <- dělitelem -> " + Cislo2 + " <- je: " + vypocet);
        System.exit(0);
    }
}
