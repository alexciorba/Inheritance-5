package com.company;

import com.company.model.*;

public class Main {

    public static void main(String[] args) {
//	    Angajat angajat=new Angajat("Ciorba","Alex",20,2500);
//
//
//        System.out.println(angajat.descrierePersoana());
//        System.out.println(angajat.descriereAngajat());
//
//
//   Student student=new Student("Popescu","Andrei",22,8);
//        System.out.println(student.descriereStudent());
//        System.out.println(student.descrierePersoana());
//
//        Staff staff=new Staff("Marinel","Ion",23,2400,"ghiseu biblioteca");
//        System.out.println(staff.descriereStaff());
//
//        Faculty faculty=new Faculty("Ana","Maria",33,2000,"mate-info");
//        System.out.println(faculty.descriereFaculty());
//        System.out.println(faculty.returnareTextAngajat());
//
//        Administrator administrator=new Administrator("Ionescu","Alin",33,2200,"cladirea B");
//        System.out.println(administrator.descriereAdmin());
//
//
//        Persoana persoana=student;
//
//
//        System.out.println(persoana.descrierePersoana());//a access
//



        Persoana x=new Angajat("Ciorba","Alex",20,2500);

        System.out.println(x.toSave());

        x= new Persoana("Ciorba","Alex",20,"ceva");


        System.out.println(x.toSave());






    }




}
