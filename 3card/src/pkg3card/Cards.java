package pkg3card;
/**
 *
 * @author Julian A. P.
 * Last edited 1/8/2019
 */

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Cards {
    //Variables
    static String name = null;
    static double money = 10.0;
    static String numberPicked = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, here you will try to guess which card is the king. If you guessed it right you win some money, but if you lose, I take half of your money. You start with $10. I kick you out when you have less than 50 cents, because I cannot by a honeybun with anything less than 50 cents.");
        System.out.println("Enter your name.");
	name = input.nextLine();
        System.out.println("   ______     ________    ________\n" +
                           "  |  __   |  |  ____  |  | _____  |\n" +
                           "  | |_ |  |  | |_   | |  ||___  | |\n" +
                           "  |  | |  |  |   )  | |  |  __) | |\n" +
                           "  |  | |  |  |  /  /  |  | |__  < |\n" +
                           "  |  | |  |  | /  /_  |  | ___) | |\n" +
                           "  |  |_|  |  ||_____| |  ||_____| |\n" +
                           "  |_______|  |________|  |________|"); 
        //while loop to end game if money is below 50 cents
        while(money >= .5){
            //Create a random number between 1 to 3 
            Random ran = new Random();
            int cardNum = ran.nextInt((3 - 1) + 1) + 1;
            String card = Integer.toString(cardNum);
            //Gets input from user and checks for errors and checks if the number the user picked is the same as the number randomly chosen.
            System.out.println("Pick a card and find the king. Or type 'end' to finish playing.");
            String numberPicked = input.nextLine();
            //if imput is 'end'
            if(numberPicked.equals("end")){
                System.out.println("Well "+name+" you took $"+money+" from me. I hope your happy.");
                //Add high score .
                break;
                }
            //if input not one of the choices 
            else if (!numberPicked.matches("1|2|3")){
                System.out.println("─────────▄▄───────────────────▄▄──\n" +
                                   "──────────▀█───────────────────▀█─\n" +
                                   "──────────▄█───────────────────▄█─\n" +
                                   "──████████▀─────────────████████▀─\n" +
                                   "───▄█████▄───────────────▄█████▄──\n" +
                                   "──▄█▀────▀█▄────────────▄█▀───▀█▄─\n" +
                                   "──█────────█───────────█────────█─\n" +
                                   "──█────█───█───────────█────█───█─\n" +
                                   "──█────────█───────────█────────█─\n" +
                                   "───█▄────▄█─────────────█▄────▄█──\n" +
                                   "────▀█████▀──────────────▀█████▀──\n" +
                                   "──────────────────────────────────\n" +
                                   "──────────────────────────────────\n" +
                                   "───────────███████████────────────\n" +
                                   "──────────────────────────────────\n" +
                                   "──────────────────────────────────");
                System.out.println("That is not an option.");
                System.out.println("Are you trying to rob me?");
                System.out.println("Lets try this again");
            }
            //if input matches random number
            else{
                if(numberPicked.equals(card)){
                    System.out.println("You got it right...");
                    money = money / .5;
                    System.out.println("Current Amount: $"+money);
                }
                //if input does not match
                else{
                    System.out.println("Sorry the king  was under card number "+ card+".");
                    System.out.println("Thank you for some of your money.");
                    money = money * .5;
                    DecimalFormat df = new DecimalFormat("#.##");      
                    money = Double.valueOf(df.format(money));
                    System.out.println("Current Amount: $"+money);
                }
            }
        }
    }
}