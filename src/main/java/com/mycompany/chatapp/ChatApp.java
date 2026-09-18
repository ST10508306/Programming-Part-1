/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp;
import java.util.Scanner;

/**
 *
 * @author lekgo
 */
public class ChatApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login obj = new Login();
        
        //prompting the user to enter their details
        System.out.println("Hi there, enter username");
        String username = input.nextLine();
        
        System.out.println("Hi there, please enter password");
        String password = input.nextLine();
        
        System.out.println("Hi there, please enter cellphone number");
        String cellPhoneNumber = input.nextLine();
        
        System.out.println("Hi ther, please enter firstname");
        String firstname = input.nextLine();
        
        System.out.println("hi there, pease enter lastname");
        String lastname = input.nextLine();
        
        String messageResult = obj.registerUser(username,password, cellPhoneNumber,firstname, lastname);
        
        System.out.println(messageResult);
        
        
        //decision when user data is successfully captured
        if (messageResult.equals("Username successfully captured.")){
            System.out.println("\n--- LOGIN Attempts ---");
            System.out.println("Enter username:");
            String loginUser = input.nextLine();
            
            System.out.println("Enter password:");
            String loginPass = input.nextLine();
            
            boolean isLoggedIn = obj.loginUser(loginUser, loginPass);
            System.out.println(obj.returnLoginStatus(isLoggedIn));
        }
        
        input.close();
        
        
    }
}
