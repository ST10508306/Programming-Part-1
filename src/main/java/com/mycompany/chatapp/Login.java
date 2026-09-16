/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;
import java.util.Scanner;



/**
 *
 * @author lekgo
 */
public class Login {
   
    private String username;
    private String password;
    private String cellPhoneNumber;
    private String firstname;
    private String lastname;
    
    
    //check username
    public boolean checkUserName(String username){
        return username != null && username.contains("_") && username.length() <= 5;
        }
        
    
        
        
    public boolean checkPasswordComplexity(String password){
        if (password ==  null) return false;
        boolean hasMinLength = password.length() >=8;
        boolean hasCapital = password.matches(".*[A-Z].*");
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");
        
        return hasMinLength && hasCapital && hasNumber && hasSpecial;
        
    }
        
        //Checks if it matches South african international format
        public boolean checkCellPhoneNumber(String cellPhoneNumber){
            return cellPhoneNumber != null && cellPhoneNumber.matches("^\\+27\\d{9}$");
                
            }
            
      
            
            
            
        
        
        public String registerUser(String username, String password, String cellPhoneNumber){
           
            
            if (!checkUserName(username)){
                System.out.println("Username is not formatted correctly; please ensure thet username contains an underscore and is no more than five characters in length");
                
        }
            if (!checkPasswordComplexity(password)){
                System.out.println("Password is not formatted correctly; please ensure that password has atleast 8 characters, a capital letter, a number and a special character");
                
            }
            
            if (!checkCellPhoneNumber(cellPhoneNumber)){
                System.out.println("Cell phone number incorrectly formatted or does not contain international code");
            }
            
            this.username = username;
            this.password = password;
            this.cellPhoneNumber = cellPhoneNumber;
            
            return "Username successfully captured";
            
            
         
     } 
        
        public boolean loginUser(String inputUsername, String inputPassword, String storedUsername, String storedPassword){
            if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)){
                return true;
            }else{
                return false;
            }
        }
        
        
        public String returnLoginSatus(){
            if (loginUser(inputUsername) == true){
                return "Welcome <first name>, <last name> it is great to see you again";
            }
            if{ (loginUser() == false){
                return "username or password incorrect, please try again";
            }
                
            }
                
        }
            
        
        
     
}

        
        
        
        
                    
        
    
    
        
        
       
    

