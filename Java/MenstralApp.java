import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstralApp{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Tayo Menstral App");

    System.out.println("Enter start date in full: ");
    String start = input.nextLine();

    System.out.println("Enter end date in full: ");
    String end = input.nextLine();


    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    LocalDate startDate = LocalDate.parse(start,format);
    LocalDate endDate = LocalDate.parse(end , format );


    LocalDate safePeriod = endDate.plusDays(1);
    LocalDate endSafePeriod = endDate.plusDays(6);
    
     System.out.println("Your start date is on the: " + startDate);
     System.out.println("Your end date is on the: " + endDate);
     System.out.println("Your safe date starts on the: " + safePeriod + " " + "till" + " " + endSafePeriod);
    









}


}