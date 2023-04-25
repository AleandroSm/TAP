
package eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Forma3 extends JFrame {
    
    JButton jBtn;
    public Forma3(){
        jBtn = new JButton("Salir");
        jBtn.addActionListener(
                new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            }
        );
    }
    
}
