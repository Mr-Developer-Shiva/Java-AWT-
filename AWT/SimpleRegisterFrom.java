import java.awt.event.*;
import java.awt.*;

//Simple Registeration From in java  

class Register extends Frame{
         Label lTitle , lName , lFather, lAge , lGender , lCourse , lHoppies ,lAddress;
        TextField txtName , txtAge ,txtFather;
        TextArea txtArea;
        Choice course;
        Checkbox cMale , cFemale , h1 , h2 ,h3 , h4;
        Button btnSave , btnClear;
    public Register(){
        super("Register Form");
        setSize(1000,600);
        setVisible(true);
        setLayout(null);
        Color fColor = new Color(53,59,72);
        setBackground(fColor);

      Font titleFont = new Font("Arial",Font.BOLD,25);
      Font labelFont = new Font("arial",Font.PLAIN,18);
      Font txtFont = new Font("arial",Font.PLAIN,15);

        lTitle = new Label("Registertion From");
        lTitle.setBounds(250,40,300,50);
        lTitle.setFont(titleFont);
        lTitle.setForeground(Color.YELLOW);
        add(lTitle);

        lName = new Label("Name");
        lName.setBounds(250,80,150,50);
        lName.setFont(labelFont);
        lName.setForeground(Color.WHITE);
        add(lName);

        lFather = new Label("Father Name");
        lFather.setBounds(250,120,150,50);
        lFather.setForeground(Color.WHITE);
        lFather.setFont(labelFont);
        add(lFather);
        
        lAge = new Label("Age");
        lAge.setBounds(250,160,150,50);
        lAge.setFont(labelFont);
        lAge.setForeground(Color.WHITE);
        add(lAge);
         
        lGender = new Label("Gender");
        lGender.setBounds(250,200,150,50);
        lGender.setFont(labelFont);
        lGender.setForeground(Color.WHITE);
        add(lGender);
        
        //Closing Button
        this.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent ew ){
            System.exit(0);
        }
     });
    }

   
} 
public class SimpleRegisterFrom {
    public static void main(String[] args){
        Register form = new Register();

    }
}
