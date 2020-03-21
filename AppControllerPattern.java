package com.acp;

public class AppControllerPattern {

	public AppControllerPattern() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args)  
    { 
        FrontController controllerObj = new FrontController(); 
        controllerObj.dispatchRequest("Admin"); 
        controllerObj.dispatchRequest("User"); 
    } 
}
