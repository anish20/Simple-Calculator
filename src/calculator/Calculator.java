/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author ANISH
 */
public class Calculator {

    public static int num1,num2,result=0;
    public int getAddition(){
    result=num1+num2;
    return result;
    }
    public int getSubstract(){
    result=num1-num2;
    return result;
    }
    public int getMultiply(){
    result=num1*num2;
    return result;
    }
    public int getDivision(){
    result=num1/num2;
    return result;
    }
    public int getAverage(){
    result=(num1+num2)/2;
    return result;
    }
    public static void main(String[] args) {
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.println("5.Average");
        Calculator cal=new Calculator();
        char key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your choice");
        key=sc.next().charAt(0);
        switch(key){
            case '1' :
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                result=cal.getAddition();
                break;
                case '2':
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                result=cal.getSubstract();
                break;
                case '3':
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                result=cal.getMultiply();
                break;
                case '4':
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                result=cal.getDivision();
                break;
                case '5':
                System.out.println("Enter First Number");
                num1=sc.nextInt();
                System.out.println("Enter Second Number");
                num2=sc.nextInt();
                result=cal.getAverage();
                break;
                default:
                System.out.println("Sorry Wrong Input..");
        }
        System.out.println("Your Result is:"+result);
        
    }
    
}
