/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator2;

import java.util.Scanner;
/**
 *
 * @author Abdelrahman Yousry
 */

/*This is a calculator application to calculate these operations +, -, *, / */
public class Calculator2 {
    
    public static void main (String[] args)
    {
        int x , y ;
        System.out.println("Please Enter The First operand");
        Scanner in = new Scanner(System.in);
        try
        {
             x = in.nextInt();
        }
        catch(Exception e)// leh lw da5alt 7aga 8er 2l integer bytl3ly error w 2na mhandle dah f 2l try and catch
        {
            System.out.println("Enter integer values");
             x = in.nextInt();
        }
        System.out.println("Please Enter The Second operand");
        y = in.nextInt();
        System.out.println("Please Enter The Operator");
        String operator = in.next();
        int result = 0 ;
        switch(operator)
        {
            case "+":
                result = x+y;
            break;
            case "-":
                result =x-y ;
            break;
            case "x":
            case "X":
                result = x*y ;
            break ;
            case "/":
                result= x/y ;
            break ;   
        }
             System.out.println("result = "+ result);
//        String name = in.nextLine();
//        System.out.println(name);
    }
}
