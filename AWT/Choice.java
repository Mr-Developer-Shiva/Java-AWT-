import java.awt.*;
import java.awt.event.*;
// Choice in java awt
class helloChoice extends Frame{
    Label l ; 
    Button b ;
    Choice cho ;

    public helloChoice(){
        super("Hello World");
        setVisible(true);
        setSize(1000,600);
        setLayout(null);

        cho = new Choice();
        cho.setBounds(10,50,100,100);
       
        cho.add("c");
        cho.add("c++");
        cho.add("Java");
        cho.add("Python");

        l = new Label("Visible");
        l.setBounds(10,70,300,30);

        b= new Button("Show Details");
        b.setBounds(120,50,100,20);  
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String data = "Programming language selected : "+cho.getItem(cho.getSelectedIndex());
                l.setText(data);
            }
        });
        add(b);
        add(l);
        add(c);
        //code close
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0); 
            }
        });

    }
    public void actionPerformed(ActionEvent we){

    }
}

public class Choice{
    public static void main(String[] args){
    
        }
}
