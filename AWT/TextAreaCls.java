import java.awt.*;
import java.awt.event.*;

class OwnApp extends Frame implements ActionListener{
    TextArea t;
    Label l ;   
    TextField tf;
    Button b;

   OwnApp(){
    super("Title");  
    setSize(1000,600);
    setLayout(null);
    setVisible(true);

    t = new TextArea(10,30);        //Rows Columns
    t.setBounds(20,100,300,200);

    l = new Label("******");
    l.setBounds(20,50,100,30);

    tf = new TextField();
    tf.setBounds(20,350,300,30);

    b = new Button("Click me");
    b.setBounds(300,450,200,50);
    b.addActionListener(this);

    add(l);
    add(t);
    add(tf);
    add(b);
    //close code 
    this.addWindowListener (new WindowAdapter(){
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
   }

    public void actionPerformed(ActionEvent event){
       // l.setText(t.getSelectedText());
       //t.append(tf.getText());      //append is String Builder or String Buffer 
        t.insert(tf.getText(),t.getCaretPosition());
    }
}
public class TextAreaCls{
    public static void main(String[] args){
        OwnApp txt = new OwnApp();
    }
}