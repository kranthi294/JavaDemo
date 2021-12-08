package com.prowess.java.banking;

import java.util.Scanner;

public class BankApplication {
    
    public static void main(String[] args) {
        final String welcomeText1 = "\nWelcome to Prowess Banking Services";
        final String welcomeText2 = "Please select and action to continue";
        final String initOptText = "1: Deposit\n2: Withdrawl\n3: Initialize Account Setup\n0: Exit";
        final String depSelMsg = "You selected Deposit transaction";
        final String wrdSelMsg = "You selected Withdrawl transaction";
        final String initSelMsg = "You selected Account initialization transaction";
        final String exitSelMsg = "Thank you for banking with us, Visit again.";
        final String invalidSelMsg = "\nYou selected an invalid Option.\nPlease read the available actions and choose the correct one ..!";
        boolean exitFlag = false;
        while(true){
            System.out.println(welcomeText1);
            System.out.println(initOptText);
            System.out.println(welcomeText2);
            Scanner ipscan = new Scanner(System.in);
            int userInput = ipscan.nextInt();
            switch(userInput){
                case 1:
                    System.out.println(depSelMsg);
                    break;
                case 2:
                    System.out.println(wrdSelMsg);
                    break;
                case 3:
                    System.out.println(initSelMsg);
                    break;
                case 0:
                    System.out.println(exitSelMsg);
                    exitFlag = true;
                    break;
                default:
                    System.out.println(invalidSelMsg);
                    break;
            }
            if(exitFlag) break;
        }
    }
}
