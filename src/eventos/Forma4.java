package eventos;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Forma4 extends JFrame{
    
    JButton jBtn;
    public Forma4(){
        jBtn = new JButton("Salir");
        jBtn.addMouseListener(
                new MouseAdapter(){
                    public void mouseClicked(MouseEvent e){
                        System.exit(0);
                    }
                }
        );
    }
    
}
