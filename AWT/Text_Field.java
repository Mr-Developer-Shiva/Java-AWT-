import java.awt.*;
import java.awt.event.*;
//Text field in java AWT
class apply extends Frame{
    TextField txt;
    Label l1 ,l2 ;

    public apply(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        txt = new TextField();
        txt.setBounds(10,50,250,30);

        l1 = new Label("-----------");
        l1.setBounds(300,50,250,30);

        l2 = new Label("------------");
        l2.setBounds(10,100,250,30);

        add(txt);
        add(l1);
        add(l2);
        
        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
public class Text_Field {
    public static void main(String[] args){
        apply obj  = new apply();
    }
}
