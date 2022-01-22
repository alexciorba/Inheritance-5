package com.company.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersoanaTest {

    @Test

    public  void testConstructor(){
      Persoana persoana=new Persoana("Ciorba,Alex,20,it");
        assertEquals(persoana.getNume(),"Ciorba");
        assertEquals(persoana.getPrenume(),"Alex");
        assertEquals(persoana.getVarsta(),20);
        assertEquals(persoana.getOcupatie(),"it");


      Angajat angajat= new Angajat("Ciorba,Alex,20,angajat,12.24");
        assertEquals(angajat.getNume(),"Ciorba");
        assertEquals(angajat.getPrenume(),"Alex");
        assertEquals(angajat.getVarsta(),20);
        assertEquals(angajat.getOcupatie(),"angajat");
        assertEquals(angajat.getSalar(),12.24);


      Administrator administrator=new Administrator("Ciorba,Alex,20,administrator,12.24,cladire B");
        assertEquals(administrator.getNume(),"Ciorba");
        assertEquals(administrator.getPrenume(),"Alex");
        assertEquals(administrator.getVarsta(),20);
        assertEquals(administrator.getSalar(),12.24);
        assertEquals(administrator.getOcupatie(),"administrator");
        assertEquals(administrator.getCladire(),"cladire B");

      Faculty faculty=new Faculty("Ciorba,Alex,20,faculty,12.24,mate-info") ;
        assertEquals(faculty.getNume(),"Ciorba");
        assertEquals(faculty.getPrenume(),"Alex");
        assertEquals(faculty.getVarsta(),20);
        assertEquals(faculty.getSalar(),12.24);
        assertEquals(faculty.getSectie(),"mate-info");

      Staff staff=new Staff("Ciorba,Alex,20,stafff,12.24,profesor")  ;
        assertEquals(staff.getNume(),"Ciorba");
        assertEquals(staff.getPrenume(),"Alex");
        assertEquals(staff.getVarsta(),20);
        assertEquals(staff.getSalar(),12.24);
        assertEquals(staff.getFunctie(),"profesor");


      Student student=new Student("Ciorba,Alex,20,student,9")  ;
        assertEquals(student.getNume(),"Ciorba");
        assertEquals(student.getPrenume(),"Alex");
        assertEquals(student.getVarsta(),20);
        assertEquals(student.getOcupatie(),"student");
        assertEquals(student.getNota(),9);





    }


}