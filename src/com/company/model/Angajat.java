package com.company.model;


public class Angajat extends Persoana {

    private double salar;

    public Angajat(String nume, String prenume, int varsta, double salar ){
        super(nume,prenume,varsta,"angajat");
        System.out.println("Eu sunt constructorul subclasei");
        this.salar=salar;
    }


    public  Angajat(String text){
        super(text);
        this.salar=Double.parseDouble( text.split(",")[4]);
    }

    public String descriereAngajat(){
        String text=super.descrierePersoana();
        text+="salar : " + salar + "\n";
        return text;
    }

    public String returnareTextAngajat(){
        String text="";
        text+="Eu sunt angajatul : " ;
        text+= super.getNume();
        return text;
    }


    public double getSalar() {
        return salar;
    }

    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + salar;
        return text;
    }
}
