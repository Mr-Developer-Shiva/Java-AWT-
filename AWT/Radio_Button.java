//Radio Button in java
import java.awt.*;
import java.awt.event.*;

class apps extends Frame{
    Checkbox c1, c2;
    Label l1,l2;
    CheckboxGroup cbg; 
    public apps(){
        super("Shiva Model");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        cbg  = new CheckboxGroup();

            c1 = new Checkbox("Male" ,cbg, false);
            c1.setBounds( 10 ,50,250,30);
            l1 = new Label("Not selected");
            l1.setBounds(300,50,600,30);

            c2 = new Checkbox("Female" , cbg, false);
            c2.setBounds(10,100,250,30);
            l2 = new Label("Not Selected");
            l2.setBounds(300,100,600,30);
            
            c1.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e){
                    l1.setText(e.getStateChange()==1 ? "Checked" : "Un Checked");
                    l2.setText("Un Checked");
                }
            });
            c2.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e){
                    l2.setText(e.getStateChange()==1 ? "Checked" : "Un Checked");
                    l1.setText("Un Checked");
                }
            });

            add(c1);
            add(l1);

            add(c2);
            add(l2);



        //Closed Button
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }
    
}
public class Radio_Button {
    public static void main(String [] args){
        apps frm = new apps();
    }
}
