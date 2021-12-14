package src;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlightTicket {

    private Passenger passenger;

    public FlightTicket(Passenger passenger) {
        this.passenger = passenger;
    }


    public void showFrame() {

        JLabel lastLabel4 = new JLabel("");
        lastLabel4.setBounds(0, 0, 0, 0);
        lastLabel4.setFont(new Font("Serif", Font.BOLD, 20));


        if(passenger.getDeparture().equalsIgnoreCase(passenger.getDestination())) {
            JOptionPane.showMessageDialog(lastLabel4, "Cannot select the same location!");



        }
        else if(passenger.getDeparture().equalsIgnoreCase(" ")||passenger.getDestination().equalsIgnoreCase(" ")||
                passenger.getFirstName().equalsIgnoreCase(" ")||passenger.getLastname().equalsIgnoreCase(" ")||
                passenger.getBookingDate().equalsIgnoreCase(" ")||passenger.getBookingTime().equalsIgnoreCase(" ")||
                passenger.getFlightClass().equalsIgnoreCase(" ")||passenger.getMeal().equalsIgnoreCase(" ")
        ){
            JOptionPane.showMessageDialog(lastLabel4, "field cannot be left blank!");
        }


        else {
            JFrame frame = new JFrame();

            frame.setSize(400, 900);
            frame.setVisible(true);
            JPanel panel = new JPanel();
            frame.add(panel);
            panel.setLayout(null);
            PrintWriter wr = null;
            try {

                wr = new PrintWriter("BookingDetail.txt");


                wr.write("First name: "+passenger.getFirstName());
                wr.write("\nLast name: "+passenger.getLastname());
                wr.write("\nFrom: "+passenger.getDeparture());
                wr.write("\nTo: "+passenger.getDestination());
                wr.write("\nAdults: "+passenger.getNoOfAdults());
                wr.write("\nChildren: "+passenger.getNoOfChildren());
                wr.write("\nBooking date: "+passenger.getBookingDate());
                wr.write("\nBook time: "+passenger.getBookingTime());
                wr.write("\nClass: "+passenger.getFlightClass());
                wr.write("\nMeal: "+passenger.getMeal());
                wr.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


            JLabel ticketLabel = new JLabel("Ticket");
            ticketLabel.setBounds(200, 10, 200, 100);
            ticketLabel.setFont(new Font("Serif", Font.BOLD, 20));
            panel.add(ticketLabel);

            JLabel fNameLabel = new JLabel("First Name: ");
            fNameLabel.setBounds(50, 100, 100, 60);
            JLabel fname = new JLabel();
            fname.setBounds(150, 100, 120, 60);
            fname.setText(passenger.getFirstName());

            JLabel lNameLabel = new JLabel("Last Name: ");
            lNameLabel.setBounds(50, 150, 100, 60);
            JLabel lname = new JLabel();
            lname.setBounds(150, 150, 120, 60);
            lname.setText(passenger.getLastname());

            JLabel departureLabel = new JLabel("From: ");
            departureLabel.setBounds(50, 200, 100, 60);
            JLabel departure = new JLabel();
            departure.setBounds(120, 200, 100, 60);
            departure.setText(passenger.getDeparture());

            JLabel destinationLabel = new JLabel("To: ");
            destinationLabel.setBounds(50, 250, 100, 60);
            JLabel destination = new JLabel();
            destination.setBounds(120, 250, 100, 60);
            destination.setText(passenger.getDestination());

            JLabel noAdultsLabel = new JLabel("Adults: ");
            noAdultsLabel.setBounds(50, 300, 100, 60);
            JLabel adults = new JLabel();
            adults.setBounds(120, 300, 100, 60);
            adults.setText(passenger.getNoOfAdults());

            JLabel noChildrenLabel = new JLabel("Children: ");
            noChildrenLabel.setBounds(50, 350, 100, 60);
            JLabel children = new JLabel();
            children.setBounds(120, 350, 100, 60);
            children.setText(passenger.getNoOfChildren());

            JLabel bookingLabel = new JLabel("Booking Date: ");
            bookingLabel.setBounds(50, 400, 100, 60);
            JLabel booking = new JLabel();
            booking.setBounds(150, 400, 125, 60);
            booking.setText(passenger.getBookingDate());

            JLabel bookLabel = new JLabel("Booking time: ");
            bookLabel.setBounds(50, 450, 100, 60);
            JLabel book = new JLabel();
            book.setBounds(150, 450, 100, 60);
            book.setText(passenger.getBookingTime());

            JLabel classLabel = new JLabel("Class: ");
            classLabel.setBounds(50, 500, 100, 60);
            JLabel classFlight = new JLabel();
            classFlight.setBounds(150, 550, 100, 60);
            classFlight.setText(passenger.getFlightClass());

            JLabel mealLabel = new JLabel("Meal: ");
            mealLabel.setBounds(50, 550, 100, 60);
            JLabel meal = new JLabel();
            meal.setBounds(150, 500, 100, 60);
            meal.setText(passenger.getMeal());

            JLabel lastLabel2 = new JLabel("Booking Confirmed");
            lastLabel2.setBounds(100, 650, 500, 100);
            lastLabel2.setFont(new Font("Serif", Font.BOLD, 20));
            panel.add(lastLabel2);

            JLabel lastLabel3 = new JLabel("Thank You!");
            lastLabel3.setBounds(100, 750, 500, 100);
            lastLabel3.setFont(new Font("Serif", Font.BOLD, 20));
            panel.add(lastLabel3);



            panel.add(fNameLabel);
            panel.add(lNameLabel);
            panel.add(departureLabel);
            panel.add(destinationLabel);
            panel.add(noAdultsLabel);
            panel.add(noChildrenLabel);
            panel.add(bookingLabel);
            panel.add(bookLabel);
            panel.add(classLabel);
            panel.add(mealLabel);

            panel.add(fname);
            panel.add(lname);
            panel.add(departure);
            panel.add(destination);
            panel.add(adults);
            panel.add(children);
            panel.add(booking);
            panel.add(book);
            panel.add(classFlight);
            panel.add(meal);




        }

    }


}


