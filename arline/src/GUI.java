import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.FileWriter;


public class GUI implements ActionListener {

    private static JLabel firstNamelabel, lastNamelabel, departureLabel, destinationLabel, adultLabel, childrenLabel, bookingDateLabel, bookingTimeLabel, classLabel,mealLabel ,passengerDetails;
    private static JTextField firstNameuserText, lastNameuserText;
    private static JComboBox departureCombo, destinationCombo, adultCombo, childrenCombo, classCombo,bookingDateCombo, bookingTimeCombo, mealCombo ;
    private static JButton button;


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);


        String[] sItem1 = { "New York","Florida ", "California ", "Texas ", "Chicago ", "Nevada ", "Ohio ", "Washington ","Georgia " };
        String[] sItem2 = {" ", "New York", "Florida ", "California ", "Texas ", "Chicago ", "Nevada ", "Ohio ", "Washington ","Georgia " };
        String[] sItem3 = { " ", "Economic", "Business","First"};
        String[] sItem4 = { "1", "2", "3", "4", "5", "6" };
        String[] sItem5 = { " ","0", "1", "2", "3", "4" };
        String[] sItem6 = {" ","12/12/2021", "12/13/2021","12/14/2021","12/15/2021","12/19/2021","12/20/2021"};
        String[] sItem7 = {" ","07:45AM","09:25AM","12:20PM","13:45PM","14:57PM","15:25PM","17:20PM"};
        String[] sItem8 = {" ","Non Veg", "Veg","Vegan","Any"};


        passengerDetails = new JLabel("WEL COME TO JAVA O AIR");
        passengerDetails.setBounds(150, 1, 350, 25);
        passengerDetails.setForeground(Color.blue);
        panel.add(passengerDetails);




        firstNamelabel = new JLabel("First Name ");
        firstNamelabel.setBounds(10, 40, 80, 25); // x,y,width,height
        panel.add(firstNamelabel);

        firstNameuserText = new JTextField(20);
        firstNameuserText.setBounds(100, 40, 165, 25);
        panel.add(firstNameuserText);

        lastNamelabel = new JLabel("Last Name ");
        lastNamelabel.setBounds(10, 65, 80, 25);
        panel.add(lastNamelabel);

        lastNameuserText = new JTextField(20);
        lastNameuserText.setBounds(100, 65, 165, 25);
        panel.add(lastNameuserText);

        departureLabel = new JLabel("From");
        departureLabel.setBounds(10, 110, 80, 25);
        panel.add(departureLabel);

        departureCombo = new JComboBox(sItem1);
        departureCombo.setBounds(50, 110, 120, 25);
        panel.add(departureCombo);


        destinationLabel = new JLabel("To");
        destinationLabel.setBounds(200, 110, 80, 25);
        panel.add(destinationLabel);

        destinationCombo = new JComboBox(sItem2);
        destinationCombo.setBounds(230, 110, 125, 25);
        panel.add(destinationCombo);

        adultLabel = new JLabel("Adult(17+)");
        adultLabel.setBounds(10, 150, 80, 25);
        panel.add(adultLabel);

        adultCombo = new JComboBox(sItem4);
        adultCombo.setBounds(10, 175, 80, 25);
        panel.add(adultCombo);

        childrenLabel = new JLabel("Children(0-17)");
        childrenLabel.setBounds(150, 150, 100, 25);
        panel.add(childrenLabel);

        childrenCombo = new JComboBox(sItem5);
        childrenCombo.setBounds(150, 175, 80, 25);
        panel.add(childrenCombo);

        bookingDateLabel = new JLabel("Booking Date");
        bookingDateLabel.setBounds(10, 225, 100, 25);
        panel.add(bookingDateLabel);

        bookingDateCombo = new JComboBox(sItem6);
        bookingDateCombo.setBounds(120, 225, 125, 25);
        panel.add(bookingDateCombo);

        bookingTimeLabel = new JLabel("Booking Time");
        bookingTimeLabel.setBounds(260, 225, 100, 25);
        panel.add(bookingTimeLabel);

        bookingTimeCombo = new JComboBox(sItem7);
        bookingTimeCombo.setBounds(350, 225, 125, 25);
        panel.add(bookingTimeCombo);

        classLabel = new JLabel("Class");
        classLabel.setBounds(10, 275, 80, 25);
        panel.add(classLabel);

        classCombo = new JComboBox(sItem3);
        classCombo.setBounds(60, 275, 125, 25);
        panel.add(classCombo);

        mealLabel = new JLabel("Meal");
        mealLabel.setBounds(10, 325, 100, 25);
        panel.add(mealLabel);

        mealCombo = new JComboBox(sItem8);
        mealCombo.setBounds(80, 325, 125, 25);
        panel.add(mealCombo);



        button = new JButton("Confirm Booking");
        button.setBounds(150, 400, 175, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        panel.setBackground(Color.lightGray);

        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String FirstName = firstNameuserText.getText();
        String LastName = lastNameuserText.getText();
        String departure = (String) departureCombo.getSelectedItem();
        String destination = (String) destinationCombo.getSelectedItem();
        String noOfAdults = (String) adultCombo.getSelectedItem();
        String noOfChildren = (String) childrenCombo.getSelectedItem();
        String bookingDate = (String) bookingDateCombo.getSelectedItem();
        String bookingTime = (String) bookingTimeCombo.getSelectedItem();
        String flightClass = (String) classCombo.getSelectedItem();
        String meal= (String) mealCombo.getSelectedItem();





        Passenger passenger = new Passenger(FirstName, LastName, departure, destination, noOfAdults, noOfChildren, bookingDate,bookingTime, flightClass,meal);
        JFrame jFrame = new JFrame();
        jFrame.setVisible(false);
        FlightTicket flt = new FlightTicket(passenger);
        flt.showFrame();

    }

}
