/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidepoosme;

/**
 *
 * @author nikec
 */
public class Pojistenec {
    private String jmeno;
    private String prijmeni;
    private String vek;
    private String telefonniCislo;

    public Pojistenec(String jmeno, String prijmeni, String vek, String telefonniCislo) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefonniCislo = telefonniCislo;
    }

    public String getJmeno() {
        return jmeno;
    }
    public String getPrijmeni() {
        return prijmeni;
    }
    public String getVek() {
        return vek;
    }
    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return jmeno + "  " + prijmeni + "  " + vek + "  " + telefonniCislo;
    }
}
