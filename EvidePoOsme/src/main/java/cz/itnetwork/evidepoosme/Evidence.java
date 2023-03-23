/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidepoosme;

import java.util.Scanner;

/**
 *
 * @author nikec
 */
public class Evidence {
        Scanner sc = new Scanner(System.in, "Windows-1250");

    // program se spustí a nabídne jednotlivé možnosti, které se budou odkazovat na Evidence.java
    String volba = "";
    Databaze databaze = new Databaze();

    public void Program() {
        while (!volba.equals("4")) {
            databaze.vytiskniMenu();

            System.out.println();
            volba = sc.nextLine();

            /*tvořím aby se na jednotlivá napsaná čísla spustili příkazy*/
            switch(volba) {
                case"1":
                    databaze.pridejNovehoPojistence();
                    break;

                case"2":
                    databaze.vypisPojistene();
                    break;

                case"3":
                    System.out.println("Zadejte jméno hledaného pojištěného: ");
                    String jmenoHledaneho = sc.nextLine();
                    jmenoHledaneho = jmenoHledaneho.substring(0, 1).toUpperCase() + jmenoHledaneho.substring(1).toLowerCase();
                    databaze.vyhledejPojisteneho(jmenoHledaneho);
                    break;

                case"4":
                    databaze.konecProgramu();
                    break;
                default:
                    System.out.println("Neplatná volba, zkuste stiknout jinou klávesu a opakujte volbu.");
            }

        }
    }    
}
