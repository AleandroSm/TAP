package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Forma2 extends JFrame implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
    JButton jBtn;
    public Forma2(){
        jBtn =  new JButton("Salir");
        jBtn.addActionListener(this);
    }
    
}
