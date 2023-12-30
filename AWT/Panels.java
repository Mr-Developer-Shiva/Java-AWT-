import java.awt.*;
import java.awt.event.*;
//Text field in java AWT
class appPanel extends Frame{
    public appPanel(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        Panel p = new Panel();
        p.setBackground(Color.BLUE);
        p.setBounds(40,80,200,200);

        Button b1 = new Button("Click");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.RED);
        Button b2 = new Button("Click");
        b2.setBounds(100,100,80,30);
        b2.setBackground(Color.RED);

        p.add(b2);
        p.add(b1);
        add(p);
        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
public class Panels {
    public static void main(String[] args){
    appPanel a = new appPanel(); 
    }
}

