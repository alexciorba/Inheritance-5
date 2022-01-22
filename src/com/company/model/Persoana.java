package com.company.model;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

public class Persoana {
 private  String nume;
 private String prenume;
 private int varsta;
 private String ocupatie;

 public Persoana(String nume,String prenume,int varsta,String ocupatia){
     // constructorul superclasei cu toti parametrii
     System.out.println("eu sunt constructoru de initializare al superclasei");
     this.nume=nume;
     this.prenume=prenume;
     this.varsta=varsta;
     this.ocupatie=ocupatia;
 }
public Persoana(String line){
     this(line.split(",")[0],line.split(",")[1],Integer.parseInt(line.split(",")[2]),line.split(",")[3]);
}
 public Persoana(Persoana persoana){

     //constructorul copiere
     System.out.println("eu sunt constructorul care copiaza variabilele");
     this.nume=persoana.nume;
     this.prenume=persoana.prenume;
     this.varsta=persoana.varsta;
     this.ocupatie=persoana.ocupatie;

 }
 public Persoana(String nume, String prenume){
     System.out.println("eu sunt constructorul cu 2 parametrii");
     this.nume=nume;
     this.prenume=prenume;
 }


    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public String getNume() {
        return this.nume;
    }

    public String getOcupatie() {
        return this.ocupatie;
    }

    public String getPrenume() {
        return this.prenume;
    }

    public String descrierePersoana(){
     String text="";
     text+="nume : " + nume + "\n";
     text+="prenume : " + prenume + "\n";
     text+="varsta : " + varsta + "\n";
     text+="ocupatia : " + ocupatie + "\n";
     return text;
    }

    public String toSave(){
     String text="";
     text+=nume + "," + prenume + "," + varsta + "," + ocupatie;
     return text;
    }


}
