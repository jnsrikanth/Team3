/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbertoroman.sample.test;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author karsudar
 */
public class NumberToRoman {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        System.out.println("This is a simple Decimal to roman number converter \n Please Give anumber <= 3999");
        
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if(n<=3999){
        System.out.println(intToRoman(n));
        }
        else
            System.out.println("Please enter a number less than 3999");
    }
     public static String intToRoman(int integer){
        String [] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        StringBuilder builder = new StringBuilder();
        String str = "";
        while (integer >= 1000){
            builder.append("M");
            integer -= 1000;
        }
        
        if (integer>=100){
            builder.append(hundreds[integer/100]);
            integer = integer%100;
        }
    
        if (integer>=10){
            builder.append(tens[integer/10]);
            integer = integer%10;
        }
        
        if (integer>=1){
            builder.append(ones[integer]);
        }
        
        return builder.toString();
        
    }
}
