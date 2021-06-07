package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Process
        System.out.print("Is the car silent when you turn the key? ");
        String silent = newScan.nextLine();

        if(silent.equals("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            String corroded = newScan.nextLine();

            if(corroded.equals("y"))
            {
                System.out.println("Clean and replace terminals and try again.");
                System.exit(0);
            }
            else
            {
                System.out.println("Replace the cables and try again.");
                System.exit(0);
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            String slicking = newScan.nextLine();

            if(slicking.equals("y"))
            {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                String crankUp = newScan.nextLine();

                if(crankUp.equals("y"))
                {
                    System.out.println("Check the spark plug connections");
                    System.exit(0);
                }
                else
                {
                    System.out.print("Does the engine start and then die? ");
                    String startNDie = newScan.nextLine();

                    if(startNDie.equals("y"))
                    {
                        System.out.print("Does your car have a fuel injection? ");
                        String injection = newScan.nextLine();

                        if(injection.equals("y"))
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
    }

}
