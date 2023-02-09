package PawcareAppointment;

import java.io.*;
import java.util.Scanner;

//interface implementation
interface Theraputic
{
  public void theraputicMenu() throws java.io.IOException;
}

interface Hygenic
{
  public void hygenicMenu() throws java.io.IOException;
}

interface Style
{
  public void styleMenu() throws java.io.IOException;
}


//class for Theraputic Services
class theraputicService implements Theraputic
{
  //theraputic menu method
  public void theraputicMenu() throws java.io.IOException 
  {
    //variables
    int theraputicChoice;
    float cost = 120.00f; //makes all theraputic services worth $120
    //create new scanner for handling input
    Scanner sc = new Scanner(System.in);
  
    //create file to print receipt in later
    File file = new File("Receipt.txt");

    //string for holding theraputic services
    String theraputicServices[] = new String[3];
    theraputicServices[0] = "Hydrotherapy Session";
    theraputicServices[1] = "Massage";
    theraputicServices[2] = "Physical Therapy Session";

    /*create new object of type arthriticPet 
    to access method arthriticQuestionaire*/
    arthriticPet checkArthritis = new arthriticPet();
    checkArthritis.arthriticQuestionaire();

    //ask user what theraputic service they wish to schedule
    System.out.println("Which theraputic service would you like to schedule?");

    //for loop to print available theraputic services from array
    for (int i = 0; i < 3; i++) 
    {
      System.out.println(i+1 + ". " + theraputicServices[i]);

    }

    //get user's input and store in theraputicChoice
    theraputicChoice = Integer.parseInt(sc.nextLine());

    //if/else if to handle the different service choices
    if (theraputicChoice == 1)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + theraputicServices[0] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Hydrotherapy Session: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close();  

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
    scheduleNewAppointment.appointmentMethod();
    }
    else if (theraputicChoice == 2)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + theraputicServices[1] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Massage: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else if (theraputicChoice == 3)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + theraputicServices[2] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Physical Therapy Session: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 
      
      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else
    {
      //to handle invalid input
      System.out.println("Invalid input detected."); 
      System.out.println("Please enter either 1, 2, or 3.");
    }
    
  }
}

//class for Hygenic Services
class hygenicService implements Hygenic
{
  //hygenic menu method
  public void hygenicMenu() throws java.io.IOException 
  {
    //variables
    int hygenicChoice;
    float cost = 30.00f; //makes all hygenic services worth $30
    //create new scanner for handling input
    Scanner sc = new Scanner(System.in);

    //create file to print receipt in later
    File file = new File("Receipt.txt");

    //string for holding hygenic services
    String hygenicServices[] = new String[3];
    hygenicServices[0] = "Bath";
    hygenicServices[1] = "Ear Cleaning";
    hygenicServices[2] = "Nail Clipping";

    //ask user what hygenic service they wish to schedule
    System.out.println("Which hygenic service would you like to schedule?");

    //for loop to print available theraputic services from array
    for (int i = 0; i < 3; i++) 
    {
      System.out.println(i+1 + ". " + hygenicServices[i]);

    }

    //get user's input and store in hygenicChoice
    hygenicChoice = Integer.parseInt(sc.nextLine());

    if (hygenicChoice == 1)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + hygenicServices[0] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Bath: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close();  

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else if (hygenicChoice == 2)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + hygenicServices[1] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Ear Cleaning: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else if (hygenicChoice == 3)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + hygenicServices[2] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Nail Clipping: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 
      
      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();

    }
    else
    {
      //to handle invalid input
      System.out.println("Invalid input detected."); 
      System.out.println("Please enter either 1, 2, or 3.");
    }
    
  }
}

//class for Style Services
class styleService implements Style
{
  //theraputic menu method
  public void styleMenu() throws java.io.IOException 
  {
    //variables
    int styleChoice;
    float cost = 90.00f; //makes all style services worth $90
    //create new scanner for handling input
    Scanner sc = new Scanner(System.in);

    //create file to print receipt in later
    File file = new File("Receipt.txt");

    //string for holding style services
    String styleServices[] = new String[3];
    styleServices[0] = "Stylized Coat Clip";
    styleServices[1] = "Nail Painting";
    styleServices[2] = "Pet Outfiting";

    //ask user what style service they wish to schedule
    System.out.println("Which style service would you like to schedule?");

    //for loop to print available style services from array
    for (int i = 0; i < 3; i++) 
    {
      System.out.println(i+1 + ". " + styleServices[i]);

    }

    //get user's input and store in styleChoice
    styleChoice = Integer.parseInt(sc.nextLine());

    if (styleChoice == 1)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + styleServices[0] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Stylized Coat Clip: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close();  

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else if (styleChoice == 2)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + styleServices[1] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Nail Painting: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 

      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();
    }
    else if (styleChoice == 3)
    {
      //display user's choice and price of service
      System.out.println("You chose: " + styleServices[2] + " : $" + cost);

      //record user's choice to file (Receipt.txt)
      FileOutputStream fos = new FileOutputStream(file);
      PrintWriter pw = new PrintWriter(fos);
  
      String orderSummary = "Pet Outfiting: $" + cost + " ";
      
      pw.write(orderSummary);
      pw.flush();
      fos.close();
      pw.close(); 
      
      //create new object of type callAppointment to access appointmentMethod
      callAppointment scheduleNewAppointment = new callAppointment();
      scheduleNewAppointment.appointmentMethod();

    }
    else
    {
      //to handle invalid input
      System.out.println("Invalid input detected."); 
      System.out.println("Please enter either 1, 2, or 3.");
    }
    
  }
}