import java.awt.*;
import java.awt.event.*;
//Text field in java AWT
class appList extends Frame{
    List li ;
    Button btn ; 
    Label lbl;

    public appList(){
        super("Siva");
        setSize(1000,600);
        setLayout(null);
        setVisible(true);

        li = new List(1,true);
        li.setBounds(10,50,100,100);
        li.add("Sunday");
        li.add("Monday");
        li.add("Tuesday");
        li.add("Wednesday");
        li.add("Thuesday");
        li.add("Friday");
        li.add("Saturday");

        lbl = new Label("Items");
        lbl.setBounds(200,170,300,30);
        btn = new  Button("Answer");
        btn.setBounds(10,170,100,30);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent we){
                String list[] =  li.getSelectedItems();
                String data = "Selected Items : ";
                for(String x : list){
                    data += x + " ,";
                    lbl.setText(data);
                }
            } 
        });
        add(btn);
        add(lbl);
        add(li);

        //close Button code
        this.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });

    }
}
public class List_In {
    public static void main(String[] args){
        appList al = new appList();
    }
}
