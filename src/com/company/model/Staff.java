package com.company.model;

import com.company.model.Angajat;

public class Staff extends Angajat {

    private String functie;

    public Staff(String nume,String prenume,int varsta,double salar,String functie){
        super(nume,prenume,varsta,salar);
        System.out.println("Eu sunt constructorul subclasei Staff");
        this.functie=functie;
    }

    public Staff(String line){
        super(line);
        this.functie=line.split(",")[5];
    }

    public String getFunctie() {
        return functie;
    }

    public String descriereStaff(){
        String text=super.descriereAngajat();
        text+="functie" + functie + "\n";
        return text;
    }
    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + functie;
        return text;
    }


}
