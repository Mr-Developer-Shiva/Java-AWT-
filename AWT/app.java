import java.awt.*;
import java.awt.event.*;
class MyApp extends Frame implements ActionListener{
    Button btn;
    Label lbl ;
    public MyApp(){
        super("Shiva");
        setSize(700,500);           //width , height
        setLayout(null);

        btn = new Button("Click me");
        btn.setBounds(300,200,200,50);      //x , y , w , h 
        add(btn);
        btn.addActionListener(this);
        lbl = new Label("*");
        lbl.setBounds(300,300,200,50);
        add(lbl);

        setVisible(true);

        //Close button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        lbl.setText("Button Clicked");

        }
}
public class app{
    public static void main(String [] args){
        MyApp frame = new MyApp();
    }
}