import java.util.Random;
import java.util.Scanner;
public class test { 
public static void main(String[] args) {
    String userName;
    String numberPicked;
    double amountOfMoney = 10.0;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter You Name");
    userName = input.nextLine();
 do { 
    Random ran = new Random();
    int cardNum = ran.nextInt((3 - 1) + 1) + 1;
    String card = Integer.toString(cardNum);
    System.out.print("Pick a number between 1 to 3 or type 'END' to finsh playing. "); 
    numberPicked = input.nextLine();
    if (numberPicked.equals("end")){
        break;
    }
    else if(numberPicked.equals(card)){
        System.out.println("you Won");
        amountOfMoney = amountOfMoney + amountOfMoney;
    }
    else{
        System.out.println("you Lost");
    }
    
 } while (!numberPicked.equals("END")); 
    System.out.println("You Finshed playing "+userName +" $"+amountOfMoney);
    } 
}
