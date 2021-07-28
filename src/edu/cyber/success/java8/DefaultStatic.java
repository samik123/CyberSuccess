package edu.cyber.success.java8;

public class DefaultStatic implements MyInterface{
	
	// implementing abstract method
    public void existingMethod(String str){           
        System.out.println("String is: "+str);  
    }  
    public static void main(String[] args) {  
    	DefaultStatic obj = new DefaultStatic();
    	
    	//calling the default method of interface
        obj.defaultMethod();    
        
        //calling the static method of interface
        MyInterface.staticMethod();
        
        //calling the abstract method of interface
        obj.existingMethod("Java 8 Deafalut Static Methods are Easy"); 
  
    }  
}