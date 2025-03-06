import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("****** welcome to our calc ******");
        System.out.println("1-Basic Calculator\n2-Advanced Calculator\n3-Fin Calculator");
        System.out.print("your choice :");
        int calcType= input.nextInt();
        switch(calcType){
            case 1:
                basicCalcMenu();break;
            case 2:
               advCalcMenu();break;
            case 3:
                finCalcMenu();break;
            default:
                System.out.println("please enter 1 , 2 or 3");
        }
    }
    //basic calc menu
    static void basicCalcMenu(){
        Scanner input =new Scanner(System.in);
        System.out.println("1-summation\n2-sub \n3-division\n4-multi\n5-mod");
        System.out.print("your choice :");
        int basicType= input.nextInt();
        System.out.print("please enter first number:");
        double firstNum= input.nextDouble();
        System.out.print("please enter second number:");
        double secondNum=input.nextDouble();
        double result=0.0;
        switch (basicType){
            case 1:result=summation(firstNum , secondNum);break;
            case 2:result=substraction(firstNum , secondNum);break;
            case 3:result=division(firstNum , secondNum);break;
            case 4:result=multi(firstNum , secondNum);break;
            case 5:result=mod(firstNum , secondNum);break;
            default:
                System.out.println("please enter number from 1 to 5");
        }
        System.out.println("The result is :"+result);
    }
    //adv calc menu
    static void advCalcMenu(){
        Scanner input =new Scanner(System.in);
        System.out.println("1-meter to cm\n2-cm to meter \n3-kg to gram\n4-gram to kg");
        System.out.print("your choice : ");
        int advType= input.nextInt();
        System.out.print("please enter number:");
        double number= input.nextDouble();
        double result=0.0;
        switch (advType){
            case 1:result=meterToCm(number);break;
            case 2:result=cmTOMeter(number);break;
            case 3:result=kgToGram(number);break;
            case 4:result=gramToKg(number);break;
            default:
                System.out.println("pleae enter number from 1 to 4");
        }
        System.out.println("The result is :"+result);
    }
    //fin calc menu
    static void finCalcMenu(){
        Scanner input =new Scanner(System.in);
        System.out.println("1-egp to usd\n2-usd to egp \n3-egp to SAR \n4-SAR to egp");
        System.out.print("your choice : ");
        int finType= input.nextInt();
        System.out.print("please enter value:");
        double value= input.nextDouble();
        double result=0.0;
        switch (finType){
            case 1:result=egpTOUsd(value);break;
            case 2:result=usdToEgp(value);break;
            case 3:result=egpToSar(value);break;
            case 4:result=sarToEgp(value);break;
            default:
                System.out.println("pleae enter number from 1 to 4");
        }
        System.out.println("The result is :"+result);
    }

    //basic calc
    static double summation(double firstNum , double secondNum){
        return firstNum+secondNum;
    }
    static double substraction(double firstNum , double secondNum){
        return firstNum-secondNum;
    }
    static double division(double firstNum , double secondNum){
        return firstNum/secondNum;
    }
    static double multi(double firstNum , double secondNum){
        return firstNum*secondNum;
    }
    static double mod(double firstNum , double secondNum){
        return firstNum%secondNum;
    }
    //advanced calc
    static double meterToCm(double number ){
        return number*100.0;
    }
    static double cmTOMeter(double number ){
        return number/100.0;
    }
    static double kgToGram(double number){
        return number*1000.0;
    }
    static double gramToKg(double number){
        return number/1000.0;
    }
    //fin calc
    static double egpTOUsd(double value){
        return value/50.0;
    }
    static double usdToEgp(double value){
        return value*50.0;
    }
    static double egpToSar(double value){
        return value/13.5;
    }
    static double sarToEgp(double value){
        return value*13.5;
    }
}