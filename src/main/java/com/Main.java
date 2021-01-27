package com;

import com.cyber.core.Loops;
import com.cyber.core.Methods;
import com.cyber.core.SelectionStetements;
import com.cyber.oop.Encapsulation.Role;
import com.cyber.oop.Encapsulation.User;
import com.cyber.oop.Inhertance.Project;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        //==== Core ===

        Methods methods=new Methods();
        methods.methodA();
        methods.methodA("blA");
       // methods.methodB(5);
        System.out.println(methods.methodB(6));
        System.out.println(methods.methodB());
        methods.methodA();
        Methods.methodC();



        //======Loops======
        Loops.demoForEach();
        Loops.demoForIterator();

        //====Selection Statement====
        SelectionStetements.demoIfStatement();
        SelectionStetements.demoSwitchCaseStatement();


        //===OOP===
        //====Encapsulation ====

        User user=new User("tig","hab",new Role(1,"admin"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());
        System.out.println(user.getRole().getId());

        //===Inhertance===
//        Project project=new Project(1,10/04/2020,2,09/07/2020,
//                "balal","first pro",
//                new User("mam","dad",new Role(5,"ths roll")),05/05/2020,
//                07/06/2020,"in progress","I hope it works");

    }
}
