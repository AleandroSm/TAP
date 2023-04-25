package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


class MiListener implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e){
        System.exit(0);
    }
}

public class Forma1 extends JFrame {
    
    JButton jBtn;
    MiListener miListener;
    public Forma1(){
        jBtn = new JButton("Salir");
        miListener = new MiListener();
        jBtn.addActionListener(miListener);
    }

    
    
    
    
}
