/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidepoosme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nikec
 */
public class Databaze {
        protected Scanner sc = new Scanner(System.in, "Windows-1250");
    private List<Pojistenec> pojistenci = new ArrayList<>();
    void vytiskniMenu() {
        System.out.println("------------------------------"); // 30 pomlček
        System.out.println("Evidence pojištěných");
        System.out.println("------------------------------");
        System.out.println("Vyberte si akci: ");
        System.out.println("1 - Přidat nového pojištěného");
        System.out.println("2 - Vypsat všechny pojištěné");
        System.out.println("3 - Vyhledat pojištěného");
        System.out.println("4 - Konec");
    }

    public void pridejNovehoPojistence() {
        System.out.println("Zadejte jméno pojistěného: ");
        String jmeno = sc.nextLine();
        jmeno = jmeno.substring(0, 1).toUpperCase() + jmeno.substring(1).toLowerCase();
        System.out.println("Zadejte příjmení: ");
        String prijmeni = sc.nextLine();
        prijmeni = prijmeni.substring(0, 1).toUpperCase() + prijmeni.substring(1).toLowerCase();
        System.out.println("Zadejte telefonní číslo: ");
        String telefonniCislo = sc.nextLine();
        System.out.println("Zadejte věk: ");
        String vek = sc.nextLine();

        /*Když chci uložit daného člověka co zadá uživatel, musím vytvořit referenci na základ (v tomhle případě cz.itnetwork.zdravotni_evidence.Pojistenec)
         * a pak do něho zadat vložené hodnoty přes novou promennou - datovy typ určit*/
        Pojistenec pojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
        pojistenci.add(pojistenec);

        System.out.println();
        System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
        System.out.println();
    }

    public void vypisPojistene() {
        if(pojistenci.isEmpty()) {
            System.out.println();
            System.out.println("Nebyly nalezeny žádné záznamy.");
        } else {
            for(Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        }
        
        System.out.println();
        System.out.println("Pokračujte libovolnou klávesou...");
        System.out.println();
    }

    public void vyhledejPojisteneho(String jmenoHledaneho) {   
        System.out.println("Chcete vyhledávat i zároveň podle příjmení: [ano/ne]");
        String rozhodnuti = sc.nextLine().toLowerCase();
        // hlavní if, které se spustí pokud uživatel bude chtít vyhledávat podle příjmení
        if(!rozhodnuti.contains("ne")) {
            System.out.println("Zadejte příjmení hledaného pojištěnce: ");
            String prijmeniHledaneho = sc.nextLine();
            prijmeniHledaneho = prijmeniHledaneho.substring(0, 1).toUpperCase() + prijmeniHledaneho.substring(1).toLowerCase();
            System.out.println();
                        
                boolean search = true;
                    for (Pojistenec pojistenec : pojistenci) {
                        if(pojistenec.getJmeno().startsWith(jmenoHledaneho) && pojistenec.getPrijmeni().startsWith(prijmeniHledaneho)) {
                            System.out.println(pojistenec);
                            search = false;
                        }
                    } 
                    if(search) {
                        
                        System.out.println(jmenoHledaneho + " " + prijmeniHledaneho + " není v evidenci.");
                    }

                    System.out.println();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    System.out.println();
        
        // else v případě, že rozhodnutí je "ne", tak se vyhledává podle jména
        } else {
            boolean search = true;
            System.out.println();
            for (Pojistenec pojistenec : pojistenci) {
                if(pojistenec.getJmeno().startsWith(jmenoHledaneho)) {
                    System.out.println(pojistenec);
                    search = false;
                }
            }
            if(search) {
                
                System.out.println(jmenoHledaneho + " není v evidenci.");
            }

            System.out.println();
            System.out.println("Pokračujte libovolnou klávesou...");
            System.out.println();
            }
        }
    
    public void konecProgramu() {
        System.out.println("Děkujeme za použití Evidence pojištěnců.");
    }   

    

}

