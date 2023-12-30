import java.awt.*;
import java.awt.event.*;

//Program to count Words and character in java AWT
class coun extends Frame implements ActionListener{

    Label l1 , l2;
    Button b ; 
    TextArea ta;

    public coun(){
        super("My Title");
        setSize(1000,600);
        setVisible(true);
        setLayout(null);

        l1 = new Label("------");
        l1.setBounds(20,30,200,20);
        l2 = new Label("-------");
        l2.setBounds(20,60,200,20);
        
        b = new Button("Click");
        b.setBounds(20,320,100,30);
        b.addActionListener(this);

        ta = new TextArea(10,30);
        ta.setBounds(20,100,300,200);

            add(l1);
            add(l2);
            add(b);
            add(ta);

            //close code
            this.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent we){
                    System.exit(0);
                }
            });

    }

    public void actionPerformed(ActionEvent e){
        String str = ta.getText();
        String word[] = str.split("\\s");
        l1.setText("Word : " + word.length);
        l2.setText("Character : " + str.length());
    }
}

public class Count {
    public static void main(String[] arg){
        coun c = new coun()
;    }
}
