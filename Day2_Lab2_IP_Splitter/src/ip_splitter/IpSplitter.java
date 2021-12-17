/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ip_splitter;
import java.util.Scanner;
//import java.util.StringTokenizer ;
/**
 *
 * @author Abdelrahman Yousry
 */

/****Splitting the IP address entered by the user according to the dot and the printing it****/
public class IpSplitter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        // TODO code application logic here
        System.out.println("Please enter your IP address:");
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String[] digits = str.split("\\.");
        System.out.println("Your IP address is :");
        for(int i =0;i<digits.length;i++)
        {
            System.out.println(digits[i]);
        }      
      /****Another Solution by getting the args from the main method***/  
//        String s = args[0]; 
//        StringTokenizer st = new StringTokenizer(s,".");  
//        while (st.hasMoreTokens()) {  
//        System.out.println(st.nextToken());  
        
    }
    
}
