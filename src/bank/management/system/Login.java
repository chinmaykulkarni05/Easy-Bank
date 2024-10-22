package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{                          //jframe is a swing class, actionlist is used coz when user enter details we need to perform some action
    
    JButton login, signup, clear;                                                    //these button were locally defined, so we now declare them globally in order to access them out of constructor
    JTextField cardTextField;                                          //also defining them globally
    JPasswordField pinTextField;                                       //in order to hide password
    
    Login(){
        
        setTitle("AUTOMATED TELLER MACHINE");                                                //sets title of frame
        
        setLayout(null);                                                                     //swing bydefault has layout, so it is centered, by using null we can now make custom layout
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));       //creating obj of imageicon
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);             //image class is present in awt package
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);                                                      //to change location of image on frame
        add(label);                                                                          //placing jlabel on frame
        
        JLabel text = new JLabel("Welcome to CashCraft");                                    //used to write anything on the frame
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 450, 40);                                                    //setting the size 
        add(text);
        
        JLabel cardno = new JLabel("Card No:");                                              //similarly for carno                     
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120, 150, 150, 30);                                               
        add(cardno);
        
        cardTextField = new JTextField();                                         //creating box in front 
        cardTextField.setBounds(300, 150, 230, 30);
        cardTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(cardTextField);
        
        JLabel pin = new JLabel("Pin");                                                      //similarly for pin                                      
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120, 220, 250, 30);                                              
        add(pin);
        
        pinTextField = new JPasswordField();                   
        pinTextField.setBounds(300,220,230,30);
        pinTextField.setFont(new Font("Arial", Font.BOLD, 14));
        add(pinTextField);        
        
        login  = new JButton("SIGN IN");                                              //creating sign in buttons
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);                                                     //changing bg color
        login.setForeground(Color.WHITE);                                                     //changing foreground color
        login.addActionListener(this);                                                        //in order to perform action when clicked
        add(login);
        
        clear  = new JButton("CLEAR");                                                //clear button                                    
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);                                                     
        clear.setForeground(Color.WHITE);    
        clear.addActionListener(this);
        add(clear);
        
        signup  = new JButton("SIGN UP");                                                //clear button                                    
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);                                                     
        signup.setForeground(Color.WHITE);  
        signup.addActionListener(this);
        add(signup);
        
        
        getContentPane().setBackground(Color.WHITE);                                          //taking entire frame and changing its colour to white
        
        setSize(800,480);                                                                    //sets len & bredth of frame                  
        setVisible(true);                                                                    //initially frame is not visible to user
        setLocation(350,200);                                                                //it is opening in top left corner coz bydefault origin, so we change it to approx centre        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){                                            //overriding method of actionlistener interface
        if (ae.getSource()== clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }
        else if(ae.getSource()==login){
            Conn conn = new Conn();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"'and pin = '"+pinnumber+"'";             //query for data retrieving 
            try{
                ResultSet rs = conn.s.executeQuery(query);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
                }
            }
            catch(Exception e){  
            }
        }
        else if(ae.getSource()== signup){
            setVisible(false);                                       //when user clicks on signup, the current form should be closed 
            new SignupOne().setVisible(true);                       //first create obj of signupone class , and page of sign should be opened, bydefault value is false , so after setting it as true then it is visible
        }  
    }
    
    public static void main (String[] args){   
        new Login();   
    }
}
