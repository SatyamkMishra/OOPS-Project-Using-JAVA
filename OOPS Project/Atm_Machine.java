//package Atm_Machine;
import java.util.*;
class ATM{

    float Balance;
    int PIN = 9958;


    public void checkpin(){
        System.out.println("Enter your Pin : ");
        Scanner sc = new Scanner(System.in);
        int enterpin = sc.nextInt();

        if(enterpin == PIN){
            menu();
        }else{
            System.out.println("Enter a valid pin");
            menu();
        }
    }

    public void menu(){
        System.out.println("Enter your Choice : ");
        System.out.println("1. Check A/C Balence ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);

        int option = sc.nextInt();

        if(option == 1){
            checkBal();
        }else if(option == 2){
            withdrawMoney();
        }else if(option == 3){
            depositMoney();
        }else if(option == 4){
             return;
        }else{
            System.out.println("Enter a valid choise");
        }

    }

    public void checkBal(){
        System.out.println("Balence : " + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("Enter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount>Balance){
            System.out.println("Insufficient Balence");
        }else{
            Balance -= amount;
            System.out.println("Money Withdrawl sucessfull");
        }

        menu();
    }

    public void depositMoney(){
        System.out.println("Enter the amount : ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();

        Balance += amount;

        System.out.println("Sucessfully deposited");
        menu();
    }
}

public class Atm_Machine{
    public static void main(String[] args) {
       ATM  obj = new ATM(); 
       obj.checkpin();
    }
}