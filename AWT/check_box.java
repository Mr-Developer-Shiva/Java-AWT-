import java.awt.*;
import java.awt.event.*;
//check box in AWT 
class MyApp1 extends Frame {
    Label l1,l2,l3;
    Checkbox c1,c2,c3;

        public MyApp1(){

            super("kumar");
            setLayout(null);
            setSize(1000,600);
            setVisible(true);

            c1 = new Checkbox("C - Programm");
            c1.setBounds(10, 50, 250, 30);
            l1 = new Label("Not Selected");
            l1.setBounds(300,50,600,30);

            c2 = new Checkbox("C++ - Program");
            c2.setBounds(10, 100, 250, 30);
            l2 = new Label("Not Selected");
            l2.setBounds(300,100,600,30);

            c3 = new Checkbox("Java - Programm");
            c3.setBounds(10, 150, 250, 30);
            l3 = new Label("Not Selected");
            l3.setBounds(300,150,600,30);

            add(c1);
            add(l1);

            add(c2);
            add(l2);

            add(c3);
            add(l3);


            c1.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent e){
                    l1.setText(e.getStateChange()==1 ? "Checked" : "Un checked");
                }
            });
             c2.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent e){
                    l2.setText(e.getStateChange()==1 ? "Checked" : "Un checked");
                }
            });
             c3.addItemListener(new ItemListener(){
                public void itemStateChanged(ItemEvent e){
                    l3.setText(e.getStateChange()==1 ? "Checked" : "Un checked");
                }
            });

        //Close button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });

    }


   
}
public class check_box{
    public static void main(String [] args){
        MyApp1 frame = new MyApp1();
    }
}
