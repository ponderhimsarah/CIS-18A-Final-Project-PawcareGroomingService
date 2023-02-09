//part of package PawcareAppointment
package PawcareAppointment;

import java.io.*;
import java.util.Scanner;

//interface implementation
interface Arthritis
{
  public void arthriticQuestionaire() throws java.io.IOException;
}


//class PawcareGroomingService, contains main method
class PawcareGroomingService 
{

  //main method
  public static void main(String args[]) throws java.io.IOException 
  {
    //variables
    int serviceChoice;
    //create new scanner for handling input
    Scanner sc;
    sc = new Scanner(System.in);

    //display welcome message
    System.out.println("Welcome to Pawcare Grooming Service!");

    //ask user what service they would like to schedule
      System.out.println("Which service would you like to schedule?");
      System.out.println("1. Hygenic Service");
      System.out.println("2. Style Service");
      System.out.println("3. Theraputic Service");

      //get user's service choice
      serviceChoice = Integer.parseInt(sc.nextLine());
        
        //switch case to call different methods depending on the user's service choice
        switch (serviceChoice)
        {
          case 1:
            hygenicService NewHygenicMenu = new hygenicService();
            NewHygenicMenu.hygenicMenu();
             break;
              
          case 2:
            styleService NewStyleMenu = new styleService();
            NewStyleMenu.styleMenu();
            break;

          case 3:
            theraputicService NewTherapyMenu = new theraputicService();
            NewTherapyMenu.theraputicMenu();
            break;
        }

        //display thank you/exit message
        System.out.println("Thank you for using Pawcare Grooming Service! Have a wonderful day!");

      //create object of type ThankYou to access method printThankYou
      ThankYou printMessage = new ThankYou(); 
      printMessage.printThankyou();

    //close scanner
    sc.close();
  }
}


//class that extends class PawcareGroomingService and create new object of type NewAppointment to access appointmentMenu
class callAppointment extends PawcareGroomingService
{
  public static void appointmentMethod() throws java.io.IOException
  {
    NewAppointment makeAppointment = new NewAppointment();
    makeAppointment.appointmentMenu();
  }
}


//class for Arthritic Add-on
class arthriticPet
{
  public void arthriticQuestionaire() throws java.io.IOException
  {
    //create file to print receipt in later
    File file = new File("Receipt.txt");
    //variables
    boolean Arthritis;
    int arthritisChoice;
    int arthritisTreatment;
    //create new scanner for handling input
    Scanner sc = new Scanner(System.in);

    //do-while loop that loops until valid input is provided
    do
    {
      //ask user if pet has arthritis
      System.out.println("Does your pet have arthritis?");
      System.out.println("1. Yes");
      System.out.println("2. No");
      //get user input and store in arthritisChoice
      arthritisChoice = Integer.parseInt(sc.nextLine());

      //switch case that sets Arthritis boolean to true or false depending on arthritisChoice
      switch (arthritisChoice)
      {
        case 1:
          Arthritis = true;
        case 2:
          Arthritis = false;
      }  
    }
    while (arthritisChoice < 1 || arthritisChoice > 2);

    //if statement that executes if Arthritis boolean evaluates as true
    if (Arthritis = true)
    {
      //do-while loop that loops until valid input is given
      do
      {
        //ask if user would like to pay extra for arthritic treatment
        System.out.println("Would you like to pay extra for arthritic treatment?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        //store user input in arthritisTreatment
        arthritisTreatment = Integer.parseInt(sc.nextLine());

        //if statement that executes if arthritisTreatment = 1 (yes)
        if (arthritisTreatment == 1)
        {
          //record user's choice to file (Receipt.txt)
          FileOutputStream fos = new FileOutputStream(file);
          PrintWriter pw = new PrintWriter(fos);
      
          String orderSummary = "Arthritis Treatment: $15";
          
          pw.write(orderSummary);
          pw.flush();
          fos.close();
          pw.close();  
        }

        //if statement that executes if invalid input is detected in arthritisTreatment
        if (arthritisTreatment < 1 || arthritisTreatment > 2)
        {
          System.out.println("Please enter either 1 or 2.");
        }
      }
      while (arthritisTreatment < 1 || arthritisTreatment > 2);
    }
  }
}


//class that extends class PawcareGroomingService and prints a thank you message at end of the text file
class ThankYou extends PawcareGroomingService
{
  public void printThankyou() throws java.io.IOException
  {
    //creat file to print receipt in
    File file = new File("Receipt.txt");

    //print thank you message in receipt
    FileWriter fileWriter = new FileWriter(file, true);
  
    BufferedWriter out = new BufferedWriter(fileWriter);
    
    String thankyouMessage = "\n ૮ ˆﻌˆ ა Thank you for choosing Pawcare! \n"; 
    
    out.write(thankyouMessage);
    out.flush();
    out.close(); 
  }
}