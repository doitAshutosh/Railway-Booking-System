import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
public class Booking {
    public static void main(String[] args) {
        // store the url ,username,password in string object the database
        String url = "jdbc:mysql://localhost:3307/railwaybookingdb";
        String username = "root";
        String password = "";
        // create a connection object
    
        try (Connection connection = DriverManager.getConnection(url,username,password)) {
            System.out.println("database connected");

            JFrame frame = new JFrame("Railway Booking System");
            frame.setBackground(Color.GRAY);

            JLabel personLabel = new JLabel("PersonalDetails");
            personLabel.setBounds(10, 10, 120, 20);
            frame.add(personLabel);

            JLabel ticketDetaiLabel = new JLabel("Ticket Details");
            ticketDetaiLabel.setBounds(310, 10, 120, 30);
            frame.add(ticketDetaiLabel);

            JLabel usernameLabel = new JLabel("Username");
            usernameLabel.setBounds(310, 10, 120, 30);
            frame.add(usernameLabel);

            JTextField usernameTextField = new JTextField();
            usernameTextField.setBounds(130, 40, 120, 30);
            frame.add(usernameTextField);

            JLabel dateOfJourneyLabel = new JLabel("Date of journey");
            dateOfJourneyLabel.setBounds(310, 40, 120, 30);
            frame.add(dateOfJourneyLabel);

            JTextField dateOfJourneyTextField = new JTextField();
            dateOfJourneyTextField.setBounds(430, 50, 120, 30);
            frame.add(dateOfJourneyTextField);

            JLabel ageLabel = new JLabel("Age");
            ageLabel.setBounds(310, 10, 120, 30);
            frame.add(ageLabel);

            JTextField ageTextField = new JTextField();
            ageTextField.setBounds(130, 40, 120, 30);
            frame.add(ageTextField);

            JLabel genderLabel = new JLabel("Gender");
            genderLabel.setBounds(310, 10, 120, 30);
            frame.add(genderLabel);

            JTextField genderTextField = new JTextField();
            genderTextField.setBounds(130, 40, 120, 30);
            frame.add(genderTextField);

            JLabel sourceLabel = new JLabel("Source");
            sourceLabel.setBounds(310, 10, 120, 30);
            frame.add(sourceLabel);

            JTextField sourceTextField = new JTextField();
            sourceTextField.setBounds(130, 40, 120, 30);
            frame.add(sourceTextField);

            JLabel destinationLabel = new JLabel("Destination");
            destinationLabel.setBounds(310, 10, 120, 30);
            frame.add(destinationLabel);

            JTextField destinationTextField = new JTextField();
            destinationTextField.setBounds(130, 40, 120, 30);
            frame.add(destinationTextField);

            JLabel ticketLabel = new JLabel("Ticket Price");
            ticketLabel.setBounds(310, 10, 120, 30);
            frame.add(ticketLabel);

            JTextField ticketTextField = new JTextField();
            ticketTextField.setBounds(130, 40, 120, 30);
            frame.add(ticketTextField);

            JLabel seatLabel = new JLabel("Seat Preference");
            usernameLabel.setBounds(310, 10, 120, 30);
            frame.add(seatLabel);

            JTextField seatTextField = new JTextField();
            seatTextField.setBounds(130, 40, 120, 30);
            frame.add(seatTextField);


            frame.setLayout(null);
            frame.setSize(600, 500);
            frame.setVisible(true);
            //                           DELETE the data fom table
            /*String deleteQuery = "DELETE FROM ticketbookingtb WHERE bookingid=?";
            PreparedStatement stat = connection.prepareStatement(deleteQuery);
            stat.setInt(1, 1);
            System.out.println("One Record is Deleted");
            stat.execute();*/

            //                              CREATE add the booking info
            /* String insertQuery = "INSERT INTO ticketbookingtb(Username,Age,Gender,Mobilennumber,Email,DOJ,Source,Destination,TicketPrice,SeatPreference) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(insertQuery);
            stat.setString(1, "arniket");
            stat.setInt(2, 22);
            stat.setString(3, "male");
            stat.setString(4, "880858828");
            stat.setString(5, "chotachetan@gmail.com");
            stat.setString(6, "02/08/2024");
            stat.setString(7, "patna");
            stat.setString(8, "noida");
            stat.setString(9, "3000");
            stat.setString(10, "lower berth");
            stat.execute();
            System.out.println("Your Ticket is booked");*/
            //                              UPDATE the data from table
            String updateQuery = "UPDATE ticketbookingtb SET Username=? where Bookingid = ?";
            PreparedStatement stat = connection.prepareStatement(updateQuery);
            stat.setString(1, "Ram");
            stat.setInt(2, 2);
            stat.execute();
            System.out.println("Record is updated");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
    }
}
