/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.convertidor;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener.*;
import java.util.HashSet;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Convertidor extends JFrame implements ActionListener{
    private JLabel lb1,lba ,lbb , lbc ,lbd;
    private JTextField txt1 ,txta ,txtb ,txtc , txtd;
    private JButton b1 , b2;
    
    public Convertidor(){
        setTitle("Convertidor");
        setLayout(null);
       //Texto 
    lb1 = new JLabel("INTRODUCE EL NUMERO DE PIES");
    lb1.setBounds(100,10 ,200, 50);
    add(lb1);
    
    //JTextField
    txt1 = new JTextField("");
    txt1.setBounds(90, 50 , 200, 30);
    add(txt1);
    
    //JButton Convertir y salir
    b1 = new JButton ("CONVERTIR");
    b1.setBounds(140 , 100, 100 , 30);
    add(b1);
    b1.addActionListener(this);
    
    b2 = new JButton("CERRAR");
    b2.setBounds(140 , 350 ,100 , 30 );
    add(b2);
    b2.addActionListener(this);
            
    //Yardas 
    lba = new JLabel("YARDAS");
    lba.setBounds(10 , 150 , 50 , 30);
    add(lba);
    
    txta = new JTextField("");
    txta.setBounds(70 , 150 , 150 , 30);
    add(txta);
    
    //Pulgadas
    lbb = new JLabel("PULGADAS");
    lbb.setBounds(10,200, 80 , 30);
    add(lbb);
    
    txtb = new JTextField("");
    txtb.setBounds(80 , 200 , 150 , 30 );
    add(txtb);
    
    //METROS
     lbc = new JLabel("METROS");
     lbc.setBounds(10 , 250 , 100, 30);
     add(lbc);
     
     txtc = new JTextField("");
     txtc.setBounds(70 , 250 , 150 ,30);
     add(txtc);
     
     //CENTIMETROS
     lbd = new JLabel ("CENTIMETROS");
     lbd.setBounds(10 , 300 , 100  ,30);
     add(lbd);
     
     txtd = new JTextField("");
     txtd.setBounds(100,300 , 150 , 30 );
     add(txtd);
    
    
    
}

    public void actionPerformed(ActionEvent ae){
        double  a, b ,c ,d ,yar, pul, cm , mt;
        
       if(ae.getSource()==b1){
          
           a = Double.parseDouble(txt1.getText());
           b = Double.parseDouble(txt1.getText());
           c = Double.parseDouble(txt1.getText());
           d = Double.parseDouble(txt1.getText());
           
           yar = a*(1.0)/(3.0);
           pul = b*(12.0)/(1.0);
           mt = c*(1.0)/(3.28);
           cm = d*(1.0)/(0.0328084);
           
           //Mandar a llamar 
           txta.setText(""+yar);
           txtb.setText(""+pul);
           txtc.setText(""+mt);
           txtd.setText(""+cm);
           
           
       }
       
       if(ae.getSource()==b2){
           System.exit(0);
           
       }
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Convertidor panda = new Convertidor();
        panda.setBounds(10, 10 ,400 , 450 );
        panda.setVisible(true);
        panda.setLocationRelativeTo(null);
        panda.setResizable(false);
        panda.setDefaultCloseOperation(EXIT_ON_CLOSE);
         panda.getContentPane().setBackground(Color.ORANGE); 
         panda.setLayout(null);
        
    }
    
}
