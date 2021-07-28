package edu.cyber.success.java8;

public class LambdaDemo {
	public static void main(String[] args) {  
        int width=10;  
          
        //with lambda  
        FuncInterface d2=()->{ 
            System.out.println("Displaying using lambda "+width);  
        };  
        d2.display();  
    }  
}
