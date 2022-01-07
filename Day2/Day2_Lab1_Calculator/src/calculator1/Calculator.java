/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator1;

/**
 *
 * @author Abdelrahman Yousry
 */

/***Simple application to calculate the basics mathematical equations**/

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer x=0,  y=0;
        try{
             x = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException e){
            System.out.println("please enter integer numbers");
            return ;
        }
       
        try{
          y = Integer.parseInt(args[2]);
        }
        catch(NumberFormatException e){
            System.out.println("please enter integer numbers");
            return ;
        }
    
        Integer result=0;
        switch (args[1])
        {
            case "+" :
            result = x + y ;   
            break ;
            case "-" :
            result = x - y ;   
            break ;
            case "x" :
            case "X" :
            result = x * y ;  
            break ;
            case "/" :
            result = x / y ;   
            break ;    
            default:
            System.out.print(" error in entering the operator");
        }
        System.out.println("result ="+ result);
    }
}
