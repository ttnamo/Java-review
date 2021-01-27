package com.cyber.core;

public class SelectionStetements {

    public static void demoIfStatement(){

        String userName="Ozzy";
        if(userName.equals("ozzy")){
            System.out.println("PASS");
        }else if (userName.equals("Mike")){
            System.out.println("FAIL");
        }else {
            System.out.println("NOT VALID");
        }
    }

    public static void demoSwitchCaseStatement(){
        String userName="Mike";

        switch (userName){
            case "ozzy":
                System.out.println("PASS");
                break;
            case "Mike":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("NOT VALID");

        }
    }

}
