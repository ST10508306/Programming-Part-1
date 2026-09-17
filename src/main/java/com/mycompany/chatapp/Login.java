/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp;




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
    
    //Validation Check
    //check username
    public boolean checkUserName(String username){
        return username != null && username.contains("_") && username.length() <= 5;
        }
     //check password complexity  
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
        
        // user registering method
        public String registerUser(String username, String password, String cellPhoneNumber, String firstname, String lastname){
           
            
            if (!checkUserName(username)){
                return "Username is not correctly formatted; please ensure thet username contains an underscore and is no more than 5 characters";
                
        }
            if (!checkPasswordComplexity(password)){
                return "Password is not formatted correctly; please ensure that password has atleast 8 characters, a capital letter, a number, and a special character";
                
            }
            
            if (!checkCellPhoneNumber(cellPhoneNumber)){
                return "Cell phone number incorrectly formatted or does not contain international code";
            }
            
            this.username = username;
            this.password = password;
            this.cellPhoneNumber = cellPhoneNumber;
            this.firstname = firstname;
            this.lastname = lastname;
            
            return "Username successfully captured";
            
            
         
     } 
        // overloaded registerUser in case names are omitted
        public  String registerUser(String username, String password, String cellPhoneNumber){
            return registerUser(username, password, cellPhoneNumber, "", "");
        }
        
        //Verifying login credentials
        public boolean loginUser(String inputUsername, String inputPassword){
            return  inputUsername != null && inputUsername.equals(this.username)
                    && inputPassword != null && inputPassword.equals(this.password);
        }
        
        
        //return message of of login verification
        public String returnLoginStatus(boolean isLoggedIn){
            if (isLoggedIn){
                return "Welcome" + this.firstname + " " + this.lastname + "it is great to see you again";
            }else{
                return "Username or passwpord incorrect, please try again.";
            }
                
        }
              
}

        
        
        
        
                    
        
    
    
        
        
       
    

