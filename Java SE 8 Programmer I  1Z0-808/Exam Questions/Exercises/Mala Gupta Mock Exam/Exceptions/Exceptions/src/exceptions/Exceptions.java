/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author gab12
 */
public class Exceptions {

	Exceptions e = new Exceptions();
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        	new Exceptions();
        }
        catch (StackOverflowError sofe){
        	System.out.println("StackOverflowError caught!");
        }
        finally{
        	System.out.println("Finally block executed");
        }
    }
    
}
