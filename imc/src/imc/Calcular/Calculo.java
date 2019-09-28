/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc.Calcular;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Thiago
 */
public class Calculo extends JFrame implements ActionListener {
    private static final JTextField valor1 = new JTextField() ;
    private static final JTextField valor2 = new JTextField();
    private static final JButton resp = new JButton("Resultado");
    
    public static void main (String args[]){
        
        Calculo frame = new Calculo();
        Container cont = frame.getContentPane();
        cont.setLayout(new FlowLayout());
        frame.setSize(700,100);
        frame.setLocation(1024/3,768/2); 
        valor1.setColumns(10);
        valor2.setColumns(10);
        cont.add(valor1);
        cont.add(valor2);
        cont.add(resp);
        resp.addActionListener(frame);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==resp){
       double resultado = 
                   this.resp(Double.parseDouble(valor1.getText()),
                   Double.parseDouble(valor2.getText()));
        this.mostraResultado(resultado);}
    }
    public double resp (double x, double y){
        return x/(y*y);
    }
     public void mostraResultado(double x){
        
        if(x<16){
            JOptionPane.showMessageDialog(null, "Magreza Grave");
        }
         if(x>16 && x<17){
            JOptionPane.showMessageDialog(null, "Magreza moderada");
        }
          if(x>17 && x<18.5){
            JOptionPane.showMessageDialog(null, "Magreza leve");
        }
           if(x>18.5 && x<25){
            JOptionPane.showMessageDialog(null, "saudavel");
        }
            if(x>25 && x<30){
            JOptionPane.showMessageDialog(null, "sobrepeso");
        }
             if(x>30 && x<35){
            JOptionPane.showMessageDialog(null, "Obesidade grau 1");
               if(x>35 && x<40){
            JOptionPane.showMessageDialog(null, "Obesidade grau 2 severa");
        }
               }
               if(x>40){
            JOptionPane.showMessageDialog(null, "Obesidade grau 2 Morbida");
        }  
    }
}

    
