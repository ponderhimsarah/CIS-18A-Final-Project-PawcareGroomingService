//part of package PawcareAppointment
package PawcareAppointment;

import java.io.*;
import java.util.Scanner;

//class for deciding appointment date/time
public class NewAppointment
{
  public void appointmentMenu() throws java.io.IOException
  {
    //variables
    int appointmentDayChoice;
    int appointmentTimeChoice;
    //create new scanner for handling input
    Scanner sc = new Scanner(System.in);

    //do-while loop that loops until valid input is given
    do
    {
      //ask what day they'd like to schedule their appointment
      System.out.println("What day would you like to schedule your appointment?");
      System.out.println("Choose a day from this month: (Feb 1st - 28th)");

      //get user input and store in appointmentDayChoice
      appointmentDayChoice = Integer.parseInt(sc.nextLine());
    }
    while (appointmentDayChoice < 1 || appointmentDayChoice > 28);

    //do-while loop that loops until valid input is given
    do
    {
      //ask what time they'd like to schedule their appointment
      System.out.println("What time would you like to schedule your appointment?");
      System.out.println("Hours of operation are: 1 pm - 8 pm");

      //get user input and store in appointmentTimeChoice
      appointmentTimeChoice = Integer.parseInt(sc.nextLine());
    }
    while (appointmentTimeChoice > 8 || appointmentTimeChoice < 1);

    //print their appointment day + time
    System.out.println("You now have an appointment for Feb " + appointmentDayChoice + " at " + appointmentTimeChoice + " pm!");

    //create file to print receipt in later
    File file = new File("Receipt.txt");

    //record user's choice to file (Receipt.txt)
    FileWriter fileWriter = new FileWriter(file, true);

    BufferedWriter out = new BufferedWriter(fileWriter);
  
    String orderSummary = "\nAppointment for Feb " + appointmentDayChoice + " at " + appointmentTimeChoice + " pm.\n";
    String orderDate = "Order made on: " + new java.util.Date();
      
    out.write(orderSummary + orderDate);
    out.flush();
    out.close(); 
    
  }
}