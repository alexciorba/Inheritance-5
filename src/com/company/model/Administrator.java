package com.company.model;

public class Administrator extends Angajat {

    private String cladire;

    public Administrator(String nume,String prenume,int varsta,double salar,String cladire){

         super(nume,prenume,varsta,salar);
        this.cladire=cladire;
        super.setOcupatie("administrator");
    }

    public Administrator(String line){
        super(line);
        this.cladire=line.split(",")[5];
    }

    public String getCladire() {
        return cladire;
    }

    public String descriereAdmin(){
        String text=super.descriereAngajat();
        text+="cladirea : " + cladire + "\n";
        return text;
    }
    @Override
    public String toSave(){
        String text=super.toSave();
        text+="," + cladire;
        return text;
    }


}
