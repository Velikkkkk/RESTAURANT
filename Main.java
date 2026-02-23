import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        // Instantiate an Arraylist to hold Rest Objects
        ArrayList<Rest> restList = new ArrayList<>() ;

        // take user input
        String name = JOptionPane.showInputDialog("Enter Restaurant Name:");
        int waitTime = Integer.parseInt(JOptionPane.showInputDialog("Enter Restaurant Wait Time In Minutes(ex. 30):"));
        double rating = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Rating(ex. min:0.0; max: 5.0):"));
        double avgPrice = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Average Price (ex. 12.50):"));
        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter Restaurant Distance (ex. 5.5):"));
        String hoursOpen = JOptionPane.showInputDialog("Enter Restaurant Hours Open (ex. 09:00 - 22:00):");

        // Assign to var

        //Instatite rest obj with var

        Rest userRest = new Rest(name, waitTime,rating, avgPrice,distance,hoursOpen) ;
        System.out.println(userRest);

        //Add User's Rest Object to the Array List
        restList.add(userRest);

    }
}

