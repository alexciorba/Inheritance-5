package com.company.model;

import com.company.model.Angajat;

public class Faculty extends Angajat {
    private String sectie;

    public Faculty(String nume,String prenume, int varsta,double salar,String sectie){
        super(nume,prenume,varsta,salar);
        this.sectie=sectie;
    }

    public Faculty(String line){
        super(line);
        this.sectie=line.split(",")[5];
    }

    public String getSectie() {
        return sectie;
    }

    public String descriereFaculty(){
        String text=super.descriereAngajat();
        text+="sectia este : " + sectie;
        return text;
    }
    @Override

    public String toSave(){
        String text=super.toSave();
        text+="," + sectie;
        return  text;
    }

}
