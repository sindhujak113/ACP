package com.acp;

public class Dispatcher  
{ 
    private UserView userView; 
    private AdminView adminView; 
     
    public Dispatcher() 
    { 
    	userView = new UserView(); 
    	adminView = new AdminView(); 
    } 
  
    public void dispatch(String request) 
    { 
        if(request.equalsIgnoreCase("User")) 
        { 
        	userView.display(); 
        } 
        else if(request.equalsIgnoreCase("Admin")) 
        { 
        	adminView.display(); 
        }     
    } 
} 
