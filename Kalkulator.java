package cz.zynopi.learningkava;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Menu();
    }
    public static void Menu() {
        Scanner vstup = new Scanner(System.in);
        String operace;
        System.out.println("-------------------------------------------------------");
        System.out.println("                【 Kalkulačka 】                ");
        System.out.println("    Ahoj, vyber si prosím matematickou operaci    ");
        System.out.println("                    - Plus                          ");
        System.out.println("                    - Minus                          ");
        System.out.println("                    - Krat                          ");
        System.out.println("                    - Deleno                          ");
        System.out.println("                    - Mocnina                          ");
        System.out.println("-------------------------------------------------------");
        operace = vstup.nextLine();

        switch(operace) {
            case "Plus":
                operacePlus(vstup);
                break;
            case "Minus":
                operaceMinus(vstup);
                break;
            case "Krat":
                operaceKrat(vstup);
                break;
            case "Deleno":
                operaceDeleno(vstup);
                break;
            case "Mocnina":
                operaceMocnina(vstup);
                break;
            default:
                System.out.println("【 Kalkulačka 】 | Nesprávná matematická operace, prosím zkuste operaci zadat znovu.");
                Menu();
        }
    }
    public static void operacePlus(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("【 Kalkulačka 】 | Prosím zadej dvě hodnoty, které budeš chtít sečíst.");
        Cislo1 = vstup.nextFloat();
        System.out.println("【 Kalkulačka 】 | " + Cislo1 + " + %x%");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 + Cislo2;
        System.out.println("【 Kalkulačka 】 | Výsledek příkladu: [ " + Cislo1 + " + " + Cislo2 + " je " + vypocet + " ]");
        vstup.nextLine();
        Menu();

    }
    public static void operaceMinus(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("【 Kalkulačka 】 | Prosím zadej dvě hodnoty, které chceš od sebe odečíst.");
        Cislo1 = vstup.nextFloat();
        System.out.println("【 Kalkulačka 】 | " + Cislo1 + " - %x%");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 - Cislo2;
        System.out.println("【 Kalkulačka 】 | Výsledek příkladu: [ " + Cislo1 + " - " + Cislo2 + " je " + vypocet + " ]");
        vstup.nextLine();
        Menu();

    }
    public static void operaceKrat(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("【 Kalkulačka 】 | Prosím zadej dvě hodnoty, které chceš vynásobit.");
        Cislo1 = vstup.nextFloat();
        System.out.println("【 Kalkulačka 】 | " + Cislo1 + " * %x%");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 * Cislo2;
        System.out.println("【 Kalkulačka 】 | Výsledek příkladu: [ " + Cislo1 + " * " + Cislo2 + " je " + vypocet + " ]");
        vstup.nextLine();
        Menu();

    }
    public static void operaceDeleno(Scanner vstup) {
        float Cislo1;
        float Cislo2;
        System.out.println("【 Kalkulačka 】 | Prosím zadej dvě hodnoty, které chceš vydělit.");
        Cislo1 = vstup.nextFloat();
        System.out.println("【 Kalkulačka 】 | " + Cislo1 + " / %x%");
        Cislo2 = vstup.nextFloat();
        float vypocet = Cislo1 / Cislo2;
        System.out.println("【 Kalkulačka 】 | Výsledek příkladu: [ " + Cislo1 + " / " + Cislo2 + " je " + vypocet + " ]");
        vstup.nextLine();
        Menu();

    }
    public static void operaceMocnina(Scanner vstup) {
        float Cislo1;
        System.out.println("【 Kalkulačka 】 | Prosím hodnotu, kterou chceš umocnit na druhou.");
        Cislo1 = vstup.nextFloat();
        float vypocet = Cislo1 * Cislo1;
        System.out.println("【 Kalkulačka 】 | Výsledek příkladu: [ " + Cislo1 + " na druhou je: " + vypocet + " ]");
        vstup.nextLine();
        Menu();
    }
}
