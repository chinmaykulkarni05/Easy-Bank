package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;



public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, dobTextField, emailTextField,addressTextField, cityTextField, stateTextField, pinTextField;       //declaring global 
    JButton next;                                              //making global
    JRadioButton male,female,other,married,unmarried;          //making global
    JDateChooser dateChooser;                                  //making global
            
    SignupOne(){                                                                 //creating constructor
        
        
        setLayout(null);
        
        Random ran = new Random();                                               //using random class to generate random nums
        random = Math.abs(ran.nextLong() %9000L) + 1000L;                        //using .abs to only get positive numbers
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random );            //rand num gen previously is concated here
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personDetails = new JLabel("Page 1 : Personal Details");            
        personDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        
        JLabel name = new JLabel("Name:");            
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100,140,100,30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300,140,400,30);                                 //setting txt field on the frame
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name:");            
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100,190,200,30);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300,190,400,30);                                 //setting txt field on the frame
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");            
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        dateChooser = new JDateChooser();                          //first import jar file , then import JDateChooser class 
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender:");            
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,290,200,30);
        add(gender);
        male = new JRadioButton("Male");                           //radio button for male
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        female = new JRadioButton("Female");                       //radio button for female
        female.setBounds(450, 290, 120, 30);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup gendergroup = new ButtonGroup();                            //for only selecting anyone of them
        gendergroup.add(male);
        gendergroup.add(female);
        
        
        JLabel email = new JLabel("Email Address:");            
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,340,200,30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300,340,400,30);                                 //setting txt field on the frame
        add(emailTextField);
        
        
        JLabel marital = new JLabel("Marital Status:");            
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,390,200,30);
        add(marital);
        married = new JRadioButton("Married");                      //radio buttons for married
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        unmarried = new JRadioButton("Unmarried");                  //radio buttons for unmarried
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        other = new JRadioButton("Other");                          //radio buttons for other
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        ButtonGroup maritalgroup = new ButtonGroup();                            //for only selecting anyone of them
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        JLabel address = new JLabel("Address:");            
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,440,200,30);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300,440,400,30);                                 //setting txt field on the frame
        add(addressTextField);
        
        
        JLabel city = new JLabel("City:");            
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,490,200,30);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300,490,400,30);                                 //setting txt field on the frame
        add(cityTextField);
        
        
        JLabel state = new JLabel("State:");            
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,540,200,30);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300,540,400,30);                                 //setting txt field on the frame
        add(stateTextField);
        
        
        JLabel pincode = new JLabel("Pin Code:");            
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300,590,400,30);                                 //setting txt field on the frame
        add(pinTextField);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);                                           //pop up , if name field is empty
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);                                                        //creating frame
        setLocation(350,10);                                                     //setting the frame location
        setVisible(true);                                                        //bydefault it is false
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;                     //here form num is long, we need to convert it to string
        String name = nameTextField.getText();         //setText sim as getText
        String fname = fnameTextField.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if (female.isSelected()){
            gender = "Female";
        }
        
        String email = emailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital = "Married";
        }
        else if (unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if (other.isSelected()){
            marital = "Other";
        }
        
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
        
        try{
            if(name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");           //pop up, if user has not entered name field, similary u can create for other fields
            }
            else{
                Conn c = new Conn();                                              //creating obj of Conn class
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marital+"','"+address+"', '"+city+"', '"+pin+"', '"+state+"')";               //inserting data in sql tables
                c.s.executeUpdate(query);                          //s is created in Conn class
                
                setVisible(false);                                               //note : this formno works as primary key
                new SignupTwo(formno).setVisible(true);                        //creating obj of signuptwo class, when user clicks on next , this page should be closed and signuptwo should be opened
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void main(String [] args){
        new SignupOne();
        
    }
    
}
