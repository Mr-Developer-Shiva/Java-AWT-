import java.awt.*;
import java.awt.event.*;
//Basic addition Program in java AWT
class app3 extends Frame implements ActionListener{
    Label  l1 , l2 ,l3;
    TextField txt1 , txt2;
    Button b ;

    public app3(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        l1 = new Label("Enter Value 1 : ");
        l1.setBounds(10,50,100,30);
        txt1 = new TextField();
        txt1.setBounds(150,50,250,30);

        l2 = new Label("Enter Value 2 : ");
        l2.setBounds(10,100,100,30);
        txt2 = new TextField();
        txt2.setBounds(150,100,250,30);

        b = new Button("Click Me");
        b.setBounds(150,150,100,30);
        b.addActionListener(this);

        l3 = new Label("----------");
        l3.setBounds(10,200,300,30);

        add(l1);
        add(l2);
        add(l3);
        add(b);
        add(txt2);
        add(txt1);
        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
      public void actionPerformed(ActionEvent e){
            String s1 = txt1.getText();
            String s2 = txt2.getText();

            if(s1.isEmpty() || s2.isEmpty()){
                l3.setText("Enter a Number");
            }else{
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a + b;
                String total = String.valueOf(c);
                l3.setText("Result : " + total);
            }
    }
}
public class Additon {
    public static void main(String[] args){
        app3 obj = new app3();
    }
}


