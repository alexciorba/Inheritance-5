package com.company.controller;

import com.company.model.Angajat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    @Test

    public void test1(){
        Controller controller=new Controller();
        assertEquals(1,controller.verificareAdministartori());

    }

    public void test2(){
//        Controller controller=new Controller();
//        Angajat angajat=new Angajat("Ionel,Mircea,22,23.12");
//        controller.
    }

}