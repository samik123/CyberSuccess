package edu.cyber.success.java8;

public class LambdaWithout {
	public static void main(String[] args) {  
        int width=10;  
  
        //without lambda, FuncInterface implementation using anonymous class  
        FuncInterface d = new FuncInterface(){  
            public void display(){System.out.println("Displaying "+width);}  
        };  
        d.display();  
    }  
}
