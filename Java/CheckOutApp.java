import java.util.Scanner;
import java.util.ArrayList;
public class CheckOutApp{
  public static void main(String[] args){

addNew();
backMenu();

}
  public static void addNew(){

  Scanner scanner = new Scanner(System.in);
  System.out.println("Dear customer what's your name: ");
  String name = scanner.nextLine();

}
  public static void backMenu() {

  Scanner scanner = new Scanner(System.in);
  ArrayList<String> input = new ArrayList<>();
  System.out.println("What do you want to buy");
  String product = scanner.next();

  input.add(product);
  System.out.println(input);


  System.out.println("How many pieces");
  String pieces = scanner.next();

  input.add(pieces);
  System.out.println(input);


   
  System.out.println("""
   Add more items?

  1. Yes
  2. No
        """);
  System.out.println("Select Option");
  int option = scanner.nextInt();

   switch(option){
    case 1:
	   backMenu();
	   break;

    case 2:
	   System.out.println("Enter your full name: ");
	   String secondName = scanner.next();

	   System.out.println("Customer Name: " + secondName+" LEO KASTRO STORES");
	   System.out.println("""
        You have been given a discount of 10%
	MAIN BRANCH
	LOCATION: 11, ISAAC ADENUGA STREET, AGILITY, MILE12  LAGOS.
	TEL: 03293828343
	Date: 28-AUG-25 8:48:11pm

	==============================================================
					"ITEM","QTY","PRICE","TOTAL(NGN)		
	  """);





   
}


















}















}