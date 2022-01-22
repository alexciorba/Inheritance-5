package com.company.controller;

import com.company.model.*;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private ArrayList<Persoana> listaPersoane;

    public Controller(){
        listaPersoane=new ArrayList<>();
        load();

    }

    public void load() {
        try {
            File file = new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\initiere\\src\\com\\company\\source\\persons.txt");
            Scanner scanner=new Scanner(file);
            while (scanner.hasNextLine()){
                String linie=scanner.nextLine();
                switch (linie.split(",")[3]){
                    case "angajat":this.listaPersoane.add(new Angajat(linie));
                    break;
                    case  "administrator" : this.listaPersoane.add(new Administrator(linie));
                    break;
                    case "faculty" : this.listaPersoane.add(new Faculty(linie));
                    break;
                    case "staff" : this.listaPersoane.add(new Staff(linie));
                    break;
                    case "student" : this.listaPersoane.add(new Student(linie));
                }
            }

        }catch (Exception e){

        }
    }



    //todo functie ce ne returneaza numarul de angajati
    public int verificareAdministartori(){
        int cont=0;
        for (Persoana persoana : listaPersoane){
            if(persoana instanceof Administrator){
                cont++;
            }
        }
        return cont;
    }

    public void addPersoana(Persoana persoana){
        listaPersoane.add(persoana);
    }

    public String toSavePersoana(){
        String text="";
        for(Persoana persoana :listaPersoane){
            text+=persoana.toSave()+"\n";
        }
        return text;
    }

    public void savePersoana(){
        File file=new File("C:\\Users\\Alex 1\\Desktop\\Full Stack Java\\OOP\\Mostenirea\\initiere\\src\\com\\company\\source\\persons.txt");
        try{
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter=new PrintWriter(file);
            printWriter.print(toSavePersoana());
            printWriter.close();
        }catch (Exception e){

        }
    }


}
