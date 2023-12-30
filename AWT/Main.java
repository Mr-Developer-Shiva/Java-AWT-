import java.awt.*;
import java.awt.event.*;
//Text field in java AWT
class app extends Frame{
    public app(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);


        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
public class Main {
    public static void main(String[] args){

    }
}

