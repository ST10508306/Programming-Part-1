/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.chatapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lekgo
 */
public class LoginTest {
    
    public LoginTest() {
    }

    @Test
    public void checkUsername_valid(){
        Login obj = new Login();
        boolean result = obj.checkUserName("kyl_1");
        assertEquals(true, result);
                
    }
    
    @Test
    public void checkUsername_invalid(){
        Login obj = new Login();
        boolean result = obj. checkUserName("kyle!!!!!!");
        assertEquals(false , result);
    }
    
    @Test
    public void checkUsername_noUnderscore(){
        Login obj = new Login();
        boolean result = obj.checkUserName("kyle1");
        assertEquals(false, result);
    }
    
    @Test
    public void checkUsername_exactFiveCharacters(){
        Login obj = new Login ();
        boolean result = obj.checkUserName("abc_1");
        assertEquals(true, result);
    }
    @Test
    public void checkPasswordComplexitity_valid(){
        Login obj = new Login();
        boolean result = obj.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(true, result);
    }
    
    
    @Test
    public void checkPasswordComplexity_invalid(){
        Login obj = new Login();
        boolean result = obj.checkPasswordComplexity("password");
        assertEquals(false, result);
    }
    
    @Test
    public void checkPassword_noSpecialCharacter(){
        Login obj = new Login();
        boolean result = obj.checkPasswordComplexity("Password123");
        assertEquals(false, result);
        
    }
    
    @Test
    public void checkPassword_nocapital(){
        Login obj = new Login();
        Boolean result = obj.checkPasswordComplexity("password@123");
        assertEquals(false, result);
    }
    
    @Test
    public void checkCellPhoneNumber_valid(){
        Login obj = new Login();
        boolean result = obj.checkCellPhoneNumber("+27838968976");
        assertEquals(true, result);
        
                
    }
    
    @Test
    public void checkCellPhoneNumber_invalid(){
        Login obj = new Login();
        boolean result = obj.checkCellPhoneNumber("08966553");
        assertEquals(false, result);
        
    }
    
    @Test
    public void checkRegisterUser_invalidUsernameMessage(){
        Login obj = new Login();
        String expected = "Username is not correctly formatted please ensure that your username contains an underscore  and is no more than 5  characters";
        String actual = obj.registerUser("kyle123","Ch&&sec@ke99!","+27838968976");
        assertEquals(expected, actual);
    }
    
    @Test 
    public void checkRegisterUser_invalidPasswordmessage(){
        Login obj = new Login();
        String expected = "Password is not correctly formatted; please ensure that the passsword contains at least 8 characters, a capital letter, a number, and a special character";
        String actual = obj.registerUser("kyl_1", "password", "+27838968976");
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void  testLoginUser_success(){
        Login obj = new Login();
        obj.registerUser("kyl_1", "Ch&&sec@ke99!", "+278968976");
        boolean result = obj.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertTrue(result);
          
    }
    
    @Test 
    public void testReturnLoginStatus_success(){
        Login obj = new Login();
        obj.registerUser("kyl_1","Ch&&sec@ke99!","+27838968976");
        boolean isLoggedIn = obj.loginUser("kyle_1","Ch&&sec@ke99!");
        String result = obj.returnLoginStatus(isLoggedIn);
        assertTrue(result.contains("Welcome"));
    }

    
    
    
}
