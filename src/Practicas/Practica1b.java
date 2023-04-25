package Practicas;


import java.awt.event.*;
import javax.swing.*;

public class Practica1b extends JFrame implements ActionListener {
    
    JLabel lb1;
    JButton btn;
    JTextField input;
    
    public Practica1b(){
        setLayout(null);
        lb1 = new JLabel("Escribe un nombre para saludar");
        lb1.setBounds(90,20,300,30);
        add(lb1);
        input = new JTextField("");
        input.setBounds(110,100,160,30);
        add(input);
        btn = new JButton("Saludar");
        btn.setBounds(110,150,160,30);
        add(btn);
        btn.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btn){
            String nombre = input.getText();
            JOptionPane.showMessageDialog(null,"¡Hola " + nombre + "!");
        }
    }
    
    public static void main(String[] args) {
        Practica1b ventana = new Practica1b();
        ventana.setBounds(0, 0, 400, 300);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    
}
