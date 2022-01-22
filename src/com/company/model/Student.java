package com.company.model;

import com.company.model.Persoana;

public class Student extends Persoana {

    private int nota;

public Student(String nume,String prenume,int varsta,int nota){
    super(nume,prenume,varsta,"student");
    System.out.println("eu sunt constructorul subclasei student");
    this.nota=nota;
}
public Student(String line){
    super(line);
    this.nota=Integer.parseInt(line.split(",")[4]);
}

    public int getNota() {
        return nota;
    }

    public String descriereStudent(){
    String text=super.descrierePersoana();
    text+="nota : " + nota + "\n";
    return text;
}

@Override
    public String toSave(){
    String text=super.toSave();
    text+="," + nota;
    return text;
}
}
