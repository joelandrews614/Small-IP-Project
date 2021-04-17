


import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;


public class Main{
    public static void main(String[] args){
        new App();
    }
}

class App extends JFrame implements ActionListener{

    JTextField text1;
    JButton button1;
    JLabel label0;
    JLabel label1;

    public App(){

        text1 = new JTextField();
        label0 = new JLabel("Enter a Website Domain Name");
        label1 = new JLabel();
        button1 = new JButton("Find IP");

        label0.setBounds(160,10,300,50);

        text1.setBounds(170,50,150,20);
        
        label1.setBounds(150,100,250,20);

        button1.setBounds(200,150,95,30);
        button1.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        setLayout(null);
        setTitle("Joel's App");

        add(text1);add(button1);add(label0);add(label1);

    }

    public void actionPerformed(ActionEvent e){
        try{
            String host = text1.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            
            label1.setText("IP of " + host + " is : " + ip);

        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }
    }
}